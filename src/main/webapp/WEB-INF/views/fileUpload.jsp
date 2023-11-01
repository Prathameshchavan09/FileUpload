<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>File Uplaod</h1>

	<div class="container mt-5">
		<form action="uploadFile" method="POST" enctype="multipart/form-data">
			<div class="form-group">
				<label for="exampleFormControlFile1">Choose file</label>
				 <input
					type="file" name="fileData" class="form-control-file" id="exampleFormControlFile1">
			</div>
			
			<button class="btn btn-outline-success">Upload</button>
		</form>


	</div>

</body>
</html>