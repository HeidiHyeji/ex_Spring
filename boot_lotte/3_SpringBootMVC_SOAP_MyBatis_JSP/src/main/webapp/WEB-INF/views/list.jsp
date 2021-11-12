<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>글목록보기</h2>
<table border="1">
  <tr>
    <th>글번호</th>
    <th>제목</th>
    <th>작성자</th>
    <th>작성일</th>
    <th>조회수</th>
  </tr>
 <c:forEach var="board"  items="${xxx}"> 
  <tr>
    <td>${board.num}</td>
    <td><a href="retrieve?num=${board.num}">${board.title}</a></td>
    <td>${board.author}</td>
    <td>${board.write_day}</td>
    <td>${board.readcnt}</td>
  </tr>
  </c:forEach>
</table>
<a href="writeForm">글쓰기</a>

</html>