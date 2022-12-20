<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
</head>
<body>
<table>
<tr>
	<td>아이디</td><td><input type="text" name=userid id=userid></td>
</tr>
<tr>
	<td>비밀번호</td><td><input type="password" name=password id=password></td>
</tr>
<tr>
	<td colspan=2 align=center>
		<input type="button" value="로그인" id=btnGo>
	</td>
</tr>
</table>
<table><tr><td>
<a href='/'>홈으로</a></td><td><a href='/signin'>회원가입</a></td></tr>
</table>
</body>
<script src="https://code.jquery.com/jquery-3.4.1.js"></script>
<script>
$(document)
.on('click','#btnGo',function(){
	if($('#userid').val()==''||$('#password').val()==''){
		alert('입력하시오');
		return false;
	}
	$.post('/checkuser',{userid:$('#userid').val(),password:$('#password').val()},function(data){
		if(data=='ok'){
			document.location="/";
		} else {
// 			document.location="/login"
			alert('로그인 실패. 아이디와 비밀번호가 비밀번호가 정확히 입력되지 않았습니다.');
			$('#userid,#password').val('');
		}
	},'text');
	return true;
})
</script>
</html>