package com.cesar.per.util;

public class CommonUtil {
	
	public static String convertString(String s){
		
		String re = s;
		
		if(s == null||"".equals(s)||"null".equals(s)){
			re = "3";
		}
		return re;
	}

}
