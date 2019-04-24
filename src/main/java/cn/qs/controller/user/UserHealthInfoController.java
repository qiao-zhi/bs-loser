package cn.qs.controller.user;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.qs.bean.user.UserHealthInfo;
import cn.qs.service.user.UserHealthService;
import cn.qs.utils.JSONResultUtil;
import cn.qs.utils.LoseConputeUtils;
import cn.qs.utils.SystemUtils;

@Controller
@RequestMapping("userHealth")
public class UserHealthInfoController {

	private static final Logger logger = LoggerFactory.getLogger(UserHealthInfoController.class);
	private String baseFilePath = "userHealth";

	@Autowired
	private UserHealthService userHealthService;

	@RequestMapping("update")
	public String update(ModelMap map, HttpServletRequest request) {
		String loginUsername = SystemUtils.getLoginUsername(request);
		UserHealthInfo info = userHealthService.findOrCreateUserHealthInfoByUsername(loginUsername);
		info.setFullname(SystemUtils.getLoginUser(request).getFullname());
		if (StringUtils.isBlank(info.getSex())) {
			info.setSex(SystemUtils.getLoginUser(request).getSex());
		}

		map.put("userHealthInfo", info);
		return baseFilePath + "/update";
	}

	@RequestMapping("doUpdate")
	@ResponseBody
	public JSONResultUtil doUpdate(UserHealthInfo info) {
		Float bmi = LoseConputeUtils.computeBMI(info.getWeight(), info.getHeight());
		info.setHealthRadix(bmi);
		info.setRemark(LoseConputeUtils.computeHealthStrByMBI(bmi));

		userHealthService.update(info);
		return JSONResultUtil.ok();
	}
}