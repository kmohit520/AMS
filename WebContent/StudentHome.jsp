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
	<h1>Welcome to Student Home</h1>

	<br>

	<%  String str = String.valueOf(request.getAttribute("roll")); 
     
%>


	<div class="container" align="center">

		<div class="row" style="margin-top: 12%;">
			<form method="post" action="StudentViewAttendanceServlet">
				<% session.setAttribute("roll" , str); 
         
       %>
				<div class="col-md-4">
					<div class="card" style="width: 18rem; height: 20rem;">
						<img class="card-img-top" src="img/viewAttendance2.png"
							alt="Card image cap" style="height: 175px;">
						<div class="card-body">
							<h5 class="card-title">View Attendance of All Subjects</h5>
							<button type="submit" class="btn btn-primary">View</button>
						</div>
					</div>
				</div>
			</form>


			<form action="studentRaiseQuery.jsp">
				<% session.setAttribute("roll" , str); 
       %>

				<div class="col-md-4">
					<div class="card" style="width: 18rem; height: 20rem;">
						<img class="card-img-top" src="img/raiseQuery.png"
							alt="Card image cap" style="height: 175px;">
						<div class="card-body">
							<h5 class="card-title">Raise a Query for Leave or Mistakes</h5>

							<button type="submit" class="btn btn-primary">Raise</button>
						</div>
					</div>
				</div>
			</form>


			<form method="post" action="CheckDetainCriteriaServlet">
				<% session.setAttribute("roll" , str); 
       %>

				<div class="col-md-4">
					<div class="card" style="width: 18rem; height: 19.8rem;">
						<img class="card-img-top" src="img/detainCriteria.png"
							alt="Card image cap" style="height: 175px;">
						<div class="card-body">
							<h5 class="card-title">Calculate Detaining Criteria</h5>

							<button type="submit" class="btn btn-danger">Calculate</button>
						</div>
					</div>
				</div>
			</form>

		</div>

	</div>


	<br>
	<br>
	<br>
	<br>
	<form method="link" action="Logout.jsp">
		<input type="submit" value="Logout" class="btn btn-primary"
			style="margin-left: 1219px; margin-bottom: -x; margin-top: -1118px;" />
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
