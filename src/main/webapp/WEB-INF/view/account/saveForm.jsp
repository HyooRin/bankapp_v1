<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/view/layout/header.jsp"%>


<div class="col-sm-8">
	<h2>계좌생성 페이지(인증)</h2>
	<h5>어서오세요 환영합니다</h5>
	<div class="bg-light p-md-5 h-75">
		<form action="/account/save-proc" method="post">
			<div class="form-group">
				<label for="number">계좌번호</label> 
				<input type="text" class="form-control" placeholder="생성계좌번호입력" id="number" name="number" value="5555">
			</div>
			<div class="form-group">
				<label for="password">계좌 비밀번호:</label> 
				<input type="password" class="form-control" placeholder="계좌번호비밀번호입력" id="password" name="password" value="1234">
			</div>
			<div class="form-group">
				<label for="balance">입금금액:</label> 
				<input type="text" class="form-control" placeholder="입금 금액" id="balance" name="balance" value="2000">
			</div>
			<button type="submit" class="btn btn-primary">계좌생성</button>
		</form>
	</div>
	<br>

</div>


<%@ include file="/WEB-INF/view/layout/footer.jsp"%>