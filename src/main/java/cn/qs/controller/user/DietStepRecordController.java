package cn.qs.controller.user;

import java.util.ArrayList;
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

import cn.qs.bean.user.DietStepRecord;
import cn.qs.service.user.DietStepRecordService;
import cn.qs.utils.DefaultValue;
import cn.qs.utils.JSONResultUtil;
import cn.qs.utils.LoseConputeUtils;
import cn.qs.utils.SystemUtils;
import cn.qs.utils.ValidateCheck;

@Controller
@RequestMapping("dietStep")
public class DietStepRecordController {
	private static final Logger logger = LoggerFactory.getLogger(DietStepRecordController.class);
	private String baseFilePath = "dietStep";

	@Autowired
	private DietStepRecordService dietStepRecordService;

	/**
	 * 跳转到显示列表
	 * 
	 * @return
	 */
	@RequestMapping("/list")
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
		map.put("sports", DefaultValue.SPORT_K);
		map.put("foods", DefaultValue.FOODS_HEAT);

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
	public JSONResultUtil doAdd(DietStepRecord dietStepRecord, HttpServletRequest request) {
		dietStepRecord.setCreatorusername(SystemUtils.getLoginUsername(request));
		LoseConputeUtils.setSportsHeatAndDietsHeats(dietStepRecord, request);

		dietStepRecordService.add(dietStepRecord);
		return JSONResultUtil.ok();
	}

	@RequestMapping("pages")
	@ResponseBody
	public PageInfo<DietStepRecord> pages(@RequestParam Map condition) {
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
		List<DietStepRecord> useplans = new ArrayList<DietStepRecord>();
		try {
			useplans = dietStepRecordService.listByCondition(condition);
		} catch (Exception e) {
			logger.error("getUsers error！", e);
		}
		PageInfo<DietStepRecord> pageInfo = new PageInfo<DietStepRecord>(useplans);

		return pageInfo;
	}

	@RequestMapping("delete")
	@ResponseBody
	public JSONResultUtil delete(Integer id) {
		dietStepRecordService.delete(id);
		return JSONResultUtil.ok();
	}

	@RequestMapping("update")
	public String update(Integer id, ModelMap map, HttpServletRequest request) {
		DietStepRecord plan = dietStepRecordService.findById(id);
		map.addAttribute("plan", plan);
		map.put("finishs", DefaultValue.FINISH_DATAILS);

		return baseFilePath + "/update";
	}

	@RequestMapping("doUpdate")
	@ResponseBody
	public JSONResultUtil doUpdate(DietStepRecord record) {
		dietStepRecordService.update(record);
		return JSONResultUtil.ok();
	}
}