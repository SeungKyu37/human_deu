<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>새글 작성</title>
</head>
<body>
<form id=frmInsert method=post action="/insert">
<table>
<tr><td>제목</td><td><input type=text name=title id=title required></td></tr>
<tr><td>내용</td><td valign=top><textarea rows=10 cols=80 id=content name=content required></textarea>
<tr><td colspan=2><input type=submit value='등록'>&nbsp;<input type=reset value='비우기'></td></tr>
</table>
</form>
</body>
</html>