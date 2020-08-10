
var rescue = {

	registerMenuEvent:function(){
		$('#menu .tree').tree({
			onClick:function(node){
				//alert('我被点了一下');
				//console.log(node);    //浏览器控制台
				var tile = node.text;
				var href = node.attributes.href;
				var tab  = $('#tab').tabs('close',1);//打开一个关闭前一个
				$('#tab').tabs('add',{
					title:tile,
					href:href,
					closable:true
					
				});
			}
		});
	},

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	down:function(){
		
		var table =$('#table');
		var row =table.datagrid('getSelected');
		
		if(row)
		{	
			var json = {
	    			"nbbh" : row.nbbh,
	    		};
	    	$.ajax({
				url : 'process/applications/makeSureDown',
				type : "POST",
				data : JSON.stringify(json), //转JSON字符串  
				dataType : 'json',
				contentType : 'application/json;charset=utf-8',
				success : function(info) {
					
					if (info.success) {
						var url="downfile?nbbh="+row.nbbh;
						document.location.href=url;
					} 
					else{
						$.messager.alert('提示','请先上传文件然后在下载！！');
					}
				}
				
			});
			}
		else
			{
			$.messager.alert('提示','请先选择查看的案件！！');
			}
	     
	
},

	modify:function(){
		
		var table =$('#table');
		var row =table.datagrid('getSelected');
		
		if(row)
		{	
				//row.pxh
			$.messager.prompt('提示', '请输入您要修改的简易描述：', function(r){  
			    if (r){  
			    	var json = {
			    			"nbbh" : row.nbbh,
			    			"jyms" : r,
			    		};
			    	$.ajax({
						url : 'process/applications/modify',
						type : "POST",
						data : JSON.stringify(json), //转JSON字符串  
						dataType : 'json',
						contentType : 'application/json;charset=utf-8',
						success : function(info) {
							
							if (info.message.indexOf("success") != -1) {
								$('#table').datagrid('reload');
								$.messager.alert('提示','修改成功！');
							} 
						}
						
					});
			    	
			    }  
			});
			
			}
		else
			{
			$.messager.alert('提示','请先选择查看的案件！！');
			}
	     
	
},
	
	
	
//VoteOpinion
	
	VoteOpinion:function(){
		$('#win').window('open');
		
		$('#table3').datagrid({
			title : '备选表决意见',
			url : 'process/applications/VoteOpinion',
			pagination : true,
			fit: true,
			toolbar : '#toolbar2',
			columns : [ [ 
			          {field:'ck',checkbox:true},
			          {field:'id',title:'操作',formatter:function(value,row,index){
				    		
				    		var url='rescue/delete';
				    		return '<a onclick="rescue.deleteById('+value+',\''+url+'\')" href="javascript:void(0)">删除</a>';
				    }},  
			{
				field : 'bjyj',
				title : '表决意见'
			}] ]
		});
	},

	addVoteOpinion:function(){
		//row.pxh
		$.messager.prompt('提示', '请输入您要添加的表决意见：', function(r){  
		    if (r){  
		    	var data =$('#table3').datagrid('getData');
		    	//data.total+1    	
		    	var json = {
		    			"nbbh":data.total+1 ,
		    			"id" : data.total+1 ,
		    			"bjyj" : r,
		    		};
		    	$.ajax({
					url : 'process/applications/addVoteOpinion',
					type : "POST",
					data : JSON.stringify(json), //转JSON字符串  
					dataType : 'json',
					contentType : 'application/json;charset=utf-8',
					success : function(info) {
						
						if (info.message.indexOf("success") != -1) {
							$('#table3').datagrid('reload');
							$.messager.alert('提示','修改成功！');
							
							
						} 
					}
					
				});
		    	
		    }  
		});
		
	},
	
	
	deleteById:function(id,href){
		
		$.messager.confirm('确认','您确实要删除这条记录吗？？？',function(r){
			if(r){
				$.get(href+'?id='+id,function(data){
					if(data.success){
						$.messager.alert('提示','删除成功','info');
						$('#table3').datagrid('reload');
					}
				});
			}
		})
	},
	delMulti:function(href){
 
		var queryString=rescue.getSelectionsIds();
		if(queryString.length==0){
			$.messager.alert('提示','未选中记录','warning');
			return;
		}
			
		$.messager.confirm('确认','您确实要删除这些记录吗？？？',function(r){
			if(r){
				$.get(href +=queryString,function(data){
					if(data.success){
						$.messager.alert('提示','删除'+data.count+'条记录成功','info');
						$('#table3').datagrid('reload');
					}
				});
			}//if(r)
		})
	},

	
	getSelectionsIds:function( ){
		var table =$('#table3');
		var rows =table.datagrid('getSelections');
		console.log(rows);
		var queryString='';
		for(var i=0;i<rows.length;i++){
			var id =rows[i].id;
			if(i>0){
				queryString+='&';
			}
			queryString+='ids='+id;
		}
		return queryString;
	},
	
	//closeVoteOpinion  关闭VoteOpinion窗口
	closeVoteOpinion:function( ){
		$('#win').window('close');
	},
	ReportForApproval :function(){
		//ReportForApproval_window
		var table =$('#table');
		var row =table.datagrid('getSelected');
		if(row){
			//alert(row.nbbh);
			$('#ReportForApproval_window').window('open');
			//ReportForApproval_table
			$('#ReportForApproval_table').datagrid({
				align : 'left',
				halign : 'center',
				url : 'process/applications/getReportForApproval',
				rownumbers : true,
				pagination : true,
				singleSelect:true,
				columns : [ [ {
					field : 'username',
					title : '姓名'
				}, {
					field : 'shortname',
					title : '部门',
					
				} ] ]
			});
		}
		else{
			$.messager.alert('提示','请先选择案件');
		}
	},
	ConfirmReportForApproval:function(){
		var table =$('#table');
		var row =table.datagrid('getSelected');
		var ReportForApproval_table =$('#ReportForApproval_table');
		var row1 =ReportForApproval_table.datagrid('getSelected');
		//alert(row.nbbh+row1.username);
		var json = {
    			"nbbh":row.nbbh,
    			"spr" : row1.username,
    		};
    	$.ajax({
			url : 'process/applications/ConfirmReportForApproval',
			type : "POST",
			data : JSON.stringify(json), //转JSON字符串  
			dataType : 'json',
			contentType : 'application/json;charset=utf-8',
			success : function(info) {
				
				if (info.message.indexOf("success") != -1) {
					
					$.messager.alert('提示','报审批成功！');
				} 
			}
			
		});
	},
	closeReportForApproval :function(){
		$('#ReportForApproval_window').window('close');
	},
	OpenUpload:function( ){
		
		var table =$('#table');
		var row =table.datagrid('getSelected');
		if(row){
			$('#upload_window').window('open');
			
			$("#nbbh").val(row.nbbh);
		}
		else{
			$.messager.alert('提示','请先选择案件！');
		}
		
	}
};



