package cn.qs.service.impl.user;

import java.util.List;
import java.util.Map;

import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.qs.bean.user.UserLosePlan;
import cn.qs.bean.user.UserLosePlanExample;
import cn.qs.bean.user.UserLosePlanExample.Criteria;
import cn.qs.mapper.user.UserLosePlanMapper;
import cn.qs.service.user.UserLosePlanService;

@Service
public class UserLosePlanServiceImpl implements UserLosePlanService {
	@Autowired
	private UserLosePlanMapper userLosePlanMapper;

	@Override
	public void add(UserLosePlan t) {
		userLosePlanMapper.insert(t);
	}

	@Override
	public void delete(String id) {
		userLosePlanMapper.deleteByPrimaryKey(id);
	}

	@Override
	public UserLosePlan findById(String id) {
		return userLosePlanMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<UserLosePlan> listByCondition(Map condition) {
		UserLosePlanExample losePlanExample = new UserLosePlanExample();
		Criteria criteria = losePlanExample.createCriteria();
		String username = MapUtils.getString(condition, "username");
		if (StringUtils.isNotBlank(username)) {
			criteria.andCreatorusernameEqualTo(username);
		}

		return userLosePlanMapper.selectByExample(losePlanExample);
	}

	@Override
	public void update(UserLosePlan t) {
		userLosePlanMapper.updateByPrimaryKeySelective(t);
	}

}
