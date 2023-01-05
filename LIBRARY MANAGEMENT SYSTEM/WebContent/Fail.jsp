<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FAIL</title>
</head>
<CENTER><img src="wrong.gif" alt="error" style="width:100px;height:100px;"></CENTER>
<body>
<center>
<%
String insert_msg=(String)request.getAttribute("Insertmsg");  
if(insert_msg!=null)
out.println("<font color=red size=4px>"+insert_msg+"</font>");
%>    

<%
String update_msg=(String)request.getAttribute("Updatemsg");  
if(update_msg!=null)
out.println("<font color=red size=4px>"+update_msg+"</font>");
%>

<%
String delete_msg=(String)request.getAttribute("Deletemsg");  
if(delete_msg!=null)
out.println("<font color=red size=4px>"+delete_msg+"</font>");
%>

<%
String find_msg=(String)request.getAttribute("Findmsg");  
if(find_msg!=null)
out.println("<font color=red size=4px>"+find_msg+"</font>");
%>
</center>
</body>
</html>