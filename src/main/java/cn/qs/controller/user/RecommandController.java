package cn.qs.controller.user;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.qs.bean.common.LosePlan;
import cn.qs.bean.common.Video;
import cn.qs.bean.user.UserHealthInfo;
import cn.qs.service.user.RecommandService;
import cn.qs.service.user.UserHealthService;
import cn.qs.utils.DefaultValue;
import cn.qs.utils.SpringBootUtils;
import cn.qs.utils.SystemUtils;

/**
 * 推荐信息
 * 
 * @author Administrator
 *
 */
@Controller
@RequestMapping("recommand")
public class RecommandController {
	private static final Logger logger = LoggerFactory.getLogger(RecommandController.class);
	private String baseFilePath = "recommand";

	@Autowired
	private RecommandService recommandService;

	@RequestMapping("listVideo")
	public String listVideo(ModelMap map) {
		map.put("bodys", DefaultValue.BODY_LOCATIONS);

		return baseFilePath + "/listVideo";
	}

	@RequestMapping("listPlan")
	public String listPlan(ModelMap map) {
		map.put("bodys", DefaultValue.BODY_LOCATIONS);

		return baseFilePath + "/listPlan";
	}

	@RequestMapping("getVideos")
	@ResponseBody
	public List<Video> getVideos(@RequestParam String body, HttpServletRequest request) {
		String loginUsername = SystemUtils.getLoginUsername(request);
		UserHealthService userHealthService = SpringBootUtils.getBean(UserHealthService.class);
		UserHealthInfo userHealthInfo = userHealthService.findOrCreateUserHealthInfoByUsername(loginUsername);
		Float BMI = userHealthInfo.getHealthRadix() == null ? 0F : userHealthInfo.getHealthRadix();

		List<Video> rsults = recommandService.getVideos(body, BMI);
		return rsults;
	}

	@RequestMapping("getPlans")
	@ResponseBody
	public List<LosePlan> getPlans(@RequestParam String body, HttpServletRequest request) {
		String loginUsername = SystemUtils.getLoginUsername(request);
		UserHealthService userHealthService = SpringBootUtils.getBean(UserHealthService.class);
		UserHealthInfo userHealthInfo = userHealthService.findOrCreateUserHealthInfoByUsername(loginUsername);
		Float BMI = userHealthInfo.getHealthRadix() == null ? 0F : userHealthInfo.getHealthRadix();

		List<LosePlan> rsults = recommandService.getPlans(body, BMI);
		return rsults;
	}
}