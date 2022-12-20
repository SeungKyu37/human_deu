<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>userinfo</title>
</head>
<body>
<form action="/login">
로긴 아이디: ${uid}<br><br>
비밀번호 : ${upw}<br><br>
실명 : ${uname}<br><br>
모바일 : ${umobile}<br><br>
<input type="submit" value="확인" id=btnOk>
</form>
</body>
</html>