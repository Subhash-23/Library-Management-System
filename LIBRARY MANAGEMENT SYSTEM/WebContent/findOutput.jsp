
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.lms.bean.Student" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FIND EMPLOYEE</title>
</head>
<body>
<%
out.println("<table border = 2px solid black align = 'center' width='60%'>");
out.println("<tr><th> STUDENT NAME </th> <th>STUDENT ID </th> <th>STUDENT DEPARTMENT</th><th>STUDENT YEAR</th><th>BOOK NAME DEPARTMENT</th><th>BOOK ID</th> <th>ISSUE DATE</th> <th>RENEWAL DATE</th> </tr>");
	Student user = (Student) request.getAttribute("bean");
	out.println("<tr><td>" + user.getsName() + "</td>");
	out.println("<td>" + user.getsId() + "</td>");
	out.println("<td>" + user.getsDept() + "</td>");
	out.println("<td>" + user.getsYear() + "</td>");
	out.println("<td>" + user.getbName() + "</td>");
	out.println("<td>" + user.getbId() + "</td>");
	out.println("<td>" + user.getiDate() + "</td>");
	out.println("<td>" + user.getrDate() + "</td></tr>");

out.println("</table>");
%>



</body>
</html>