<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>home</title>
</head>
<body>
<%--<c:if test="${empty userid}">
<a href="/login">로그인하기</a>&nbsp;&nbsp;<a href="/signin">회원가입</a>
</c:if>
<c:if test="${not empty userid}">
<label>${userid }</label>&nbsp;&nbsp;<a href="/signout">로그아웃</a>
</c:if> --%>
<%
	if(session.getAttribute("gUserid")==null){
		out.print("<a href='/login'>로그인하기</a>&nbsp;&nbsp;<a href='/signin'>회원가입</a>");
	} else {
		out.print("<label>"+session.getAttribute("gUserid")+"</label>&nbsp;&nbsp;<a href='/signout'>로그아웃</a>");
	}
%>
<h1>Welcome Home Page</h1>
</body>
</html>