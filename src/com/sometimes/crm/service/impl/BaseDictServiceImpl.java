package com.sometimes.crm.service.impl;

import java.util.List;

import com.sometimes.crm.dao.BaseDictDao;
import com.sometimes.crm.domain.BaseDict;
import com.sometimes.crm.service.BaseDictService;

public class BaseDictServiceImpl implements BaseDictService {
	private BaseDictDao baseDictDao;

	public void setBaseDictDao(BaseDictDao baseDictDao) {
		this.baseDictDao = baseDictDao;
	}

	@Override
	public List<BaseDict> findByTypeCode(String dict_type_code) {
		return baseDictDao.findByTypeCode(dict_type_code);
	}
}
