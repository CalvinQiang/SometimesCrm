package com.sometimes.crm.service;

import org.hibernate.criterion.DetachedCriteria;

import com.sometimes.crm.domain.Customer;
import com.sometimes.crm.domain.PageBean;

public interface CustomerService {

	void save(Customer customer);

	PageBean<Customer> findByPage(DetachedCriteria detachedCriteria, Integer currPage, Integer pageSize);
	
}
