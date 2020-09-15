/**
 * 
 */
/**
 * 
 */
	data = "";
	submit = function(){
		 
			$.ajax({
				url:'saveOrUpdate',
				type:'POST',
				data:{id:$("#user_id").val(),
					firstName:$('#first-name').val(),
					middleName:$('#middle-name').val(),
					lastName:$('#last-name').val(),
					email:$('#email').val(),
					dateOfBirth:$('#date-of-birth').val(),
					age:$('#age').val(),
					password:$('#password').val()
					},
				success: function(response){
						alert(response.message);
						load();		
				}				
			});			
	}
	
	delete_ = function(id){		 
		 $.ajax({
			url:'delete',
			type:'POST',
			data:{user_id:id},
			success: function(response){
					alert(response.message);
					load();
			}				
		});
}
	
	edit = function (index){
		$("#user_id").val(data[index].user_id);
		$("#first-name").val(data[index].firstName);
		$("#middel-name").val(data[index].middleName);
		$("#last-name").val(data[index].lastName);
		$("#email").val(data[index].email);
		$("#date-of-birth").val(data[index].dateOfBirth);
		$("#age").val(data[index].age);
		$("#password").val(data[index].password);
	}
	
	load = function(){	
		$.ajax({
			url:'list',
			type:'POST',
			success: function(response){
					data = response.data;
					dataBindToTable(response);		
			}				
		});
		
	}
	
	function dataBindToTable(response){
		$('.tr').remove();
		for(i=0; i<response.data.length; i++){					
			$("#table").append(
					"<tr class='tr'> " +
					"<td> "+response.data[i].id+" </td> " +
					"<td> "+response.data[i].firstName+" </td> " +
					"<td> "+response.data[i].middleName+" </td> " +
					"<td> "+response.data[i].lastName+" </td> " +
					"<td> "+response.data[i].email+" </td>+ " +
					"<td> "+response.data[i].dateOfBirth+" </td>+ " +
					"<td> "+response.data[i].age+" </td>+ " +
					"<td> "+response.data[i].password+" </td>+ " +
					"<td><a href='#' onclick= edit("+i+");> Edit </a>  </td> " +
					"<td> <a href='#' onclick='delete_("+response.data[i].user_id+");'> Delete </a>  </td> </tr>");
		}	
	}
