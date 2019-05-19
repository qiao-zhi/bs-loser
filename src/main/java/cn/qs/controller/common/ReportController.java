package cn.qs.controller.common;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang.math.NumberUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.qs.bean.user.DietStepRecord;
import cn.qs.bean.user.UserLosePlan;
import cn.qs.service.user.DietStepRecordService;
import cn.qs.service.user.UserLosePlanService;
import cn.qs.utils.SystemUtils;

/**
 * 统计报表
 */
@Controller
@RequestMapping("report")
public class ReportController {

	private static final Logger logger = LoggerFactory.getLogger(ReportController.class);
	private String baseFilePath = "report";

	@Autowired
	private UserLosePlanService losePlanService;

	@Autowired
	private DietStepRecordService dietStepRecordService;

	@RequestMapping("planDetailReport")
	public String planDetail() {
		return baseFilePath + "/planDetail";
	}

	@RequestMapping("planDetailData")
	@ResponseBody
	public List<Map<String, Object>> planDetailData(HttpServletRequest request) {
		Map<String, Object> condition = new HashMap<>();
		if (!"admin".equals(SystemUtils.getLoginUsername(request))) {
			condition.put("username", SystemUtils.getLoginUsername(request));
		}
		List<UserLosePlan> useplans = new ArrayList<UserLosePlan>();
		try {
			useplans = losePlanService.listByCondition(condition);
		} catch (Exception e) {
			logger.error("report planDetailData！", e);
		}

		Map<String, Object> resultMap = new HashMap<>();
		if (CollectionUtils.isNotEmpty(useplans)) {
			for (UserLosePlan plan : useplans) {
				String hasfinished = plan.getHasfinished();

				resultMap.put(hasfinished, MapUtils.getInteger(resultMap, hasfinished, 0) + 1);
			}
		}

		List<Map<String, Object>> resultList = new ArrayList<>();
		for (String key : resultMap.keySet()) {
			Map<String, Object> result = new HashMap<String, Object>();
			result.put("name", key);
			result.put("value", resultMap.get(key));

			resultList.add(result);
		}

		return resultList;
	}

	@RequestMapping("hotReport")
	public String hotReport() {
		return baseFilePath + "/hotReport";
	}

	@RequestMapping("hotReportData")
	@ResponseBody
	public Map<String, Object> hotReportData(HttpServletRequest request) throws ParseException {
		Map<String, Object> resultList = new HashMap<>();

		List<DietStepRecord> useplans = new ArrayList<DietStepRecord>();
		try {
			Map<String, Object> condition = new HashMap<>();
			condition.put("username", SystemUtils.getLoginUsername(request));

			useplans = dietStepRecordService.listByCondition(condition);
		} catch (Exception e) {
			logger.error("getUsers error！", e);
		}

		if (CollectionUtils.isNotEmpty(useplans)) {
			Iterator<DietStepRecord> iterator = useplans.iterator();
			while (iterator.hasNext()) {
				DietStepRecord next = iterator.next();
				String remark = next.getRemark();
				if (StringUtils.isBlank(remark)
						|| !isEffectiveDate(DateUtils.parseDateStrictly(remark, "yyyy-MM-dd"))) {
					logger.debug("跳过 data:->{}", remark);
					iterator.remove();
					continue;
				}
			}
		}

		Iterator<DietStepRecord> iterator = useplans.iterator();
		List<String> XAxis = new LinkedList<>();
		List<String> inputHot = new LinkedList<>();
		List<String> outputHot = new LinkedList<>();
		List<Float> remainHot = new LinkedList<>();
		while (iterator.hasNext()) {
			DietStepRecord next = iterator.next();
			XAxis.add(next.getRemark());
			String dietsheat = next.getDietsheat().replace("卡路里", "");
			String spotHot = next.getSportsheat().replace("卡路里", "");
			inputHot.add(dietsheat);
			outputHot.add(spotHot);

			// 保留两位小数
			DecimalFormat decimalFormat = new DecimalFormat("#0.00");
			remainHot.add(NumberUtils
					.toFloat(decimalFormat.format(NumberUtils.toFloat(dietsheat) - NumberUtils.toFloat(spotHot))));
		}
		resultList.put("XAxis", XAxis);
		resultList.put("inputHot", inputHot);
		resultList.put("outputHot", outputHot);
		resultList.put("remainHot", remainHot);

		return resultList;
	}

	private boolean isEffectiveDate(Date nowTime) {
		Date endTime = new Date();
		endTime = DateUtils.addDays(endTime, 1);
		Date startTime = DateUtils.addDays(endTime, -8);

		if (nowTime.getTime() == startTime.getTime() || nowTime.getTime() == endTime.getTime()) {
			return true;
		}

		Calendar date = Calendar.getInstance();
		date.setTime(nowTime);

		Calendar begin = Calendar.getInstance();
		begin.setTime(startTime);

		Calendar end = Calendar.getInstance();
		end.setTime(endTime);

		if (date.after(begin) && date.before(end)) {
			return true;
		} else {
			return false;
		}
	}
}
