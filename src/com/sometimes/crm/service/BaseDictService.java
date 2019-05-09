package com.sometimes.crm.service;

import java.util.List;

import com.sometimes.crm.domain.BaseDict;

public interface BaseDictService {

	List<BaseDict> findByTypeCode(String dict_type_code);

}
