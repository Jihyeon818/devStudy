<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="root" value="${pageContext.request.contextPath }/" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>우리반 화이팅</title>
<!-- Bootstrap CDN -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
</head>
<body>
	<c:import url="/WEB-INF/views/include/top_menu.jsp" />

	<div class="container" style="margin-top: 100px">
		<div class="card shadow">
			<div class="card-body">
				<div class="form-group">
					<label for="board_writer_name">글쓴이</label> 
					<input type="text" value="홍길동" disabled="disabled" class="form-control" 
										id="board_writer_name" name="board_writer_name"/>
				</div>
				
				<div class="form-group">
					<label for="board_date">작성날짜</label> 
					<input type="text" value="2024-05-13" disabled="disabled" class="form-control" 
										id="board_date" name="board_date"/>
				</div>
				
				<div class="form-group">
					<label for="board_subject">제목</label> 
					<input type="text" value="제목" disabled="disabled" class="form-control" 
										id="board_subject" name="board_subject"/>
				</div>
				
				<div class="form-group">
					<label for="board_content">내용</label> 
					<textarea  style="resize: none" rows="10" disabled="disabled" 
					class="form-control" id="board_content" name="board_content">내용</textarea>
				</div>
					
				<div class="form-group">
					<div class="text-right">
						<a href="${root }board/main" class="btn btn-primary">목록</a>
						<a href="${root }board/modify" class="btn btn-info">수정</a>
						<a href="${root }board/delete" class="btn btn-danger">삭제</a>
					</div>
				</div>
				
			</div>
		</div>
	</div>
<c:import url="/WEB-INF/views/include/bottom_menu.jsp" />
</body>
</html>