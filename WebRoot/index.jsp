<%@page import="com.cesar.per.bean.Subject"%>
<%@page import="com.cesar.per.service.SigletonService"%>
<%@page import="com.cesar.per.service.SubjectService"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=UTF-8"%>
<%
	SubjectService subjectService = SigletonService.getSubjectService(); 
	List<Subject> subjects = subjectService.getSubjects();
%>

<!DOCTYPE html>
<html lang="en" class="no-js">
<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>大五人格问卷调查表(Cesar)</title>
<link rel="stylesheet" type="text/css" href="css/normalize.css" />
<link rel="stylesheet" type="text/css" href="css/demo.css" />
<link rel="stylesheet" type="text/css" href="css/component.css" />
<link rel="stylesheet" type="text/css" href="css/cs-select.css" />
<link rel="stylesheet" type="text/css" href="css/cs-skin-boxes.css" />
<script src="js/modernizr.custom.js"></script>
</head>
<body>
	<div class="container">

		<div class="fs-form-wrap" id="fs-form-wrap">
			<div class="fs-title">
				<h1>问卷调查表</h1>
			</div>
			<form id="myform" class="fs-form fs-form-full" autocomplete="off"
				method="post" action="second.jsp">
				
				<ol class="fs-fields">
					<li><label class="fs-field-label fs-anim-upper" for="qx">您的微博名?</label>
						<input class="fs-anim-lower" id="qx" name="qx" type="text"
						placeholder="正确的微博名对我们非常重要，谢谢" required />
					</li>
					<%
						for(int i=0;i<subjects.size();i++){
							Subject subject = subjects.get(i);
					%>
					<li data-input-trigger><label
						class="fs-field-label fs-anim-upper" for="q<%=i%>"
						data-info="我们承诺绝不会泄露您的个人信息"><%=i+1%>: <%=subject.getSubject()%></label>
						<div class="fs-radio-group fs-radio-custom clearfix fs-anim-lower">
							<span><input id="q<%=i%>a" name="q<%=i%>" type="radio"
								value="1" /><label for="q<%=i%>a" class="radio-A">A.非常不符合</label>
							</span> <span><input id="q<%=i%>b" name="q<%=i%>" type="radio"
								value="2" /><label for="q<%=i%>b" class="radio-B">B.比较不符合</label>
							</span> <span><input id="q<%=i%>c" name="q<%=i%>" type="radio"
								value="3" /><label for="q<%=i%>c" class="radio-C">C.不确定</label>
							</span> <span><input id="q<%=i%>d" name="q<%=i%>" type="radio"
								value="4" /><label for="q<%=i%>d" class="radio-D">D.比较符合</label>
							</span> <span><input id="q<%=i%>e" name="q<%=i%>" type="radio"
								value="5" /><label for="q<%=i%>e" class="radio-E">E.非常符合</label>
							</span>
						</div>
					</li>
					<%
						}
					%>
				</ol>
				<!-- /fs-fields -->
				<button class="fs-submit" type="submit">提交问卷</button>
			</form>
			<!-- /fs-form -->
		</div>
		<!-- /fs-form-wrap -->

	</div>
	<!-- /container -->
	<script src="js/classie.js"></script>
	<script src="js/selectFx.js"></script>
	<script src="js/fullscreenForm.js"></script>
	<script>
		(function() {
			var formWrap = document.getElementById('fs-form-wrap');

			[].slice
					.call(document.querySelectorAll('select.cs-select'))
					.forEach(
							function(el) {
								new SelectFx(
										el,
										{
											stickyPlaceholder : false,
											onChange : function(val) {
												document
														.querySelector('span.cs-placeholder').style.backgroundColor = val;
											}
										});
							});

			new FForm(formWrap, {
				onReview : function() {
					classie.add(document.body, 'overview');
				}
			});
		})();
	</script>
</body>
</html>