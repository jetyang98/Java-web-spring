<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
	<base href="<%=basePath%>">

	<title>登入页</title>
	<style>
		html,
		body {
			height: 100%;
			overflow: hidden
		}

		body {
			background: url(images/bg.jpg ) no-repeat;
			background-size: 100% 100%
		}
	</style>
	<script type="text/javascript" src="js/jquery-easyui-1.5/jquery.min.js"></script>
	<link rel="stylesheet" href="js/bootstrap-3.3.7-dist/css/bootstrap.css" />
	<link rel="stylesheet" href="js/jquery-easyui-1.5/themes/default/easyui.css" />
	<link rel="stylesheet" href="js/jquery-easyui-1.5/themes/icon.css" />
	<script src="js/jquery-easyui-1.5/jquery.min.js"></script>
	<script src="js/jquery-easyui-1.5/jquery.easyui.min.js"></script>
	<script src="js/jquery-easyui-1.5/plugins/jquery.form.js"></script>
	<script src="js/angular-1.2.0/angular.min.js"></script>
	<script type="text/javascript">
		// define angular module/app
		var formApp = angular.module('formApp', []);

		// create angular controller and pass in $scope and $http
		function formController($scope, $http, $location) {

			// create a blank object to hold our form information
			// $scope will allow this to pass between controller and view
			$scope.formData = {};

		}

		$(document).ready(
			function () {
				$("#login").click(
					function () {
						if ($("input[name='type']:checked").val() == "学生") {
							var json = {
								"student_id": $("#userName").val(),
								"student_pass": $("#logpass").val()
							};

							$.ajax({
								url: 'studentLogin',
								type: "POST",
								data: JSON.stringify(json), //转JSON字符串
								dataType: 'json',
								contentType: 'application/json;charset=utf-8',
								success: function (info) {
									if (info.result) {
										$.messager.alert('提示', info.information);
										//localStorage.setItem("user_id",$("#userName").val())
										window.location.href = "student_index.jsp?" + $("#userName").val();
									} else {
										$.messager.alert('提示', info.information);
									}
								},

							});
						} else {
							var json = {
								"teacher_id": $("#userName").val(),
								"teacher_pass": $("#logpass").val(),
							};

							$.ajax({
								url: 'teacherLogin',
								type: "POST",
								data: JSON.stringify(json), //转JSON字符串  
								dataType: 'json',
								contentType: 'application/json;charset=utf-8',
								success: function (info) {
									if (info.result) {
										$.messager.alert('提示', info.information);
										//localStorage.setItem("user_id",$("#userName").val())
										window.location.href = "teacher_index.jsp?" + $("#userName").val();
									} else {
										$.messager.alert('提示', info.information);
									}
								},
							});
						}
					});
			});
	</script>

</head>

<!-- apply the module and controller to our body so angular is applied to that -->

<body ng-app="formApp" ng-controller="formController">
	<div class="container col-md-12 col-sm-12 col-xs-12" id="con">
		<div class="col-md-4 col-sm-4 col-xs-4"></div>
		<div class="col-md-4 col-sm-4 col-xs-4" style="border: 3px solid #A2D2EE; padding: 50px; border-radius: 15px">

			<!-- PAGE TITLE -->
			<div class="page-header">

				<h1 style="word-break: keep-all; white-space: nowrap; color: #FFFFFF">
					<i> <img src='images/logo.png' style="width: 50px;" />
					</i>学生管理系统
				</h1>
			</div>

			<!-- NAME -->
			<div id="name-group" class="form-group col-md-12 col-sm-12 col-xs-12" ng-class="{ 'has-error' : errorName }">
				<div class="col-md-2 col-sm-12 col-xs-12">
					<label style="word-break: keep-all; color: #FFFFFF; line-height: 34px; font-size: 16px">
					用户名：&nbsp;
					</label>
				</div>
				<div class="col-md-10 col-sm-12 col-xs-12">
					<input type="text" id="userName" name="userName" ng-model="formData.userName" class="form-control"
						placeholder="userName" required>
				</div>
			</div>

			<!-- SUPERHERO NAME -->
			<div id="superhero-group" class="form-group col-md-12 col-sm-12 col-xs-12" ng-class="{ 'has-error' : errorSuperhero }">
				<div class="col-md-2 col-sm-12 col-xs-12">
					<label style="word-break: keep-all; white-space: nowrap; color: #FFFFFF; line-height: 34px; font-size: 16px">
						<span style="margin-left: 12px">密码：&nbsp;</span>
					</label>
				</div>
				<div class="col-md-10 col-sm-12 col-xs-12">
					<input type="password" id="logpass" name="password" ng-model="formData.password"
						class="form-control" placeholder="password" required>
				</div>
				<span class="help-block" ng-show="errorSuperhero"></span>
			</div>

			<label><input style="margin-left: 80px;" type="radio" name="type" value="学生" checked>学生</label>
			<label><input style="margin-left: 20px;" type="radio" name="type" value="老师">老师</label>
			<br> <br>

			<!-- SUBMIT BUTTON -->
			<div class="col-md-4 col-sm-3 col-xs-12" style="display: inline-block"></div>
			<button type="button" id="login" class="btn btn-success btn-lg col-md-4 col-sm-6 col-xs-12">登录</button>


		</div>

	</div>
	<script>
		var h = document.getElementById("con");
		var hh = h.offsetHeight;
		var ww = h.offsetWidth;
		console.log(hh);
		console.log(ww);
		$("#con").css({
			"position": "absolute",
			"top": "50%",
			"margin-top": -hh / 2 + "px"
		});

		/*$('#keyword').bind('keypress',function(event)
				{  
			alert('ok');
		    if(event.keyCode == "13") 
		    	$('#login').click();  
		}); */
		document.onkeydown = function (e) {
			//捕捉回车事件
			var ev = (typeof event != 'undefined') ? window.event : e;
			if (ev.keyCode == 13) {//activeElement活动事件,该事件只可以使用于输入域中
				$('#login').click();
			}
		}
		//	$("#con").css({"position": "absolute","top":"50%","left":"50%",
		//		"margin-top":-hh/2+"px","margin-left":-ww/2+"px"});
	</script>
</body>

</html>