package cn.qs.controller.system;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.qs.bean.user.UserHealthInfo;
import cn.qs.service.user.UserHealthService;
import cn.qs.utils.SystemUtils;

@Controller
public class Index {

	@Autowired
	private UserHealthService userHealthService;

	@RequestMapping("/index")
	public String index(ModelMap map, HttpServletRequest request) {
		String loginUsername = SystemUtils.getLoginUsername(request);
		if ("admin".equals(loginUsername)) {
			return "index";
		}

		UserHealthInfo info = userHealthService.findOrCreateUserHealthInfoByUsername(loginUsername);
		if (info.getHealthRadix() == null) {
			map.put("needUpdateHealthInfo", "true");
		}

		return "index";
	}

	@RequestMapping("/welcome")
	public String welcome(ModelMap map) {
		return "welcome";
	}
}
