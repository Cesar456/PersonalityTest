package com.cesar.per.service.test;

import com.cesar.per.service.DataInitService;
import com.cesar.per.service.SigletonService;

import junit.framework.TestCase;

public class DoInit extends TestCase {
	public void test1(){
		DataInitService service = SigletonService.getDataInitService();
		service.initData();
	}
}
