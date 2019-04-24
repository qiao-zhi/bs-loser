package cn.qs.service.user;

import cn.qs.bean.user.UserHealthInfo;

public interface UserHealthService {
	UserHealthInfo findOrCreateUserHealthInfoByUsername(String username);

	void update(UserHealthInfo info);
}
