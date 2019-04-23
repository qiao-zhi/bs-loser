package cn.qs.controller.common;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;

import cn.qs.controller.user.UserLosePlanController;
import cn.qs.service.user.UserService;
import cn.qs.utils.DefaultValue;

/**
 * 减肥套餐管理
 * 
 * @author Administrator
 *
 */
@Controller
@RequestMapping("losePlan")
public class LosePlanController {
	private static final Logger logger = LoggerFactory.getLogger(LosePlanController.class);

	@Autowired
	private UserService userService;

	/**
	 * 跳转到显示列表
	 * 
	 * @return
	 */
	@RequestMapping("/list")
	public String list() {
		return "losePlan/list";
	}

	/**
	 * 跳转到添加列表
	 * 
	 * @return
	 */
	@RequestMapping("/add")
	public String add(ModelMap map) {
		map.put("bodys", DefaultValue.BODY_LOCATIONS);
		map.put("bmis", DefaultValue.BMI_VALUES);
		return "losePlan/add";
	}
}
