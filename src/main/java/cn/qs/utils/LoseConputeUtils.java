package cn.qs.utils;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.math.FloatRange;
import org.apache.commons.lang.math.NumberUtils;
import org.apache.commons.lang3.StringUtils;

import cn.qs.bean.common.Video;
import cn.qs.bean.user.DietStepRecord;
import cn.qs.bean.user.UserHealthInfo;
import cn.qs.service.user.RecommandService;
import cn.qs.service.user.UserHealthService;

/**
 * 计算BMI基数和根据基数计算体型的工具类
 * 
 * @author Administrator
 *
 */
public class LoseConputeUtils {

	private LoseConputeUtils() {
	}

	private static final Map<String, String> BMI_INFOS = new HashMap<String, String>();

	static {
		initBmiInfoMap();
	}

	/**
	 * 计算BMI(取两位小数),计算公式:体重/身高/身高
	 * 
	 * @param weight
	 *            体重:kg
	 * @param height
	 *            身高:m
	 * @return
	 */
	public static Float computeBMI(Float weight, Float height) {
		DecimalFormat format = new DecimalFormat("0.00");
		return NumberUtils.toFloat(format.format(weight / height / height));
	}

	/**
	 * 根据BMI计算体型
	 * 
	 * @param bmi
	 *            bmi基数值
	 * @return
	 */
	public static String computeHealthStrByMBI(Float bmi) {
		Set<Entry<String, String>> entrySet = BMI_INFOS.entrySet();
		for (Entry<String, String> entry : entrySet) {
			String value = StringUtils.defaultString(entry.getValue(), "0-0");
			String[] numbers = value.split("-");
			FloatRange floatRange = new FloatRange(Float.valueOf(numbers[0]), Float.valueOf(numbers[1]));
			if (floatRange.containsFloat(bmi)) {
				return entry.getKey();
			}
		}

		return "未知";
	}

	private static void initBmiInfoMap() {
		BMI_INFOS.put("偏瘦", "0-18.4");
		BMI_INFOS.put("正常", "18.5-23.9");
		BMI_INFOS.put("偏重", "24.0-27.9");
		BMI_INFOS.put("肥胖", "28.0-100000");
	}

	public static void main(String[] args) {
		String computeHealthStrByMBI = computeHealthStrByMBI(24.5F);
		System.out.println(computeHealthStrByMBI);
	}

	/**
	 * 计算摄入热量和消耗热量
	 * 
	 * @param dietStepRecord
	 */
	public static void setSportsHeatAndDietsHeats(DietStepRecord dietStepRecord, HttpServletRequest request) {
		DecimalFormat numberFormat = new DecimalFormat("0.00");

		// 1. 计算摄入热量
		Float totalHeats = 0F;
		String diets = dietStepRecord.getDiets();
		if (StringUtils.isNotBlank(diets)) {
			String[] split = diets.split(",");
			for (String s : split) {
				String[] split2 = s.split("-");
				String foodName = split2[0];
				Float eated = NumberUtils.toFloat(split2[1]);// 摄入量
				String string = DefaultValue.FOOD_HEAT.get(foodName);
				String[] split3 = string.split("/");
				Float heat1 = NumberUtils.toFloat(split3[0]);
				Float unit = NumberUtils.toFloat(split3[1]);

				Float total = eated / unit * heat1;
				totalHeats += total;
			}
		}
		dietStepRecord.setDietsheat(numberFormat.format(totalHeats) + "卡路里");

		// 2.计算运动消耗热量
		// 2.1 获取用户的体重
		String loginUsername = SystemUtils.getLoginUsername(request);
		UserHealthService userHealthService = SpringBootUtils.getBean(UserHealthService.class);
		UserHealthInfo userHealthInfo = userHealthService.findOrCreateUserHealthInfoByUsername(loginUsername);
		Float height = userHealthInfo.getWeight() == null ? 0F : userHealthInfo.getWeight();
		// 2.2计算消耗量
		Float sportsHeats = 0F;
		String sports = dietStepRecord.getSports();
		if (StringUtils.isNotBlank(sports)) {
			String[] split = sports.split(",");
			for (String s : split) {
				String[] split2 = s.split("-");
				String sportName = split2[0];// 运动名称
				Float distance = NumberUtils.toFloat(split2[1]);// 距离
				Float kValue = DefaultValue.SPORT_K.get(sportName);// K值
				Float totalTmp = height * distance * kValue;
				sportsHeats += totalTmp;
			}
		}
		dietStepRecord.setSportsheat(numberFormat.format(sportsHeats) + "卡路里");

		// 3.根据剩余热量和BMI去匹配日推荐视频
		Float plusedHots = sportsHeats - totalHeats;
		if (plusedHots < 0) {
			dietStepRecord.setRecommendvideo("-");
			return;
		}

		RecommandService recommandService = SpringBootUtils.getBean(RecommandService.class);
		Float BMI = userHealthInfo.getHealthRadix() == null ? 0F : userHealthInfo.getHealthRadix();
		Video recommandVideo = recommandService.getRecommandVideos(BMI, plusedHots);
		if (recommandVideo == null) {
			dietStepRecord.setRecommendvideo("-");
			return;
		}

		dietStepRecord.setRecommendvideo(recommandVideo.getPath());
	}
}