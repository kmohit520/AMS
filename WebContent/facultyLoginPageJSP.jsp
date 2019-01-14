<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<link rel="stylesheet" href="Project Images\Admin.css">

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>FacultyLoginPage</title>
<style>
.font {
	font-family: "Comic Sans MS", cursive, sans-serif;
}

body {
	background-image: url('img/image1.png');
	background-size: cover;
}
</style>

</head>
<body>
	<h1 style align="center" class="font">Welcome to Faculty Login
		Page</h1>
	<div class="container" align="center">
		<img src="Project Images\facultyLogin.png" alt="Admin" width="100px;" />
		<div class="a" style="margin-top: -2%;">
			<form action="LoginFacultyServlet" method="post" class="form"
				style="margin-top: 25px;">
				<div class="form-group">
					<p class="font">
						FACULTY ID <input type="text" class="form-control"
							placeholder="Faculty Id" name="facultyId"
							style="padding-left: 0px; margin-bottom: 10px; margin-top: 10px; width: 80%;" />
					</p>
					<br>
					<p class="font">
						PASSWORD <input type="password" class="form-control"
							placeholder="Password" name="facultyPassword" style="width: 80%;" />
					</p>
					<br>
				</div>
				<%
				String str = String.valueOf(request.getAttribute("auth"));
				if (str != null && str != "null" && str.equals("failed")) {
			%>
				<h5>Invalid Id or Password</h5>
				<%
				}
			%>
				<button class="btn-primary" type="submit"
					style="width: 80%; margin-top: -15%; margin-bottom: 8%;">Login</button>
				<br>
			</form>
</body>
</html>