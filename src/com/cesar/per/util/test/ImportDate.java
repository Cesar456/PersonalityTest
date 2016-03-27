package com.cesar.per.util.test;

import java.util.List;

import com.cesar.per.bean.Subject;
import com.cesar.per.util.JXLUtil;

import junit.framework.TestCase;

public class ImportDate extends TestCase {
	
	public void testImpot() {
		List<Subject> subjects;
		try {
			subjects = JXLUtil.getAllSubject();
			for(Subject subject:subjects){
				System.out.println(subject.toString());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
