<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit-User</title>
</head>
<body>
<%@page import="com.crudjsp.Dao.UserDao"%>
<jsp:useBean id="u" class="com.crudjsp.user.User"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>
<% 
int i=UserDao.update(u);
// `out.println(i);
response.sendRedirect("viewusers.jsp");
%>
</body>
</html>