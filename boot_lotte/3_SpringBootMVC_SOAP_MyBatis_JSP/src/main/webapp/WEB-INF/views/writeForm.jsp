<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>글쓰기 화면</h2>
<form action="write" method="post">
 제목<input type="text" name="title"><br>
 작성자<input type="text" name="author"><br>
 내용<textarea rows="10" cols="20" name="content"></textarea><br>
 <input type="submit" value="글쓰기">
</form>
</body>
</html>