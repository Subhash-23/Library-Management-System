<%@page import="com.lms.bean.Student"%>
<%@page import="com.lms.bean.Book"%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DISPLAY ALL</title>
</head>
<body>

<center><h1>STUDENTS REPORT</h1></center>
<% 
List <Student> list = (List)request.getAttribute("list");
Iterator itr = list.iterator();
out.println("<table border = 2px solid black align = 'center' width='60%'>");
out.println("<tr><th> STUDENT NAME </th> <th>STUDENT ID </th> <th>STUDENT DEPARTMENT</th><th>STUDENT YEAR</th><th>BOOK NAME </th><th>BOOK ID</th> <th>ISSUE DATE</th> <th>RENEWAL DATE</th></tr>");
while (itr.hasNext()){
	Student bean = (Student) itr.next();
	out.println("<tr><td>" + bean.getsName() + "</td>");
	out.println("<td>" + bean.getsId() + "</td>");
	out.println("<td>" + bean.getsDept() + "</td>");
	
	out.println("<td>" + bean.getsYear() + "</td>");
	out.println("<td>" + bean.getbName() + "</td>");
	out.println("<td>" + bean.getbId() + "</td>");

	out.println("<td>" + bean.getiDate() + "</td>");
	out.println("<td>" + bean.getrDate() + "</td></tr>");

}
out.println("</table>");

%>
<br>
<br>
<br>
<center><h1>BOOKS REPORT</h1></center>

<% 
List <Book> list1 = (List)request.getAttribute("list1");
Iterator itr1 = list1.iterator();
out.println("<table border = 2px solid black align = 'center' width='60%'>");
out.println("<tr><th> BOOK NAME </th> <th>BOOK ID </th> <th>BOOK AUTHOR</th><th>BOOK QUANTITY </th></tr>");
while (itr1.hasNext()){
	Book bean1 = (Book) itr1.next();
	out.println("<tr><td>" + bean1.getbName() + "</td>");
	out.println("<td>" + bean1.getbId() + "</td>");
	out.println("<td>" + bean1.getbAuthor() + "</td>");
	out.println("<td>" + bean1.getbQuantity() + "</td></tr>");
}
out.println("</table>");

%>
</body>
</html>