<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" import="test.AdminBean" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Dashboard</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f0f0f0;
        margin: 0;
        padding: 0;
    }

    .container {
        max-width: 1200px;
        margin: 0 auto;
        padding: 20px;
    }

    .welcome-message {
        font-size: 24px;
        margin-bottom: 20px;
        color: #333;
    }

    .navigation {
        margin-bottom: 20px;
    }

    .navigation a {
        display: inline-block;
        margin-right: 20px;
        text-decoration: none;
        color: #fff;
        background-color: #4CAF50;
        padding: 10px 20px;
        border-radius: 5px;
    }

    .navigation a:hover {
        background-color: #45a049;
    }
</style>
</head>
<body>

<div class="container">
    <%
    AdminBean ab = (AdminBean) session.getAttribute("abean");
    out.println("<div class='welcome-message'>Welcome User: " + ab.getuName() + "</div>");
    %>

    <div class="navigation">
        <a href="Employee.html">Add Employee</a>
        <a href="view">View All Employees</a>
        <a href="logout">Logout</a>
    </div>
</div>

</body>
</html>
