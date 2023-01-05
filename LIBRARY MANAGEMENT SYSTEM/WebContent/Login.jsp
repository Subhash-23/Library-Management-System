<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LOGIN PAGE</title>
</head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css">

<style>
div{
border: 2px solid black;
text-align: center;
padding: 20px;
width: 500px;
}
</style>
<body>
<form action ="LoginServlet" method = "post">
<center><img src="LMS BACKGRROUND.jpg" alt="LMS" style="width:80%; padding-top:3px;"></center><br>
<center><div>
<b>ENTER USERNAME:</b> <input type="text" name="uname" placeholder="Enter username"/><font color="red">*</font><br><br>
<b>ENTER PASSWORD:</b> <input type="password" name="pass" placeholder="Enter username"/><font color="red">*</font><br><br>

<input type="submit" class="btn btn-primary" value = "PROCEED"/><br>
<%
String msg = (String)request.getAttribute("msg");
if(msg != null)
	out.println("<font color = 'red'> <b>" + msg + "</b></font>");
%>
</div></center>
</form>
</body>
</html>