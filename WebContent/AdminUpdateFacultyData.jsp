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
<title>AdminUpdateFacultyData</title>
<style>
.font {
	font-family: "Comic Sans MS", cursive, sans-serif;
	font-size: 24px;
	margin-left: 50px;
}

.special {
	font-family: "Comic Sans MS", cursive, sans-serif;
	font-size: 30px;
	font-weight: bold;
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
	<p class="font1">
		<a href="AdminHome.jsp">Admin Home</a>
	</p>
	<form method="link" action="Logout.jsp">
		<p class="font">
			<input type="submit" value="Logout" />
		</p>
	</form>

	<h4>
		<form action="AdminUpdateFaculityServlet" method="post">
			<p class="special">
				Update Table of <br>
			</p>

			<p class="font">
				<input type="radio" name="newAdmin" value="newFacId">
				Faculty Id <br>
			</p>
			<p class="font">
				<input type="radio" name="newAdmin" value="newFacPass">
				Faculty Password <br>
			</p>
			<p class="font">
				<input type="radio" name="newAdmin" value="newFacName">
				Faculty Name <br>
			</p>
			<p class="font">
				<input type="radio" name="newAdmin" value="newFacContactNo">
				Faculty Contact <br>
			</p>
			<p class="font">
				<input type="radio" name="newAdmin" value="newFacEmail">
				Faculty Email <br>
			</p>
			<p class="font">
				<input type="radio" name="newAdmin" value="newFacBatchName">
				Batch Name <br>
			</p>

			<p class="special">
				With new value <br>
			</p>

			<p class="font">
				<input type="text" name="NewData"> <br>
			</p>

			<p class="special">
				Where Old Data of <br>
			</p>

			<p class="font">
				<input type="radio" name="admin" value="FacId"> Faculty Id <br>
			</p>
			<p class="font">
				<input type="radio" name="admin" value="FacPass"> Faculty
				Password <br>
			</p>
			<p class="font">
				<input type="radio" name="admin" value="FacName"> Faculty
				Name <br>
			</p>
			<p class="font">
				<input type="radio" name="admin" value="FacContactNo">
				Faculty Contact <br>
			</p>
			<p class="font">
				<input type="radio" name="admin" value="FacEmail"> Faculty
				Email <br>
			</p>
			<p class="font">
				<input type="radio" name="admin" value="FacBatchName"> Batch
				Name <br>
			</p>

			<p class="special">
				is <br>
			</p>

			<p class="font">
				<input type="text" name="ValueToMatch"> <br>
			</p>
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
			<h5>Faculty SuccessFully Updated</h5>
			<%
			}
		%>
			<br>
			<br> <br> <br> <br> <br>

		</form>
	</h4>
</body>
</html>