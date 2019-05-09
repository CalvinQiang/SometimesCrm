package com.sometimes.crm.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.sometimes.crm.dao.BaseDictDao;
import com.sometimes.crm.domain.BaseDict;

public class BaseDictDoaImpl extends HibernateDaoSupport implements BaseDictDao {

	@Override
	public List<BaseDict> findByTypeCode(String dict_type_code) {
		return (List<BaseDict>) this.getHibernateTemplate().find("from BaseDict where dict_type_code=?",
				dict_type_code);

	}

}
