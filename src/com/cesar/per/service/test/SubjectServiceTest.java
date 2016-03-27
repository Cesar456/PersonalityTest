package com.cesar.per.service.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cesar.per.service.SubjectService;

import junit.framework.TestCase;

public class SubjectServiceTest extends TestCase {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	public void testSave(){
		SubjectService service = context.getBean(SubjectService.class);
		
		String scores = "";
		for(int i=0;i<60;i++){
			scores+=1;
		}
		
		try {
			service.saveScore("狗无肠111", scores);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
