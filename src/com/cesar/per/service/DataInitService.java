package com.cesar.per.service;

import java.util.List;

import com.cesar.per.bean.Subject;
import com.cesar.per.util.JXLUtil;

public class DataInitService extends BaseService{
	public void initData(){
		try {
			List<Subject> subjects = JXLUtil.getAllSubject();
			for(Subject subject:subjects){
				getSubjectDAO().save(subject);
			}
			System.out.println("okey");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
