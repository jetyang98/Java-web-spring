<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()+ path + "/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html 
	xmlns="http://www.w3.org/1999/xhtml" 
	xmlns:f="http://java.sun.com/jsf/core"
	xmlns:h="http://java.sun.com/jsf/html">

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<title>我是主页</title>
	<!-- easyui -->
	<link rel="stylesheet" href="/static/js/jquery-easyui-1.5/themes/default/easyui.css" />
	<link rel="stylesheet" href="/static/js/jquery-easyui-1.5/themes/icon.css" />

	<!-- 自定义css -->
	<link rel="stylesheet" href="/static/css/web.css" />
</head>

<body class="easyui-layout">
	<div data-options="region:'north'"
		style="height:85px;background-image:url(/static/images/bg1.jpg);background-size:100% 100%">
	</div>

	<div data-options="region:'west',title:'菜单',split:true" style="width:255px;">
		<div id="menu" class="easyui-accordion" style="width:250px;height:255px;">
			<div title="学生身份" data-options="selected:true" style="overflow:auto;padding:10px;">
				<ul class="easyui-tree">
					<li data-options="attributes:{'href':'/student-select'}">学生选课</li>
					<li data-options="attributes:{'href':'/student-find'}">查看成绩</li>
					<li data-options="attributes:{'href':'/student-updatepass'}">修改密码</li>
				</ul>
			</div>
		</div>
	</div>
	<div data-options="region:'center'">
		<div id="tab" class="easyui-tabs" data-options="fit:true">
			<div title="首页">欢迎登陆</div>
		</div>
	</div>

	<!-- jQuery -->
	<script src="/static/js/jquery-easyui-1.5/jquery.min.js"></script>
	<!-- easyui -->
	<script src="/static/js/jquery-easyui-1.5/jquery.easyui.min.js"></script>
	<script src="/static/js/jquery-easyui-1.5/plugins/jquery.form.js"></script>
	<!-- 日期函数库 -->
	<script src="/static/js/jquery-easyui-1.5/locale/easyui-lang-zh_CN.js"></script>
	<script src="/static/js/moment-with-locales.js"></script>
	<script>
		moment.locale('zh-cn');
	</script>
	<!-- 日期函数库 -->
	<!-- 自定义js -->
	<script src="/static/js/common.js"></script>
	<script>

		//var version =document.getelementById("version");
		//version.innerHTML=rescue.version;

		//当页面全部加载完成后再执行其中的代码
		$(function () {

			var url = location.search;
			var id = url.substr(1)
			console.log(id);

			/* var version = document.getElementById('version');
			version.innerHTML = rescue.version; */
			//$('#version').html(rescue.version);

			rescue.registerMenuEvent();
		});
	</script>



</body>

</html>