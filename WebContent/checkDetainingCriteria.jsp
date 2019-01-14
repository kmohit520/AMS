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
<link rel="stylesheet" href="css/Admin.css">
<title>Hello, world!</title>
<style>
body {
	background-image: url("img//doodles.png");
	background-repeat: repeat;
}
</style>

</head>
<body>
	<div style="margin: 2%;">
		<form method="link" action="Logout.jsp">
			<input type="submit" value="Logout" class="btn btn-primary mybtn" />
		</form>
	</div>
	<%@page import="java.util.ArrayList" import=" model.Batch"%>
	<%
      int sum = 0 , total = 23 ,Required,c=0,finalSum=0;
      double percent,RequiredPercent;
      
      Batch b1 = new Batch();      
      ArrayList <Batch> a1 = new ArrayList<Batch>();
      
      a1 = (ArrayList<Batch>) session.getAttribute("list");
   		
      b1 = a1.get(0);
      %>
	<div class="container">
		<div class="row">
			<div class="col-md-4" style="background-color: white;">
				<h1>Detain Criteria</h1>
				<h2>
					<%out.print(b1.getSTUDENTNAME());%>
				</h2>
				<h3>
					<%out.print(b1.getSTUDENTID()); %>
					&nbsp;
					<%out.print(b1.getStudentYear() + " year");%>&nbsp;
					<%out.print(b1.getStudentBranch());%>&nbsp;
					<%out.print(b1.getSTUDENTSECTION()); %>
				</h3>
			</div>
		</div>
	</div>
	<%     
      for(int i=0 ;i<a1.size();i++)
      {
    	  b1 = a1.get(i);
    	  
    	  %>

	<div class="container ">
		<table>
			<tr>

				<td><h4>
						<%out.print(b1.getSUBJECTNAME()); %>
					</h4></td>

			</tr>
		</table>

		<table class="table table-striped table-dark ">

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
						<%String[] arr = new String[31];
               arr[0] = b1.getDAY1();
               out.print(arr[0]);%>
					</td>
					<td>
						<%arr[1] = b1.getDAY2();out.print(arr[1]);%>
					</td>
					<td>
						<%arr[2] = b1.getDAY3();out.print(arr[2]);%>
					</td>
					<td>
						<%arr[3] = b1.getDAY4();out.print(arr[3]);%>
					</td>
					<td>
						<%arr[4] = b1.getDAY5();out.print(arr[4]);%>
					</td>
					<td>
						<%arr[5] = b1.getDAY6();out.print(arr[5]);%>
					</td>
					<td>
						<%arr[6] = b1.getDAY7();out.print(arr[6]);%>
					</td>

					<td>
						<%arr[7] = b1.getDAY8();out.print(arr[7]);%>
					</td>
					<td>
						<%arr[8] = b1.getDAY9();out.print(arr[8]);%>
					</td>
					<td>
						<%arr[9] = b1.getDAY10();out.print(arr[9]);%>
					</td>
					<td>
						<%arr[10] = b1.getDAY11();out.print(arr[10]);%>
					</td>
					<td>
						<%arr[11] = b1.getDAY12();out.print(arr[11]);%>
					</td>
					<td>
						<%arr[12] = b1.getDAY13();out.print(arr[12]);%>
					</td>
					<td>
						<%arr[13] = b1.getDAY14();out.print(arr[13]);%>
					</td>

					<td>
						<%arr[14] = b1.getDAY15();out.print(arr[14]);%>
					</td>
					<td>
						<%arr[15] = b1.getDAY16();out.print(arr[15]);%>
					</td>
					<td>
						<%arr[16] = b1.getDAY17();out.print(arr[16]);%>
					</td>
					<td>
						<%arr[17] = b1.getDAY18();out.print(arr[17]);%>
					</td>
					<td>
						<%arr[18] = b1.getDAY19();out.print(arr[18]);%>
					</td>
					<td>
						<%arr[19] = b1.getDAY20();out.print(arr[19]);%>
					</td>
					<td>
						<%arr[20] = b1.getDAY21();out.print(arr[20]);%>
					</td>

					<td>
						<%arr[21] = b1.getDAY22();out.print(arr[21]);%>
					</td>
					<td>
						<%arr[22] = b1.getDAY23();out.print(arr[22]);%>
					</td>
					<td>
						<%arr[23] = b1.getDAY24();out.print(arr[23]);%>
					</td>
					<td>
						<%arr[24] = b1.getDAY25();out.print(arr[24]);%>
					</td>
					<td>
						<%arr[25] = b1.getDAY26();out.print(arr[25]);%>
					</td>
					<td>
						<%arr[26] = b1.getDAY27();out.print(arr[26]);%>
					</td>
					<td>
						<%arr[27] = b1.getDAY28();out.print(arr[27]);%>
					</td>

					<td>
						<%arr[28] = b1.getDAY29();out.print(arr[28]);%>
					</td>
					<td>
						<%arr[29] = b1.getDAY30();out.print(arr[29]);%>
					</td>
					<td>
						<%arr[30] = b1.getDAY31();out.print(arr[30]);%>
					</td>

				</tr>
			</tbody>
		</table>

	</div>
	<% for(int j=0 ; j<31 ;j++)
      {  
    	 c++;
  	 if(arr[j] != null && (arr[j].equals("P") || arr[j].equals("p")) )
   		 sum++;
  	 else
  	 {
  		 
  	 }
  	
    %>
	<% }
    
     %>
	<div style="background-color: white;" class="container">
		<h4>
			<% 
      percent = sum / (1.0*total);
      RequiredPercent = 75 - percent;      
      Required = (int)Math.round((RequiredPercent*(1.0*total))/(1.0*100));
      out.println("You have to attend " + (17-sum) + " Lectures to not to be detained"); 
      finalSum += sum;
      %>
		</h4>
	</div>


	<% }
      %>

	<div style="background-color: white;" class="container">
		<h4>
			<%
      percent = finalSum / (1.0*c);
      RequiredPercent = 75 - percent;      
      Required = (int)Math.round((RequiredPercent*(1.0*c))/(1.0*100));
      out.println("You have to attend " + (70-finalSum) + " Lectures overall to appear in exams"); 
      %>
		</h4>
	</div>

</body>
</html>