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
<link rel="stylesheet" href="">
<title>View Attendance!</title>

<style>
body {
	background-image: url("img//doodles.png");
	background-repeat: repeat;
}
</style>

</head>

<body>
	<%@page import="java.util.ArrayList" import=" model.Batch"%>
	<%
      
      Batch b = new Batch();      
      ArrayList <Batch> a = new ArrayList<Batch>();
      
      a = (ArrayList<Batch>) request.getAttribute("list");
   		
      b = a.get(0);
      %>
	<div class="container">
		<div class="row">
			<div class="col-md-4" style="background-color: white;">
				<h1>Attendance</h1>
				<h2>
					<%out.print(b.getSTUDENTNAME());%>
				</h2>
				<h3>
					<%out.print(b.getSTUDENTID()); %>
					&nbsp;
					<%out.print(b.getStudentYear() + " yr");%>&nbsp;
					<%out.print(b.getStudentBranch());%>&nbsp;
					<%out.print(b.getSTUDENTSECTION()); %>
				</h3>
			</div>
		</div>
	</div>
	<%     
      for(int i=0 ;i<a.size();i++)
      {
    	  b = a.get(i);
    	  
    	  %>


	<table>

		<tr>


			<td><h4>
					<%out.print(b.getSUBJECTNAME()); %>
				</h4></td>

		</tr>
	</table>

	<table class="table table-striped table-dark">

		<thead>
			<tr>
				<th scope="col">Day1</th>
				<th scope="col">Day2</th>
				<th scope="col">Day3</th>
				<th scope="col">Day4</th>

				<th scope="col">Day5</th>
				<th scope="col">Day6</th>
				<th scope="col">Day7</th>
				<th scope="col">Day8</th>

				<th scope="col">Day9</th>
				<th scope="col">Day10</th>
				<th scope="col">Day11</th>
				<th scope="col">Day12</th>

				<th scope="col">Day13</th>
				<th scope="col">Day14</th>
				<th scope="col">Day15</th>
				<th scope="col">Day16</th>

				<th scope="col">Day17</th>
				<th scope="col">Day18</th>
				<th scope="col">Day19</th>
				<th scope="col">Day20</th>

				<th scope="col">Day21</th>
				<th scope="col">Day22</th>
				<th scope="col">Day23</th>
				<th scope="col">Day24</th>

				<th scope="col">Day25</th>
				<th scope="col">Day26</th>
				<th scope="col">Day27</th>
				<th scope="col">Day28</th>

				<th scope="col">Day29</th>
				<th scope="col">Day30</th>
				<th scope="col">Day31</th>

			</tr>
		</thead>

		<tbody>
			<tr>
				<td>
					<%out.print(b.getDAY1());%>
				</td>
				<td>
					<%out.print(b.getDAY2());%>
				</td>
				<td>
					<%out.print(b.getDAY3());%>
				</td>
				<td>
					<%out.print(b.getDAY4());%>
				</td>
				<td>
					<%out.print(b.getDAY5());%>
				</td>
				<td>
					<%out.print(b.getDAY6());%>
				</td>
				<td>
					<%out.print(b.getDAY7());%>
				</td>

				<td>
					<%out.print(b.getDAY8());%>
				</td>
				<td>
					<%out.print(b.getDAY9());%>
				</td>
				<td>
					<%out.print(b.getDAY10());%>
				</td>
				<td>
					<%out.print(b.getDAY11());%>
				</td>
				<td>
					<%out.print(b.getDAY12());%>
				</td>
				<td>
					<%out.print(b.getDAY13());%>
				</td>
				<td>
					<%out.print(b.getDAY14());%>
				</td>

				<td>
					<%out.print(b.getDAY15());%>
				</td>
				<td>
					<%out.print(b.getDAY16());%>
				</td>
				<td>
					<%out.print(b.getDAY17());%>
				</td>
				<td>
					<%out.print(b.getDAY18());%>
				</td>
				<td>
					<%out.print(b.getDAY19());%>
				</td>
				<td>
					<%out.print(b.getDAY20());%>
				</td>
				<td>
					<%out.print(b.getDAY21());%>
				</td>

				<td>
					<%out.print(b.getDAY22());%>
				</td>
				<td>
					<%out.print(b.getDAY23());%>
				</td>
				<td>
					<%out.print(b.getDAY24());%>
				</td>
				<td>
					<%out.print(b.getDAY25());%>
				</td>
				<td>
					<%out.print(b.getDAY26());%>
				</td>
				<td>
					<%out.print(b.getDAY27());%>
				</td>
				<td>
					<%out.print(b.getDAY28());%>
				</td>
				<td>
					<%out.print(b.getDAY29());%>
				</td>
				<td>
					<%out.print(b.getDAY30());%>
				</td>
				<td>
					<%out.print(b.getDAY31());%>
				</td>


			</tr>
		</tbody>
	</table>

	<%   }
      %>

	<form method="link" action="Logout.jsp">
		<input type="submit" value="Logout" class="btn btn-primary"
			style="margin-left: 1219px; margin-bottom: -x; margin-top: -982px;" />
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









