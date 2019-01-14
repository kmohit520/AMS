<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<link rel="stylesheet" href="Project Images/Admin.css">
<title>AdminLoginPage</title>
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
	<h1 style align="center" class="font">Welcome to Admin Login Page</h1>
	<div class="container" align="center">
		<img src="Project Images/adminloginpage.png" alt="Admin"
			width="100px;" />
		<div class="a" style="margin-top: -2%;">
			<form class="form" action="LoginAdminServlet" method="post"
				style="margin-top: 25px;">
				<p class="font">
					ADMIN ID <input type="text" class="form-control"
						placeholder="adminId" name="adminId" required
						style="padding-left: 0px; margin-left: 0px; margin-bottom: 10px; margin-top: 10px;">
				</p>
				<br>
				<p class="font">
					ADMIN PASSWORD <input type="password" class="form-control"
						placeholder="Password" name="adminPassword" required>
				</p>
				<br>

				<%
				String str = String.valueOf(request.getAttribute("auth"));
				if (str != null && str != "null" && str.equals("failed")) {
			%>
				<h5>Invalid Id or Password</h5>
				<%
				}
			%>
				<button class="btn-primary" type="submit"
					style="margin-top: 5px; margin-bottom: 5px;">Login</button>
				<br>
			</form>
</body>
</html>