package com.sometimes.crm.dao.impl;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.sometimes.crm.dao.UserDao;
import com.sometimes.crm.domain.User;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

	@Override
	public void save(User user) {
		this.getHibernateTemplate().save(user);

	}

}
