package com.sometimes.crm.service.impl;

import com.sometimes.crm.dao.UserDao;
import com.sometimes.crm.domain.User;
import com.sometimes.crm.service.UserService;
import com.sometimes.crm.utils.MD5Utils;;
public class UserServiceImpl implements UserService {

	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void register(User user) {
		// TODO Auto-generated method stub
		user.setUser_password(MD5Utils.md5(user.getUser_password()));
		user.setUser_state("1");
		userDao.save(user);
	}

}
