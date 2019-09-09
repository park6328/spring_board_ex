
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="insert" method="post">
		글제목 <input type="text" name="title" ><br><!--name은 map구조로 키와 값에서 "키"에 해당되는 값! -->
		글쓴이      <br>
		글내용 <textarea name="content">ㅇㅇㅇㅇ</textarea>  <br><br><br><br><br>
            <input type="submit" value="전송">
            <a> 되돌아가기</a>
	</form>
</body>
</html>
</body>
</html>