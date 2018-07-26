<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.ibm.model.Department" %>
    <%@page import="java.util.List" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
<script src="bootstrap/jquery-3.0.0-min.js"></script>
<script src="bootstrap/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Dept</title>
</head>
<body>
<div class="container">
<h1>Department List</h1>
<table class="table table-striped">
<thead>
<tr>
<th>Dept Id</th>
<th>Dept Name</th>
</tr>
</thead>
<tbody>
<ul>
<%
List<Department> depts=(List<Department>)request.getAttribute("depts");
for(Department d: depts){
%>
<li><%=d.getDeptId() %>|<%=d.getDeptName() %></li>
<%
}%>
</ul>
</tbody>
</table>
</div>
</body>
</html>