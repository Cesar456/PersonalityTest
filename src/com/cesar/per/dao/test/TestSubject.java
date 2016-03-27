package com.cesar.per.dao.test;

import java.util.List;

import com.cesar.per.bean.Subject;
import com.cesar.per.dao.SubjectDAO;
import com.cesar.per.service.SigletonService;

import junit.framework.TestCase;

public class TestSubject extends TestCase {
	
	public void test1(){
		
		SubjectDAO subjectDAO = SigletonService.getContext().getBean(SubjectDAO.class);
		List<Subject> subjects = subjectDAO.findAll();
		int i = 1;
		for(Subject subject:subjects){
				System.out.println(i++ + ". "+ subject.getSubject());
		}
		
	}

}
