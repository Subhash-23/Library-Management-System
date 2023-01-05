<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BOOK ENTRY</title>
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
<h2><font color=red><CENTER>ENTER BOOK DETAILS </CENTER></font><br>

<form action="LMSController" method="post">
<table align="center" width="50%">
  <tr><td>Book Name</td><td><input type="text" placeholder = "Enter Book name" name="bName"/></td></tr>
  <tr><td>Book Id</td><td><input type="text" placeholder = "Enter Book ID" name="bId"/></td></tr>
  <tr><td>Book Author</td><td><input type="text" placeholder = "Enter Book Author" name="bAuthor"/></td></tr>
   <tr><td>Book Quantity</td><td><input type="text" placeholder = "Enter Book quantity" name="bQuantity"/></td></tr>
 

  <tr><td colspan="2" align="center"><br><input type="submit" value="Add" class="btn" name="EMSButton"/></td></tr>
</table>
</form>
</body>
</html>