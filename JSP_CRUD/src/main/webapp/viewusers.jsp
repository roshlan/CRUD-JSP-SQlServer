<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View-users</title>
</head>
<body>
<%@page import="com.crudjsp.Dao.UserDao,com.crudjsp.user.*,java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h1>UserList</h1>
<%
List<User> list=UserDao.getAllRecords();
request.setAttribute("List",list);
//out.println(list.size());
%>
<table border="1" width="90%">
<tr><th>Id</th><th>Name</th><th>Password</th><th>Email</th>
<th>City</th><th>Edit</th><th>Delete</th>
<%
for (int r=0; r < list.size(); r++) {
	User u=list.get(r);
	out.println("<tr>");
	out.println("<td>" + u.getId());
	out.println("<td>" + u.getName());
	out.println("<td>" + u.getPassword());
	out.println("<td>" + u.getEmail());
	out.println("<td>" + u.getCity());
	out.println("<td><a href='editform.jsp?id=" + u.getId() + "'>Edit</a></td>");
	out.println("<td><a href='deleteuser.jsp?id=" + u.getId() + "'>Delete</a></td>");
}
%>

</table>
<br><a href="adduserform.jsp">Add New User</a>
</body>
</html>

<!--
<c:forEach items="${list}" var="u">
<tr><td>${u.getId()}</td><td>${u.getName()}</td><td>${u.getPassword()}</td>
<td>${u.getEmail()}</td><td>${u.get.City()}</td>
<td><a href="editform.jsp?id=${u.getId() }">Edit</a></td>
<td><a href="deleteuser.jsp?id=${u.getId()}">Delete</a></td></tr>
</c:forEach>
 -->
