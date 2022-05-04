<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script
  src="https://code.jquery.com/jquery-3.4.1.js"
  integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="
  crossorigin="anonymous"></script>
</head>
<body>
	<h1>목록페이지</h1>
	<a href="/board/enroll">게시판 등록</a>
	
	<script>
    $(document).ready(function(){
    	
 		var result ='<c:out value="${result}"/>';
 		
 		checkAlert(result);
 		
 		function checkAlert(result) {
 			
 			if(result === ''){
 				return;
 			}
 			
 			if(result === "enroll success"){
 				alert("등록이 완료되었습니다.");
 			}
 		}
    });
</script>
</body>
</html>