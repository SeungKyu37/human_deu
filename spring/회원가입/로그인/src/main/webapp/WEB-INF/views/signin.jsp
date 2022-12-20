<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>signin</title>
</head>
<body>
<form action="/register" id=frmSignin>
<table>
<tr>
	<td>로긴아이디</td><td><input type="text" name=userid id=userid></td>
</tr>
<tr>
	<td>비밀번호</td><td><input type="password" name=password id=password></td>
</tr>
<tr>
	<td>비밀번호확인</td><td><input type="password" name=password2 id=password2></td>
</tr>
<tr>
	<td>실명</td><td><input type="text" name=name id=name></td>
</tr>
<tr>
	<td>모바일</td><td><input type="text" name=mobile id=mobile></td>
</tr>
<tr>
	<td colspan=2 align=center>
		<input type="submit" value="회원가입" id=btnSubmit>
	</td>
</tr>
</table>
</form>
<table><tr><td>
<a href='/'>홈으로</a></td><td><a href='/login'>로그인하기</a></td></tr>
</table>
</body>
<script src="https://code.jquery.com/jquery-3.4.1.js"></script>
<script>
$(document)
.on('submit','#frmSignin',function(){
	if($('#userid').val()==''||$('#password').val()==''||$('#password2').val()==''||$('#name').val()==''||$('#mobile').val()==''){
		alert('입력하시오');
		return false;
	}
	if($('#password').val()==$('#password2').val()){
		return true;
	} else {
		alert('비밀번호와 확인이 일치하지 않습니다.');
		return false;
	}
})
/*.on('click','#btnSubmit',function(){
	if($('#password').val()==$('#password2').val()){
		('#frmSignin').submit();
	} else {
		alert('비밀번호와 확인이 일치하지 않습니다.');
		return false;
	}
})*/
</script>
</html>