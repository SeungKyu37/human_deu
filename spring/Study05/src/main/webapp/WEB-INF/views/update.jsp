<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 수정</title>
</head>
<body>
<form id=frmInsert method=post action="/doUpdate">
<table>
<tr><td></td><td><input type=hidden id=lblPost_id name=post_id value=${view.post_id}></label></td></tr>
<tr><td>제목</td><td><input type=text name=title id=title required value=${view. title}></input></td></tr>
<tr><td>내용</td><td valign=top><textarea rows=10 cols=80 id=content name=content required>${view. content}</textarea>
<tr><td colspan=2><input type=submit value='등록'>&nbsp;<input type=reset value='비우기'></td></tr>
</table>
</form>
</body>
</html>