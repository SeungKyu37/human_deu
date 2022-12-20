<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시물 보기</title>
</head>
<body>
<table border = 1>
<tr><td>게시물번호</td><td><label id=lblPost_id>${viewlist.post_id}</label></td></tr>
<tr><td>제목</td><td><label id=lblTitle>${viewlist.title}</label></c></td></tr>
<tr><td>내용</td><td valign=top><textarea rows=10 cols=80 id=content name=content readonly>${viewlist.content}</textarea>
<tr><td>작성자</td><td><label id=lblWriter></label>${viewlist.writer}</td></tr>
<tr><td>작성시각</td><td><label id=lblCreated></label>${viewlist.created}</td></tr>
<tr><td>수정시각</td><td><label id=lblUpdated></label>${viewlist.updated}</td></tr>
<tr><td colspan=2><a href='/'>목록보기</a></td></tr>
</table>
</body>
</html>