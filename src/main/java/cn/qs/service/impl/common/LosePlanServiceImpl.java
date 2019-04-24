package cn.qs.service.impl.common;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.qs.bean.common.LosePlan;
import cn.qs.bean.common.LosePlanExample;
import cn.qs.bean.common.LosePlanExample.Criteria;
import cn.qs.mapper.common.LosePlanMapper;
import cn.qs.service.common.LosePlanService;

@Service
public class LosePlanServiceImpl implements LosePlanService {

	@Autowired
	private LosePlanMapper losePlanMapper;

	@Override
	public void add(LosePlan t) {
		losePlanMapper.insert(t);
	}

	@Override
	public void delete(String id) {
		losePlanMapper.deleteByPrimaryKey(id);
	}

	@Override
	public LosePlan findById(String id) {
		return losePlanMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<LosePlan> listByCondition(Map condition) {
		LosePlanExample losePlanExample = new LosePlanExample();
		Criteria criteria = losePlanExample.createCriteria();

		return losePlanMapper.selectByExample(losePlanExample);
	}

	@Override
	public void update(LosePlan t) {
		losePlanMapper.updateByPrimaryKeySelective(t);
	}
}
