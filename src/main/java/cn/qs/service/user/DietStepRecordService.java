package cn.qs.service.user;

import java.util.List;
import java.util.Map;

import cn.qs.bean.user.DietStepRecord;
import cn.qs.service.BaseService;

public interface DietStepRecordService extends BaseService<DietStepRecord, Integer> {

	List<Map<String, Object>> getStepSequence(String day);

}
