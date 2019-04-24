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
	 * 移动端token的更新时间(也就是如果更新时间+当前时间大于预计失效时间就更新token)
	 */
	public static final int TOKEN_UPDATE_TIME = 1;

	public static final List<String> BODY_LOCATIONS = new ArrayList<String>();

	public static final List<String> BMI_VALUES = new ArrayList<String>();

	public static final List<String> FINISH_DATAILS = new ArrayList<String>();

	/**
	 * 食物热量表
	 */
	public static final Map<String, Object> FOODS_HEAT = new HashMap<String, Object>();

	public static final Map<String, Object> SPORT_K = new HashMap<String, Object>();

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

		FOODS_HEAT.put("紫薯营养粥-317 大卡(每100克)", "317");
		FOODS_HEAT.put("大米-317 大卡(每100克)", "317");
		FOODS_HEAT.put("面条-301 大卡(每100克)", "301");
		FOODS_HEAT.put("面包-313 大卡(每100克)", "313");

		SPORT_K.put("健走", 0.824F);
		SPORT_K.put("跑步", 1.036F);
	}

}
