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

	<h1></h1>

	<table width="500" cellpadding="0" cellspacing="0" border="1">
		<tr>

			<td>순번</td>
			<td>작성자ID</td>
			<td>제목</td>

		</tr>
		<c:forEach items=" " var="dto" varStatus="status">
			<tr>
				<td></td>
				<td></td>
				<td><a href=""></a></td>
			</tr>
		</c:forEach>

	</table>
	<a href=" ">글쓰기</a>

</body>
</html>

<!-- <script>
	window.onload = function() {
    	var msg = '${msg}'
		if(msg != ''){
			alert(msg);
				
		}
		
		
		
	}

</script> -->
