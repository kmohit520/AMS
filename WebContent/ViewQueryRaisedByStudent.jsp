<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@page import="java.util.ArrayList" import=" model.Query"%>
	<%
      
      Query q = new Query();      
      ArrayList <Query> qr = new ArrayList<Query>();
      
      qr = (ArrayList<Query>) request.getAttribute("list");
   		
      %>


	<% for(int i=0 ;i<qr.size();i++)
      {
    	  q = qr.get(i);
    	  
    	 out.println(q.getStudentRoll() + "   " + q.getQuery());    	  
      %>
	<%
   }%>
</body>
</html>