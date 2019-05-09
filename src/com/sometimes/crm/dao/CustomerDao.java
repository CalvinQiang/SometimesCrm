package com.sometimes.crm.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import com.sometimes.crm.domain.Customer;


public interface CustomerDao {

	void save(Customer customer);

	Integer findCountByCondition(DetachedCriteria detachedCriteria);

	List<Customer> findByPageByCondition(DetachedCriteria detachedCriteria, Integer begin, Integer pageSize);

}
