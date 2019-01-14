<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AdminCreateNewFaculty</title>
<style>
.font {
	font-family: "Comic Sans MS", cursive, sans-serif;
	font-size: 24px;
	margin-left: 50px;
}

.font1 {
	font-family: "Comic Sans MS", cursive, sans-serif;
	font-size: 36px;
	margin-left: 50px;
}
</style>

</head>
<body background="Project Images\admincreatenewfaculty.jpg">
	<h2>
		<p class="font1">
			<a href="AdminHome.jsp">Admin Home</a>
		</p>
	</h2>
	<form method="link" action="Logout.jsp">
		<br>
		<p class="font">
			<input type="submit" value="Logout" />
		</p>

		<form action="AdminCreateNewFaculityServlet" method="post">
			<br>
			<br>
			<p class="font">
				Faculty Id <input type="text"
					style="padding-left: 0px; margin-left: 155px; margin-bottom: 10px; margin-top: 10px;name="
					FacId" required>
			</p>
			<p class="font">
				Faculty Password <input type="text"
					style="padding-left: 0px; margin-left: 80px; margin-bottom: 10px; margin-top: 10px;"
					FacPass" required>
			</p>
			<p class="font">
				Faculty Name <input type="text"
					style="padding-left: 0px; margin-left: 125px; margin-bottom: 10px; margin-top: 10px;"
					FacName" required>
			</p>
			<p class="font">
				Faculty Contact Number <input type="text"
					style="padding-left: 0px; margin-left: 5px; margin-bottom: 10px; margin-top: 10px;"
					FacContactNo" required>
			</p>
			<p class="font">
				Faculty Email <input type="email"
					style="padding-left: 0px; margin-left: 130px; margin-bottom: 10px; margin-top: 10px;"
					FacEmail" required>
			</p>
			<p class="font">
				Batch Name <input type="text"
					style="padding-left: 0px; margin-left: 140px; margin-bottom: 10px; margin-top: 10px;"
					FacBatchName" required>
			</p>
			<br>
			<br>
			<p class="font">
				<button type="submit" value="submit">Submit</button>
			</p>

			<%
				String str = String.valueOf(request.getAttribute("auth"));
				if (str != null && str != "null" && str.equals("failed")) {
			%>
			<h5>Invalid Query</h5>
			<%
				}
		%>

			<%
				String str2 = String.valueOf(request.getAttribute("auth"));
				if (str2 != null && str2 != "null" && str2.equals("pass")) {
			%>
			<h5>Faculty SuccessFull Added</h5>
			<%
				}
		%>
		</form>

		<br> <br> <br>

	</form>
</body>
</html>