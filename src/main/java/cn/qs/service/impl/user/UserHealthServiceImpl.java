package cn.qs.service.impl.user;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.qs.bean.user.UserHealthInfo;
import cn.qs.bean.user.UserHealthInfoExample;
import cn.qs.bean.user.UserHealthInfoExample.Criteria;
import cn.qs.mapper.user.UserHealthInfoMapper;
import cn.qs.service.user.UserHealthService;

@Service
public class UserHealthServiceImpl implements UserHealthService {

	@Autowired
	private UserHealthInfoMapper userHealthInfoMapper;

	@Override
	public UserHealthInfo findOrCreateUserHealthInfoByUsername(String username) {
		// 1根据username查询
		UserHealthInfo userHealthInfo = findHealthInfoByUsername(username);

		// 2如果为空就创建并且保存
		if (userHealthInfo == null) {
			insertUserHealthInfo(username);
			userHealthInfo = findHealthInfoByUsername(username);
		}

		return userHealthInfo;
	}

	private void insertUserHealthInfo(String username) {
		UserHealthInfo record = new UserHealthInfo();
		record.setUsername(username);

		userHealthInfoMapper.insert(record);
	}

	private UserHealthInfo findHealthInfoByUsername(String username) {
		UserHealthInfoExample example = new UserHealthInfoExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andUsernameEqualTo(username);

		List<UserHealthInfo> infos = userHealthInfoMapper.selectByExample(example);
		if (CollectionUtils.isEmpty(infos)) {
			return null;
		}

		return infos.get(0);
	}

	@Override
	public void update(UserHealthInfo info) {
		userHealthInfoMapper.updateByPrimaryKeySelective(info);
	}
}
