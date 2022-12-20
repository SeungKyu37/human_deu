<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
</head>
<body>
<form action="/checkuser" id=frmLogin>
<table>
<tr>
	<td>아이디</td><td><input type="text" name=userid id=userid></td>
</tr>
<tr>
	<td>비밀번호</td><td><input type="password" name=password id=password></td>
</tr>
<tr>
	<td colspan=2 align=center>
		<input type="submit" value="로그인">
	</td>
</tr>
</table>
</form>
<table><tr><td>
<a href='/'>홈으로</a></td><td><a href='/signin'>회원가입</a></td></tr>
</table>
</body>
<script src="https://code.jquery.com/jquery-3.4.1.js"></script>
<script>
$(document)
.on('submit','#frmLogin',function(){
	if($('#userid').val()==''||$('#password').val()==''){
		alert('입력하시오');
		return false;
	}
})
</script>
</html>