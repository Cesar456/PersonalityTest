package com.cesar.per.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SigletonService {
	
	private static ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	
	public static DataInitService getDataInitService(){
		return context.getBean(DataInitService.class);
	}
	public static SubjectService getSubjectService(){
		return context.getBean(SubjectService.class);
	}
	
	public static ApplicationContext getContext() {
		return context;
	}
	public static void setContext(ApplicationContext context) {
		SigletonService.context = context;
	}

}
