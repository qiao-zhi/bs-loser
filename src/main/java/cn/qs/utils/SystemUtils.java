package cn.qs.utils;

import javax.servlet.http.HttpServletRequest;

import cn.qs.bean.user.User;

public class SystemUtils {
	private SystemUtils() {
	}

	public static User getLoginUser(HttpServletRequest request) {
		User user = (User) request.getSession().getAttribute("user");
		if (user == null) {
			user = new User();
			user.setFullname("系统管理员");
			user.setUsername("admin");
		}

		return user;
	}

	public static String getLoginUsername(HttpServletRequest request) {
		return getLoginUser(request).getUsername();
	}
}
