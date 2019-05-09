package com.sometimes.crm.dao;

import java.util.List;

import com.sometimes.crm.domain.BaseDict;

public interface BaseDictDao {
	public List<BaseDict> findByTypeCode(String dict_type_code);
}
