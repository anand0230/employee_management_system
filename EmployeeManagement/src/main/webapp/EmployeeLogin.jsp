<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  import="test.EmployeeBean"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 

   EmployeeBean eb=(EmployeeBean)request.getAttribute("ebean");
   out.println(eb.geteId()+"&nbsp&nbsp"+eb.geteName()+"&nbsp&nbsp"+eb.getbSal()+
   "&nbsp&nbsp"+eb.getHra()+"&nbsp&nbsp"+eb.getDa()+"&nbsp&nbsp"+eb.getTotsal());
   
   
%>
<a href="EmployeeLogin.html">Back</a>

<% 
    
%>
</body>
</html>