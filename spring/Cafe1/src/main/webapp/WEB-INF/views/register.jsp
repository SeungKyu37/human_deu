<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
<h1>회원가입 화면</h1>
<a href='/login'>로그인으로</a>
<table>
<tr>
	<td>아이디</td><td><input type="text" id=userid><input type="button" value="중복확인"></td>
</tr>
<tr>
	<td>비밀번호</td><td><input type="password" id=password></td>
</tr>
<tr>
	<td>이름</td><td><input type="text" id=userid></td>
</tr>

<tr>
	<td colspan=2 align=center>
		<input type="submit" value="회원가입">
	</td>
</tr>
</table>
</body>
</html>