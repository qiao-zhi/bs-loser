package cn.qs.controller.common;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.collections.MapUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.qs.bean.common.LosePlan;
import cn.qs.service.common.LosePlanService;
import cn.qs.utils.DefaultValue;
import cn.qs.utils.JSONResultUtil;
import cn.qs.utils.SystemUtils;
import cn.qs.utils.UUIDUtil;
import cn.qs.utils.ValidateCheck;

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
	private String baseFilePath = "losePlan";

	@Autowired
	private LosePlanService losePlanService;

	/**
	 * 跳转到显示列表
	 * 
	 * @return
	 */
	@RequestMapping("list")
	public String list() {
		return baseFilePath + "/list";
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

		return baseFilePath + "/add";
	}

	/**
	 * 保存数据
	 * 
	 * @param plan
	 * @return
	 */
	@RequestMapping("doAdd")
	@ResponseBody
	public JSONResultUtil doAdd(LosePlan plan, HttpServletRequest request) {
		plan.setId(UUIDUtil.getUUID2());
		plan.setCreatetime(new Date());
		plan.setCreatorusername(SystemUtils.getLoginUsername(request));

		losePlanService.add(plan);
		return JSONResultUtil.ok();
	}

	@RequestMapping("pages")
	@ResponseBody
	public PageInfo<LosePlan> pages(@RequestParam Map condition) {
		int pageNum = 1;
		if (ValidateCheck.isNotNull(MapUtils.getString(condition, "pageNum"))) { // 如果不为空的话改变当前页号
			pageNum = MapUtils.getInteger(condition, "pageNum");
		}
		int pageSize = DefaultValue.PAGE_SIZE;
		if (ValidateCheck.isNotNull(MapUtils.getString(condition, "pageSize"))) { // 如果不为空的话改变当前页大小
			pageSize = MapUtils.getInteger(condition, "pageSize");
		}

		// 开始分页
		PageHelper.startPage(pageNum, pageSize);
		List<LosePlan> useplans = new ArrayList<LosePlan>();
		try {
			useplans = losePlanService.listByCondition(condition);
		} catch (Exception e) {
			logger.error("getUsers error！", e);
		}
		PageInfo<LosePlan> pageInfo = new PageInfo<LosePlan>(useplans);

		return pageInfo;
	}

	@RequestMapping("delete")
	@ResponseBody
	public JSONResultUtil delete(String id) {
		losePlanService.delete(id);
		return JSONResultUtil.ok();
	}

	@RequestMapping("update")
	public String update(String id, ModelMap map, HttpServletRequest request) {
		LosePlan plan = losePlanService.findById(id);
		map.addAttribute("plan", plan);
		map.put("bodys", DefaultValue.BODY_LOCATIONS);
		map.put("bmis", DefaultValue.BMI_VALUES);

		return baseFilePath + "/update";
	}

	@RequestMapping("doUpdate")
	@ResponseBody
	public JSONResultUtil doUpdate(LosePlan plan) {
		losePlanService.update(plan);
		return JSONResultUtil.ok();
	}
}
