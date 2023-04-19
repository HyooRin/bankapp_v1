<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/view/layout/header.jsp"%>


<div class="col-sm-8">
	<h2>입금페이지(인증)</h2>
	<h5>어서오세요 환영합니다</h5>
	<div class="bg-light p-md-5 h-75">
		<form action="/account/deposit-proc" method="post">
			<div class="form-group">
				<label for="amount">입금금액 :</label> 
				<input type="text" class="form-control" placeholder="입금금액을 입력하시오" id="amount" name="amount">
			</div>
			<div class="form-group">
				<label for="dAccountNumber">입금계좌번호:</label> 
				<input type="text" class="form-control" placeholder="입금계좌번호" id="dAccountNumber" name="dAccountNumber">
			</div>
			<button type="submit" class="btn btn-primary">입금</button>
		</form>
	</div>
	<br>

</div>


<%@ include file="/WEB-INF/view/layout/footer.jsp"%>