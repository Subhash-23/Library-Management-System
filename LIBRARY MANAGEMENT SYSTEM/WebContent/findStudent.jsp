<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FIND STUDENT</title>
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
<h2><font color=red><CENTER>ENTER STUDENT ID TO DISPLAY RECORD</CENTER></font><br><br>
<form action="LMSController" method="post">
<table align="center" width="50%">
  <tr><td>Student Id</td><td><input type="text" placeholder = "Enter student ID"  name="sId"/></td></tr>
  <tr><td colspan="2" align="center"><br><input type="submit" class="btn" value="Find" name="EMSButton"/></td></tr>
</table>
</form>

</body>
</html>