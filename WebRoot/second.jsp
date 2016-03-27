<%@page import="com.cesar.per.util.CommonUtil"%>
<%@page import="com.cesar.per.bean.Subject"%>
<%@page import="com.cesar.per.service.SigletonService"%>
<%@page import="com.cesar.per.service.SubjectService"%>
<%@ page language="java" pageEncoding="UTF-8"%> 
<%@ page contentType="text/html;charset=UTF-8"%> 
<%

	SubjectService subjectService = SigletonService.getSubjectService();
	
	String info = "";

	String name = new String(request.getParameter("qx").getBytes("ISO-8859-1"),"utf-8") ;

	String s0 = request.getParameter("q0");
	String s1 = request.getParameter("q1");
	String s2 = request.getParameter("q2");
	String s3 = request.getParameter("q3");
	String s4 = request.getParameter("q4");
	String s5 = request.getParameter("q5");
	String s6 = request.getParameter("q6");
	String s7 = request.getParameter("q7");
	String s8 = request.getParameter("q8");
	String s9 = request.getParameter("q9");
	String s10 = request.getParameter("q10");
	String s11 = request.getParameter("q11");
	String s12 = request.getParameter("q12");
	String s13 = request.getParameter("q13");
	String s14 = request.getParameter("q14");
	String s15 = request.getParameter("q15");
	String s16 = request.getParameter("q16");
	String s17 = request.getParameter("q17");
	String s18 = request.getParameter("q18");
	String s19 = request.getParameter("q19");
	String s20 = request.getParameter("q20");
	String s21 = request.getParameter("q21");
	String s22 = request.getParameter("q22");
	String s23 = request.getParameter("q23");
	String s24 = request.getParameter("q24");
	String s25 = request.getParameter("q25");
	String s26 = request.getParameter("q26");
	String s27 = request.getParameter("q27");
	String s28 = request.getParameter("q28");
	String s29 = request.getParameter("q29");
	String s30 = request.getParameter("q30");
	String s31 = request.getParameter("q31");
	String s32 = request.getParameter("q32");
	String s33 = request.getParameter("q33");
	String s34 = request.getParameter("q34");
	String s35 = request.getParameter("q35");
	String s36 = request.getParameter("q36");
	String s37 = request.getParameter("q37");
	String s38 = request.getParameter("q38");
	String s39 = request.getParameter("q39");
	String s40 = request.getParameter("q40");
	String s41 = request.getParameter("q41");
	String s42 = request.getParameter("q42");
	String s43 = request.getParameter("q43");
	String s44 = request.getParameter("q44");
	String s45 = request.getParameter("q45");
	String s46 = request.getParameter("q46");
	String s47 = request.getParameter("q47");
	String s48 = request.getParameter("q48");
	String s49 = request.getParameter("q49");
	String s50 = request.getParameter("q50");
	String s51 = request.getParameter("q51");
	String s52 = request.getParameter("q52");
	String s53 = request.getParameter("q53");
	String s54 = request.getParameter("q54");
	String s55 = request.getParameter("q55");
	String s56 = request.getParameter("q56");
	String s57 = request.getParameter("q57");
	String s58 = request.getParameter("q58");
	String s59 = request.getParameter("q59");
	
	
	s0 = CommonUtil.convertString(s0);
	s1 = CommonUtil.convertString(s1);
	s2 = CommonUtil.convertString(s2);
	s3 = CommonUtil.convertString(s3);
	s4 = CommonUtil.convertString(s4);
	s5 = CommonUtil.convertString(s5);
	s6 = CommonUtil.convertString(s6);
	s7 = CommonUtil.convertString(s7);
	s8 = CommonUtil.convertString(s8);
	s9 = CommonUtil.convertString(s9);
	s10 = CommonUtil.convertString(s10);
	s11 = CommonUtil.convertString(s11);
s12 = CommonUtil.convertString(s12);
s13 = CommonUtil.convertString(s13);
s14 = CommonUtil.convertString(s14);
s15 = CommonUtil.convertString(s15);
s16 = CommonUtil.convertString(s16);
s17 = CommonUtil.convertString(s17);
s18 = CommonUtil.convertString(s18);
s19 = CommonUtil.convertString(s19);
s20 = CommonUtil.convertString(s20);
s21 = CommonUtil.convertString(s21);
s22 = CommonUtil.convertString(s22);
s23 = CommonUtil.convertString(s23);
s24 = CommonUtil.convertString(s24);
s25 = CommonUtil.convertString(s25);
s26 = CommonUtil.convertString(s26);
s27 = CommonUtil.convertString(s27);
s28 = CommonUtil.convertString(s28);
s29 = CommonUtil.convertString(s29);
s30 = CommonUtil.convertString(s30);
s31 = CommonUtil.convertString(s31);
s32 = CommonUtil.convertString(s32);
s33 = CommonUtil.convertString(s33);
s34 = CommonUtil.convertString(s34);
s35 = CommonUtil.convertString(s35);
s36 = CommonUtil.convertString(s36);
s37 = CommonUtil.convertString(s37);
s38 = CommonUtil.convertString(s38);
s39 = CommonUtil.convertString(s39);
s40 = CommonUtil.convertString(s40);
s41 = CommonUtil.convertString(s41);
s42 = CommonUtil.convertString(s42);
s43 = CommonUtil.convertString(s43);
s44 = CommonUtil.convertString(s44);
s45 = CommonUtil.convertString(s45);
s46 = CommonUtil.convertString(s46);
s47 = CommonUtil.convertString(s47);
s48 = CommonUtil.convertString(s48);
s49 = CommonUtil.convertString(s49);
s50 = CommonUtil.convertString(s50);
s51 = CommonUtil.convertString(s51);
s52 = CommonUtil.convertString(s52);
s53 = CommonUtil.convertString(s53);
s54 = CommonUtil.convertString(s54);
s55 = CommonUtil.convertString(s55);
s56 = CommonUtil.convertString(s56);
s57 = CommonUtil.convertString(s57);
s58 = CommonUtil.convertString(s58);
s59 = CommonUtil.convertString(s59);


	String score = s0 + s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9
	+ s10 + s11 + s12 + s13 + s14 + s15 + s16 + s17 + s18 + s19
	+ s20 + s21 + s22 + s23 + s24 + s25 + s26 + s27 + s28 + s29
	+ s30 + s31 + s32 + s33 + s34 + s35 + s36 + s37 + s38 + s39
	+ s40 + s41 + s42 + s43 + s44 + s45 + s46 + s47 + s48 + s49
	+ s50 + s51 + s52 + s53 + s54 + s55 + s56 + s57 + s58 + s59;
	try{
		subjectService.saveScore(name, score);
	}catch(Exception e){
		info = "您的微博名可能输入的不正确，请重新再来一次！";
	}
%>


<html lang="en" class="no-js">
<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title><%=name%>,谢谢您的支持</title>
</head>
<body>
<%=info %>
<h2>谢谢</h2>
</body>
</html>
