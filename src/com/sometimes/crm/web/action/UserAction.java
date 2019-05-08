package com.sometimes.crm.web.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.sometimes.crm.domain.User;
import com.sometimes.crm.service.UserService;

public class UserAction extends ActionSupport implements ModelDriven<User> {

	private User user = new User();
	
	@Override
	public User getModel() {
		return user;
	}
	
	private UserService userService;

	public void setUser(User user) {
		this.user = user;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	public String regist() {
		userService.register(user);
		return LOGIN;
	}
	
	public String login() {
		User existUser = userService.login(user);
		if(existUser == null) {
			this.addActionError("用户名或密码错误");
			return LOGIN;
		}else {
			ActionContext.getContext().getSession().put("existUser", existUser);
			return SUCCESS;
		}
	}

}
