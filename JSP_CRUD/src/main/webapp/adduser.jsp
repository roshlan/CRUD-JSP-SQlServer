<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="com.crudjsp.Dao.UserDao" %>
    <jsp:useBean id="u" class="com.crudjsp.user.User"></jsp:useBean>
    <jsp:setProperty property="*" name="u"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add-User</title>
</head>
<body>
<%
int i=UserDao.save(u);
if(i>0){
	response.sendRedirect("adduser-success.jsp");
}
else{
	response.sendRedirect("adduser-error.jsp");
}
%>
</body>
</html>