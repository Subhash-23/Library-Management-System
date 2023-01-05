<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BOOK RENEWAL</title>
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
<h2><font color=red><CENTER>ENTER STUDENT ID TO RENEW BOOK</CENTER></font><br>
<form action="LMSController" method="post">
<table align="center" width="50%">
 <br> <tr><td>Student Id</td><td><input type="text" placeholder = "Enter student ID" name="sId"/></td></tr>
  <tr><td>Renewal Date</td><td><input type="date" placeholder = "Enter renewal date " name="rDate"/></td></tr>
  <tr><td colspan="2" align="center"><br><input type="submit" class="btn" value="renew" name="EMSButton"/></td></tr>
</table>
</form>
</body>
</html>