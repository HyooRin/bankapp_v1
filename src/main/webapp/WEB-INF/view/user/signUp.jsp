<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/view/layout/header.jsp"%>


<!-- Todo!! : main영역으로 지정 예정 -->
<div class="col-sm-8">
	<h2>회원 가입</h2>
	<h5>어서오세요 환영합니다</h5>
	<div class="bg-light p-md-5 h-75">
		<form action="/user/sign-up" method="post" enctype="multipart/form-data">
			<div class="form-group">
				<label for="username">User name:</label> <input type="text" class="form-control" placeholder="Enter username" id="username" name="username">
			</div>
			<div class="form-group">
				<label for="password">Password:</label> <input type="password" class="form-control" placeholder="Enter password" id="pwd" name="password">
			</div>
			<div class="form-group">
				<label for="fullname">Fullname:</label> <input type="text" class="form-control" placeholder="Enter fullname" id="fullname" name="fullname">
			</div>
			<div class="custom-file">
				<input type="file" class="custom-file-input" id="customFile" name="file" accept=".jpg, .jpeg, .png"> 
				<label class="custom-file-label" for="customFile">Choose file</label>
			</div>
			<br>
			<br>
			<button type="submit" class="btn btn-primary">회원가입</button>
		</form>
	</div>
	<br>

</div>

<script>
	$(".custom-file-input").on("change",function() {
				var fileName = $(this).val().split("\\").pop();
				$(this).siblings(".custom-file-label").addClass("selected")
						.html(fileName);
			});
</script>
<%@ include file="/WEB-INF/view/layout/footer.jsp"%>