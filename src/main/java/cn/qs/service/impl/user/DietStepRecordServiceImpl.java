package cn.qs.service.impl.user;

import java.util.List;
import java.util.Map;

import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.qs.bean.user.DietStepRecord;
import cn.qs.bean.user.DietStepRecordExample;
import cn.qs.bean.user.DietStepRecordExample.Criteria;
import cn.qs.mapper.user.DietStepRecordMapper;
import cn.qs.service.user.DietStepRecordService;

@Service
public class DietStepRecordServiceImpl implements DietStepRecordService {
	@Autowired
	private DietStepRecordMapper dietStepRecordMapper;

	@Override
	public void add(DietStepRecord t) {
		dietStepRecordMapper.insert(t);
	}

	@Override
	public void delete(Integer id) {
		dietStepRecordMapper.deleteByPrimaryKey(id);
	}

	@Override
	public DietStepRecord findById(Integer id) {
		return dietStepRecordMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<DietStepRecord> listByCondition(Map condition) {
		DietStepRecordExample example = new DietStepRecordExample();
		Criteria criteria = example.createCriteria();
		String username = MapUtils.getString(condition, "username");
		if (StringUtils.isNotBlank(username)) {
			criteria.andCreatorusernameEqualTo(username);
		}

		return dietStepRecordMapper.selectByExample(example);
	}

	@Override
	public void update(DietStepRecord t) {
		dietStepRecordMapper.updateByPrimaryKeySelective(t);
	}

}
