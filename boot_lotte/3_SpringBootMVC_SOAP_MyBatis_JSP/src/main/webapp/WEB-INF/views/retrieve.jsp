<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>글자세히화면</h2>
글번호: <input type="text" name="title" value="${retrieve.num}" readonly="readonly"><br>
작성일:${retrieve.write_day}&nbsp;&nbsp;
조회수:${retrieve.readcnt}&nbsp;&nbsp;
<br>
 제목<input type="text" name="title" value="${retrieve.title}"><br>
 작성자<input type="text" name="author" value="${retrieve.author}"><br>
 내용<textarea rows="10" cols="20" name="content">${retrieve.content}</textarea><br>
<a href="list">목록보기</a>
<a href="writeForm">글쓰기</a>
<a href="delete?num=${retrieve.num}">글삭제</a>
</body>
</html>