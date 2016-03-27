package com.cesar.per.dao.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cesar.per.bean.User;
import com.cesar.per.dao.UserDAO;
import com.cesar.per.dao.UserScoreDAO;

import junit.framework.TestCase;

public class TestUserDao extends TestCase {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	UserDAO userDAO = context.getBean(UserDAO.class);
	UserScoreDAO userScoreDAO = context.getBean(UserScoreDAO.class);
	
	public void test1(){
		getUser();
	}

	public void saveUser() {
		User user = new User();
		user.setId(0);
		user.setUserName("Cesar");
		user.setUuid("123");
		userDAO.save(user);
	}
	
	public void getUser(){
		List<User> users = userDAO.findAll();
		for(User user:users){
			System.out.println(user.toString());
		}
	}
}
