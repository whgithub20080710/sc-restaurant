package com.stick.user.service;

import com.stick.user.dataobject.UserInfo;

public interface UserService {

	/**
	 * 通过openid来查询用户信息
	 * @param openid
	 * @return
	 */
	UserInfo findByOpenid(String openid);
}
