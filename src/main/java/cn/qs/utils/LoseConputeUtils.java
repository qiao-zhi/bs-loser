package cn.qs.utils;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.lang.math.FloatRange;
import org.apache.commons.lang.math.NumberUtils;
import org.apache.commons.lang3.StringUtils;

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

}
