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
}
</style>
</head>
<body>

	<h1>Raise Query</h1>
	<div class="container" align="center">

		<img src="img/raiseQuery.png" alt="Admin" width="100px;" />
		<div class="a" style="margin-top: 0%;">

			<form action="StudentRaiseQueryServlet" method="post" class="form"
				style="margin-top: 25px;">

				<div class="form-group">
					Faculty Name <input type="text" class="form-control"
						placeholder="Faculty Name" name="FacultyName"
						style="padding-left: 0px; margin-bottom: 10px; margin-top: 10px; width: 80%;"><br>
				</div>

				<div class="form-group" style="margin-top: -5%;">
					Query
					<textarea rows="4" cols="50" class="form-control"
						placeholder="Query" name="query" style="width: 80%;"></textarea>
					<br>
				</div>
				<%  String str2 = String.valueOf(session.getAttribute("roll")); 
             session.setAttribute("roll2" , str2); 
         %>
				<button class="btn-primary" type="submit"
					style="width: 80%; margin-top: -15%; margin-bottom: 8%;">Submit</button>
				<br>

				<%
			String str3 = String.valueOf(request.getAttribute("auth"));
			if (str3 != null && str3 != "null" && str3.equals("failed")) {
		%>
				<h5>Invalid Query</h5>
				<%
			}
		%>

				<%
			String str4 = String.valueOf(request.getAttribute("auth"));
			if (str4 != null && str4 != "null" && str4.equals("pass")) {
		%>
				<h5>Student Query SuccessFully Submitted</h5>
				<%
			}
		%>
			</form>
		</div>
	</div>
	>

	<form method="link" action="Logout.jsp">
		<input type="submit" value="Logout" class="btn btn-primary mybtn"
			style="margin-left: 1219px; margin-bottom: -x; margin-top: -976px;" />
	</form>

	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
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
