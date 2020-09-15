<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>File Upload</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
</head>
<body>

	<h1> File Upload </h1>
			<form id='fileUpload' onsubmit="return false;">
				File <input type='file' id='file' multiple="multiple">
				<button onclick="uplaod();">Upload</button>
			</form>
			
	<script type="text/javascript">
	
	uplaod = function(){
		
		var data = new FormData();
		
		jQuery.each(jQuery('#file')[0].files, function(i, file){
			data.append('file-'+i, file);
		})
		
		$.ajax({
			url:'fileUpload',
			data: data,
		    cache: false,
		    contentType: false,
		    processData: false,
			type:'POST',
			success: function(response){
				if(response.Status == 200){
					alert(response.SucessfulList);
				}else{
					alert('Error');
				}
			
					
			}				
		});
		
	}
	</script>
</body>
</html>
