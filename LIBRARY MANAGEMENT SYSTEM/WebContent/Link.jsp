<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BUTTONS</title>
</head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css">
<style>
body{
background-color: #9cc739;
}
.btn{
text-color:white;
text-align:center;
border-radius:10px;
background-color:red;
}
</style>
<body>
<br>
<table align="center" width="75%">
  <tr><th><a href="InsertStudent.jsp" class="btn btn-primary" target="Content">ADD STUDENT</a></th>
  <th><a href="BookRenewal.jsp" class="btn btn-primary" target="Content">BOOK RENEWAL</a></th>
  <th><a href="DeleteStudent.jsp" class="btn btn-primary" target="Content">DELETE STUDENT</a></th>
  <th><a href="findStudent.jsp" class="btn btn-primary" target="Content">FIND STUDENT</a></th>
  <th><a href="LMSController" class="btn btn-primary" target="Content">REPORT</a></th>
  <th><a href="BookEntry.jsp" class="btn btn-primary" target="Content">BOOK ENTRY</a></th>
  
</table>
</body>
</html>