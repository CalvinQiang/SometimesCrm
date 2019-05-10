package com.sometimes.crm.web.action;

import org.hibernate.criterion.DetachedCriteria;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.sometimes.crm.domain.Customer;
import com.sometimes.crm.domain.PageBean;
import com.sometimes.crm.service.CustomerService;

public class CustomerAction extends ActionSupport implements ModelDriven<Customer> {
	private Customer customer = new Customer();
	private CustomerService customerService;

	// 使用set方法的方式接收数据:
	private Integer currPage = 1;

	public void setCurrPage(Integer currPage) {
		if (currPage == null || currPage < 1) {
			currPage = 1;
		}
		this.currPage = currPage;
	}

	// 使用set方法接受每页显示记录数
	private Integer pageSize = 3;

	public void setPageSize(Integer pageSize) {
		if (pageSize == null || pageSize < 1) {
			pageSize = 3;
		}
		this.pageSize = pageSize;
	}

	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public Customer getModel() {
		return customer;
	}

	public String findAll() {
		DetachedCriteria detachedCriteria = DetachedCriteria.forClass(Customer.class);
		PageBean<Customer> pageBean = customerService.findByPage(detachedCriteria, currPage, pageSize);
		ActionContext.getContext().getValueStack().push(pageBean);
		return "findAll";
	}

	public String saveUI() {
		return "saveUI";
	}

	public String save() {
		customerService.save(customer);
		return "saveSuccess";
	}

}
