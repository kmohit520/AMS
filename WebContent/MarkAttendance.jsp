<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	import="java.util.List,java.util.Iterator,model.Batch,controller.MarkAttendanceServlet"%>
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
	color: #ffffff;
	background-image: url('img/image1.png');
	background-size: cover;
}
</style>
</head>
<body>
	<br>
	<br>

	<h1>Mark Attendance</h1>
	<br>
	<br>

	<form method="post" action="MarkAttendanceServlet">
		<%
			String[] strP = request.getParameterValues("StudentId");
			if (strP != null) {
		%>
		<h1><%=strP[0]%></h1>
		<%
			}
		%>

		<div style="text-color: #fff;">
			<table>
				<thead>

					<td>Name</td>
					<td>Id</td>
					<td>Subject Name</td>
					<td>Batch Name</td>
					<td>Section</td>
					<td>Branch</td>
					<td>Year</td>

					<td>Day1</td>
					<td>Day2</td>
					<td>Day3</td>
					<td>Day4</td>
					<td>Day5</td>
					<td>Day6</td>
					<td>Day7</td>
					<td>Day8</td>
					<td>Day9</td>
					<td>Day10</td>
					<td>Day11</td>
					<td>Day12</td>
					<td>Day13</td>
					<td>Day14</td>
					<td>Day15</td>
					<td>Day16</td>
					<td>Day17</td>
					<td>Day18</td>
					<td>Day19</td>
					<td>Day20</td>
					<td>Day21</td>
					<td>Day22</td>
					<td>Day23</td>
					<td>Day24</td>
					<td>Day25</td>
					<td>Day26</td>
					<td>Day27</td>
					<td>Day28</td>
					<td>Day29</td>
					<td>Day30</td>
					<td>Day31</td>
				</thead>
				<%
					List<Batch> l = (List<Batch>) request.getAttribute("listFetched");
					if (l != null) {
						Iterator<Batch> it = l.iterator();
						Batch b = null;
						while (it.hasNext()) {
							b = it.next();
				%>

				<tr>


					<td><input type="text" value=<%=b.getSTUDENTNAME()%>
						name="StudentName" disabled="disabled" /></td>
					<td><input type="text"
						value=<%=String.valueOf(b.getSTUDENTID())%> name="StudentId"
						disabled="disabled" /></td>



					<td><input type="text" value=<%=b.getSUBJECTNAME()%>
						name="SubjectName" disabled="disabled" /></td>
					<td><input type="text" value=<%=b.getBATCHNAME()%>
						name="BatchName" disabled="disabled" /></td>
					<td><input type="text" value=<%=b.getSTUDENTSECTION()%>
						name="StudentSection" disabled="disabled" /></td>
					<td><input type="text" value=<%=b.getStudentBranch()%>
						name="StudentBranch" disabled="disabled" /></td>
					<td><input type="text" value=<%=b.getStudentYear()%>
						name="StudentYear" disabled="disabled" /></td>


					<td><input type="text" value=<%=b.getDAY1()%> name="D1" /></td>
					<td><input type="text" value=<%=b.getDAY2()%> name="D2" /></td>
					<td><input type="text" value=<%=b.getDAY3()%> name="D3" /></td>
					<td><input type="text" value=<%=b.getDAY4()%> name="D4" /></td>
					<td><input type="text" value=<%=b.getDAY5()%> name="D5" /></td>
					<td><input type="text" value=<%=b.getDAY6()%> name="D6" /></td>
					<td><input type="text" value=<%=b.getDAY7()%> name="D7" /></td>
					<td><input type="text" value=<%=b.getDAY8()%> name="D8" /></td>
					<td><input type="text" value=<%=b.getDAY9()%> name="D9" /></td>
					<td><input type="text" value=<%=b.getDAY10()%> name="D10" />
					</td>
					<td><input type="text" value=<%=b.getDAY11()%> name="D11" />
					</td>
					<td><input type="text" value=<%=b.getDAY12()%> name="D12" />
					</td>
					<td><input type="text" value=<%=b.getDAY13()%> name="D13" />
					</td>
					<td><input type="text" value=<%=b.getDAY14()%> name="D14" />
					</td>
					<td><input type="text" value=<%=b.getDAY15()%> name="D15" />
					</td>
					<td><input type="text" value=<%=b.getDAY16()%> name="D16" /></td>
					<td><input type="text" value=<%=b.getDAY17()%> name="D17" /></td>
					<td><input type="text" value=<%=b.getDAY18()%> name="D18" /></td>
					<td><input type="text" value=<%=b.getDAY19()%> name="D19" />
					</td>
					<td><input type="text" value=<%=b.getDAY20()%> name="D20" />
					</td>
					<td><input type="text" value=<%=b.getDAY21()%> name="D21" />
					</td>
					<td><input type="text" value=<%=b.getDAY22()%> name="D22" />
					</td>
					<td><input type="text" value=<%=b.getDAY23()%> name="D23" />
					</td>
					<td><input type="text" value=<%=b.getDAY24()%> name="D24" />
					</td>
					<td><input type="text" value=<%=b.getDAY25()%> name="D25" /></td>
					<td><input type="text" value=<%=b.getDAY26()%> name="D26" /></td>
					<td><input type="text" value=<%=b.getDAY27()%> name="D27" /></td>
					<td><input type="text" value=<%=b.getDAY28()%> name="D28" /></td>
					<td><input type="text" value=<%=b.getDAY29()%> name="D29" />
					</td>
					<td><input type="text" value=<%=b.getDAY30()%> name="D30" />
					</td>
					<td><input type="text" value=<%=b.getDAY31()%> name="D31" />
					</td>
				</tr>
				<%
					}
				%>
				<%
					}
				%>
			</table>
		</div>

		<%
			String str = String.valueOf(request.getAttribute("auth"));
			if (str != null && str != "null" && str.equals("failed")) {
		%>
		<h5>Updation Failed</h5>
		<%
			}
		%>
		<center>
			<button type="submit">Submit Attendance</button>
		</center>
	</form>
	<center>
		<br> <br> <br> <br>
		<form method="link" action="Logout.jsp">
			<input type="submit" value="Logout" />
		</form>
	</center>
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