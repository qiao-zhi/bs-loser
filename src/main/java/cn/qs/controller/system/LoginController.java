package cn.qs.controller.system;

import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.qs.bean.user.User;
import cn.qs.service.user.UserService;
import cn.qs.utils.FileHandleUtil;
import cn.qs.utils.JSONResultUtil;

/**
 * 登陆
 * 
 * @author Administrator
 *
 */
@Controller
public class LoginController {
	@Autowired
	private UserService userService;

	/**
	 * 跳转到登陆界面
	 * 
	 * @return
	 */
	@RequestMapping("login")
	public String login(ModelMap map) {
		double ceil = Math.ceil(Math.random() * 8);
		int index  = (int) ceil;
		String src = "/static/x-admin/images/" + index+".jpg";
		map.put("src",src);
		
		return "login";
	}

	/**
	 * 处理登陆请求
	 * 
	 * @param username
	 * @param password
	 * @param session
	 * @return
	 */
	@RequestMapping("doLogin")
	@ResponseBody
	public JSONResultUtil doLogin(String username, String password, HttpSession session) {
		User loginUser = null;
		String adminPassword = StringUtils.defaultIfBlank(FileHandleUtil.getValue("application", "adminPassword"),
				"admin");
		if ("admin".equals(username) && adminPassword.equals(password)) {
			loginUser = new User();
			loginUser.setFullname("系统管理员");
			loginUser.setUsername("admin");
			loginUser.setRoles("1");
		} else {
			loginUser = userService.getUserByUserNameAndPassword(username, password);
		}

		if (loginUser == null) {
			return JSONResultUtil.error("账号或者密码错误");
		}

		session.setAttribute("user", loginUser);
		return JSONResultUtil.ok();
	}
}
