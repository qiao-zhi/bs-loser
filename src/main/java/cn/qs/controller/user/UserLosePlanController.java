package cn.qs.controller.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.qs.service.user.UserService;

/**
 * 个人计划Controller
 * 
 * @author Administrator
 *
 */
@Controller
@RequestMapping("userLosePlan")
public class UserLosePlanController {

	private static final Logger logger = LoggerFactory.getLogger(UserLosePlanController.class);

	@Autowired
	private UserService userService;

	/**
	 * 跳转到显示列表
	 * 
	 * @return
	 */
	@RequestMapping("/list")
	public String member_list() {
		return "userLosePlan/list";
	}
}