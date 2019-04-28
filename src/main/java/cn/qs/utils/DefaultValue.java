package cn.qs.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 默认值
 * 
 * @author Administrator
 *
 */
public class DefaultValue {

	/**
	 * 每页数量
	 */
	public static final int PAGE_SIZE = 6;

	/**
	 * 移动端token的默认失效时间
	 */
	public static final int TOKEN_DEFAULT_TIME = 2;

	/**
	 * 身体位置
	 */
	public static final List<String> BODY_LOCATIONS = new ArrayList<String>();

	/**
	 * BMI基数范围
	 */
	public static final List<String> BMI_VALUES = new ArrayList<String>();

	/**
	 * 完成情况
	 */
	public static final List<String> FINISH_DATAILS = new ArrayList<String>();

	/**
	 * 食物热量表
	 */
	public static final Map<String, Object> FOODS_HEAT = new HashMap<String, Object>();

	/**
	 * 食物热量表(提取过的)
	 */
	public static final Map<String, String> FOOD_HEAT = new HashMap<String, String>();

	/**
	 * 运动系数
	 */
	public static final Map<String, Float> SPORT_K = new HashMap<String, Float>();

	static {
		BODY_LOCATIONS.add("*");
		BODY_LOCATIONS.add("脸部");
		BODY_LOCATIONS.add("臀部");
		BODY_LOCATIONS.add("腿部");
		BODY_LOCATIONS.add("上身");

		BMI_VALUES.add("*");
		BMI_VALUES.add("0-18.4");
		BMI_VALUES.add("18.5-23.9");
		BMI_VALUES.add("24.0-27.9");
		BMI_VALUES.add("28.0-100000");

		FINISH_DATAILS.add("未开始");
		FINISH_DATAILS.add("进行中");
		FINISH_DATAILS.add("已完成");

		SPORT_K.put("健走", 0.824F);
		SPORT_K.put("跑步", 1.036F);
		SPORT_K.put("骑车", 0.6142F);

		// 初始化食物介绍
		initFoodsParam();
	}

	private static void initFoodsParam() {
		FOODS_HEAT.put("紫薯营养粥-317 大卡(每100克)", "317/100");
		FOODS_HEAT.put("大米-317 大卡(每100克)", "317/100");
		FOODS_HEAT.put("面条-301 大卡(每100克)", "301/100");
		FOODS_HEAT.put("面包-313 大卡(每100克)", "313/100");

		for (String food : FOODS_HEAT.keySet()) {
			FOOD_HEAT.put(food.substring(0, food.indexOf("-")), (String) FOODS_HEAT.get(food));
		}
	}

}
