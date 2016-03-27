package com.cesar.per.dao.test;

import java.util.List;

import junit.framework.TestCase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.cesar.per.bean.Dimens;
import com.cesar.per.dao.DimensDAO;

public class TestDimensDao extends TestCase {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	
	public void test1(){
		
		DimensDAO dao = context.getBean(DimensDAO.class);
		List<Dimens> dimens = dao.findAll();
		for(Dimens dimens2:dimens){
			
			System.out.println(dimens2.getId()+" "+dimens2.getDimenSubject());
			
		}
		
		
	}
	
	

}
