package com.sometimes.crm.service;

import org.springframework.transaction.annotation.Transactional;

import com.sometimes.crm.domain.User;

/**
 * HibernateTemplate注解的问题
 * 	解决办法：https://zhidao.baidu.com/question/437250188.html
 * DAO采用了Spring容器的事务管理策略，如果操作方法的名称和事务策略中指定的被管理的名称不能被匹配上，
 * spring 就会自动采取默认的事务管理策略(PROPAGATION_REQUIRED,read only)。
   *  如果是插入和修改操作，就不会被允许的
 * @author Sometimes
 *
 */
@Transactional
public interface UserService {
	public void register(User user);
}
