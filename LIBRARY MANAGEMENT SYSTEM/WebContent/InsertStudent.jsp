<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ADD STUDENT</title>
</head>
<style>
.btn{
background-color: #4CAF50;
border-radius: 8px;
color: white;
text-align: center;
display: inline-block;
font-size: 16px;
}
</style>

<body>
<br>
<h2><font color=red><CENTER>ENTER STUDENT DETAILS </CENTER></font><br>

<form action="LMSController" method="post">
<table align="center" width="50%">
  <tr><td>Student Name</td><td><input type="text" placeholder = "Enter student name" name="sName"/></td></tr>
  <tr><td>Student Id</td><td><input type="text" placeholder = "Enter student ID" name="sId"/></td></tr>
  <tr><td>Student Department</td><td><input type="text" placeholder = "Enter student Department" name="sDept"/></td></tr>
  <tr><td>Student Year</td><td><input type="text" placeholder = "Enter student college year" name="sYear"/></td></tr>
  <tr><td>Book Name</td><td><input type="text" placeholder = "Enter book name" name="bName"/></td></tr>
  <tr><td>Book Id</td><td><input type="text" placeholder = "Enter book ID" name="bId"/></td></tr>
  <tr><td>Issue Date</td><td><input type="date" placeholder = "Enter issue date" name="iDate"/></td></tr>
  <tr><td>Renewal Date</td><td><input type="date" placeholder = "Enter renewal date" name="rDate"/></td></tr>
  

  <tr><td colspan="2" align="center"><br><input type="submit" value="Insert" class="btn" name="EMSButton"/></td></tr>
</table>
</form>
</body>
</html>