<%@ page language="java" contentType="text/html; charset=UTF8"
    pageEncoding="UTF8"%>



<p>新密码</p>
<input id="pass1" type="password" class="easyui-textbox" data-options="iconCls:'icon-search'" style="width:300px">

<p>确认密码</p>
<input id="pass2" type="password" class="easyui-textbox" data-options="iconCls:'icon-search'" style="width:300px">
<br>

<button id="btn" onclick="updatepass()" class="easyui-linkbutton" data-options="iconCls:'icon-edit'">确认</button>



<script>


	var id

	$(function () {

		var url = location.search;
		id = url.substr(1)
		console.log(id);

	});


	function updatepass() {

		console.log($("#pass1").val());
		if ($("#pass1").val() == $("#pass2").val()) {
			var json = {
				"student_id": id,
				"student_pass": $("#pass1").val(),

			};

			$.ajax({
				url: 'studentupdatepass',
				type: "POST",
				data: JSON.stringify(json), //转JSON字符串  
				dataType: 'json',
				contentType: 'application/json;charset=utf-8',
				success: function (info) {

					if (info.result) {
						$.messager.alert('提示', "修改成功");

					}
					else {
						$.messager.alert('提示', info.information);
					}
				},

			});
		}
		else {
			$.messager.alert('提示', "两次密码不相同");
		}
	}


</script>