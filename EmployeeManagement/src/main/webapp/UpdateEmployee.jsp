<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="test.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% 
AdminBean ab=(AdminBean)session.getAttribute("abean");
String msg=(String)request.getAttribute("msg");
out.println("Page Belong To Admin: "+ab.getfName());
out.print(msg);



%>
<a href="Employee.html">AddEmployee</a>
<a href="view">ViewAllEmployee</a>
<a href="logout">Logout</a>
</body>
</html>


