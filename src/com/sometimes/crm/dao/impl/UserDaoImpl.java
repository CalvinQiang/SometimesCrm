package com.sometimes.crm.dao.impl;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.sometimes.crm.dao.UserDao;
import com.sometimes.crm.domain.User;

import java.util.List;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

	@Override
	public void save(User user) {
		this.getHibernateTemplate().save(user);

	}

	@Override
	public User login(User user) {
		List<User> list = (List<User>) this.getHibernateTemplate().find(
				"from User where user_code=? and user_password=?", user.getUser_code(), user.getUser_password());
		if (list.size() > 0) {
			return list.get(0);
		}
		return null;
	}

}
