<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.cesar.per.util.CommonUtil"%>
<%@page import="com.cesar.per.bean.Subject"%>
<%@page import="com.cesar.per.service.SigletonService"%>
<%@page import="com.cesar.per.service.SubjectService"%>
<%@ page language="java" pageEncoding="UTF-8"%> 
<%@ page contentType="text/html;charset=UTF-8"%> 
<%
	SubjectService subjectService = SigletonService.getSubjectService();
	String info = "";
	String name = "Cesar";
	
	String a = "2.2";
	String b = "3.2";
	String c = "2.8";
	String d = "1.7";
	String e = "3";
	
%>


<html lang="en" class="no-js">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href='http://fonts.useso.com/css?family=Ubuntu:400,700'
	rel='stylesheet' type='text/css'>
<link rel="stylesheet" href="css/reset.css">
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" type="text/css" href="css/main.css">
<script src="http://ajax.useso.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
<script type="text/javascript" src="js/lottery.js"></script>
<script src="js/modernizr.js"></script>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title><%=name%>,谢谢您的支持</title>
</head>
<body>
	<section id="cd-table"> 
	<header class="cd-table-column">
	<h2>特质</h2>
	<ul>
		<li>神经质</li>
		<li>外倾性</li>
		<li>经验开放性</li>
		<li>宜人性</li>
		<li>认真性</li>
	</ul>
	</header>

	<div class="cd-table-container">
		<div class="cd-table-wrapper">
			<div class="cd-table-column_de">
				<h2>高分者特征</h2>
				<ul>
					<li>烦恼、紧张、情绪化、不安全、不准确、忧郁</li>
					<li>好社交、活跃、健谈、乐群、乐观、重感情</li>
					<li>兴趣广泛、有创造力、富于想象、非传统的</li>
					<li>心肠软、信任人，宽宏大量、易轻信、直率</li>
					<li>可靠、勤奋、自律、细心、整洁、有抱负、有毅力</li>
				</ul>
			</div>

			<div class="cd-table-column_de">
				<h2>低分者特质</h2>
				<ul>
					<li>平静、放松、不情绪化、果敢，安全、自我陶醉</li>
					<li>谨慎、冷静、无精打采、冷淡、退让、话少</li>
					<li>习俗化、讲实际、兴趣少、无艺术性、非分析性</li>
					<li>粗鲁、多疑、报复心重、残忍、易怒、好操纵别人</li>
					<li>无目标、懒惰、粗心、忪懈、意志弱、享乐</li>
				</ul>
			</div>
			<!-- cd-table-column -->

			<div class="cd-table-column">
				<h2><%=name %>的得分</h2>
				<ul>
					<li><%=a %>/5</li>
					<li><%=b %>/5</li>
					<li><%=c %>/5</li>
					<li><%=d %>/5</li>
					<li><%=e %>/5</li>
				</ul>
			</div>
		</div>
	</div>
	<em class="cd-scroll-right"></em> </section>
	<script
		src="http://ajax.useso.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
	<script src="js/main.js"></script>
	
	<div class="turnplate_box">
		<canvas id="myCanvas" width="300px" height="300px">抱歉！浏览器不支持。</canvas>
		<canvas id="myCanvas01" width="200px" height="200px">抱歉！浏览器不支持。</canvas>
		<canvas id="myCanvas03" width="200px" height="200px">抱歉！浏览器不支持。</canvas>
		<canvas id="myCanvas02" width="150px" height="150px">抱歉！浏览器不支持。</canvas>
		<button id="tupBtn" class="turnplatw_btn"></button>
	</div>
	<div>
	<input id="userName" type="hidden" value="<%= name%>" >
	</div>
	<!-- 更改系统默认弹窗 -->
	<script type="text/javascript">
	window.alert = function(str)
	{
		var shield = document.createElement("DIV");
		shield.id = "shield";
		shield.style.position = "absolute";
		shield.style.left = "50%";
		shield.style.top = "50%";
		shield.style.width = "280px";
		shield.style.height = "150px";
		shield.style.marginLeft = "-140px";
		shield.style.marginTop = "-110px";
		shield.style.zIndex = "25";
		var alertFram = document.createElement("DIV");
		alertFram.id="alertFram";
		alertFram.style.position = "absolute";
		alertFram.style.width = "280px";
		alertFram.style.height = "150px";
		alertFram.style.left = "50%";
		alertFram.style.top = "50%";
		alertFram.style.marginLeft = "-140px";
		alertFram.style.marginTop = "-110px";
		alertFram.style.textAlign = "center";
		alertFram.style.lineHeight = "150px";
		alertFram.style.zIndex = "300";
		strHtml = "<ul style=\"list-style:none;margin:0px;padding:0px;width:100%\">\n";
		strHtml += " <li style=\"background:#626262;text-align:left;padding-left:20px;font-size:14px;font-weight:bold;height:25px;line-height:25px;border:1px solid #F9CADE;color:white\">[中奖提醒]</li>\n";
		strHtml += " <li style=\"background:#787878;text-align:center;font-size:12px;height:95px;line-height:95px;border-left:1px solid #F9CADE;border-right:1px solid #F9CADE;color:#DCC722\">"+str+"</li>\n";
		strHtml += " <li style=\"background:#626262;text-align:center;font-weight:bold;height:30px;line-height:25px; border:1px solid #F9CADE;\"><input type=\"button\" value=\"确 定\" onclick=\"doOk()\" style=\"width:80px;height:20px;background:#626262;color:white;border:1px solid white;font-size:14px;line-height:20px;outline:none;margin-top: 4px\"/></li>\n";
		strHtml += "</ul>\n";
		alertFram.innerHTML = strHtml;
		document.body.appendChild(alertFram);
		document.body.appendChild(shield);
		this.doOk = function(){
			alertFram.style.display = "none";
			shield.style.display = "none";
		}
		alertFram.focus();
		document.body.onselectstart = function(){return false;};
	}
	</script>

</body>
</html>
