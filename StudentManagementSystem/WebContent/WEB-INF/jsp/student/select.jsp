<%@ page language="java" contentType="text/html; charset=UTF8"
    pageEncoding="UTF8"%>


<table style="height: 100%;width:100%;">
	<tr>
		<td style="height: 100%;width:50%;">
			<table id="table1" style="height: 100%; width:100%; margin: 0px auto;">

			</table>
		</td>
		<td></td>
		<td style="height: 100%;width:50%;">
			<table id="table2" style="height: 100%; width:100%; margin: 0px auto;">

			</table>
		</td>
	</tr>
</table>

<script>
	var id

	$(function () {

		var url = location.search;
		id = url.substr(1)
		console.log(id);

	});

	$('#table1').datagrid({
		onClickRow: function (index, row) {
			console.log(row["class_id"]);
			var json = {
				"student_id": id,
				"class_id": row["class_id"],

			};

			$.ajax({
				url: 'studentselect',
				type: "POST",
				data: JSON.stringify(json), //转JSON字符串  
				dataType: 'json',
				contentType: 'application/json;charset=utf-8',
				success: function (info) {

					if (info.result) {
						$.messager.alert('提示', "选课成功");

					}
					else {
						$.messager.alert('提示', info.information);
					}
				},

			});

			$("#table1").datagrid("reload");
			$("#table2").datagrid("reload");
		},
		url: 'select/getselectclass?student_id=' + id,
		title: "待选课",
		singleSelect: true,
		columns: [[
			{ field: 'class_id', title: '课程id', width: 100, hidden: true },
			{ field: 'class_name', title: '课程名称', width: 100 },
			{ field: 'teacher_id', title: '老师id', width: 100, hidden: true },
			{ field: 'teacher_name', title: '老师姓名', width: 100 },
			{ field: 'class_address', title: '上课地点', width: 100 },
			{ field: 'class_time', title: '上课时间', width: 100 }
		]]
	});

	$('#table2').datagrid({
		url: 'select/getselectclassresult?student_id=' + id,
		title: "已选课",
		singleSelect: true,
		columns: [[
			{ field: 'class_id', title: '课程id', width: 100, hidden: true },
			{ field: 'class_name', title: '课程名称', width: 100 },
			{ field: 'teacher_id', title: '老师id', width: 100, hidden: true },
			{ field: 'teacher_name', title: '老师姓名', width: 100 },
			{ field: 'class_address', title: '上课地点', width: 100 },
			{ field: 'class_time', title: '上课时间', width: 100 }
		]]
	});


</script>