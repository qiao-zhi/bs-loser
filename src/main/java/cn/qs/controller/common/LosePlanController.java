package cn.qs.controller.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.qs.controller.user.UserLosePlanController;
import cn.qs.service.user.UserService;

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
	public String add() {
		return "losePlan/add";
	}
}
