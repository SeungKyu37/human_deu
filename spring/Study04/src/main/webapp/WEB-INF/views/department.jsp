<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>department</title>
</head>
<body>
<table border=1px>
<tr><th>부서번호</th><th>부서이름</th><th>상위부서</th><th>매니저이름</th></tr>
<c:forEach var="dt" items="${dpart}">
	<tr><td>${dt.department_id}</td><td>${dt.department_name}</td>
		<td>${dt.parent_name}</td><td>${dt.emp_name}</td></tr>
</c:forEach>
</table>
</body>
</html>