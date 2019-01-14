<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<link rel="stylesheet" href="css//Admin.css">
<title>StudentHome!</title>

<style>
body {
	background-image: url('img/image1.png');
	background-size: cover;
	color: #fff;
}
</style>
</head>
<body>
	<center>

		<h1>Select Batch</h1>
		<div class="container " style="align: center;">

			<form action="MarkAttendanceServlet" method="post">
				<br> Year Name <br> <select name="year">
					<option>first</option>
					<option>second</option>
					<option>third</option>
					<option>fourth</option>
				</select> <br> <br> Student Branch <br> <select name="branch">
					<option>CSE</option>
					<option>EC</option>
					<option>IT</option>
					<option>ME</option>
					<option>CE</option>
					<option>EN</option>
				</select> <br> <br> Student Section <br> <select
					name="section">
					<option>A</option>
					<option>B</option>
					<option>C</option>
					<option>D</option>
				</select> <br> <br> Batch Name <br> <select name="batch">
					<option>CS-DS</option>
					<option>CS-CN</option>
					<option>CS-PA</option>
				</select> <br> <br> <br>
				<button type="submit">Submit</button>

			</form>

		</div>
	</center>

	<br>
	<br>
	<br>
	<br>
	<form method="link" action="Logout.jsp">
		<input type="submit" value="Logout" class="btn btn-primary"
			style="margin-left: 2%; margin-top: 2%" />
	</form>

	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
		integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
		integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
		crossorigin="anonymous"></script>
</body>
</html>