<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/view/layout/header.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<style>
.user--box {
	border: 1px solid black;
	padding: 10px;
}
</style>

<div class="col-sm-8 d-flex flex-column">
	<h2>계좌 상세보기 목록</h2>
	<h5>어서오세요 환영합니다</h5>
	<div class="bg-light p-md-5 h-75">

		<div class="user--box">
			${principal.username}님 계좌<br> 계좌번호 : ${account.number}<br> 잔액 : ${account.formatBalance()}
		</div>

		<br>
		<div>
			<a href="/account/detail/${account.id}">전체</a>&nbsp; <a href="/account/detail/${account.id}?type=deposit">입금</a>&nbsp; <a href="/account/detail/${account.id}?type=withdraw">출금</a>
		</div>
		<br>

		<table class="table">
			<thead>
				<tr>
					<th>날짜</th>
					<th>보낸 사람</th>
					<th>받는 사람</th>
					<th>입출금금액</th>
					<th>계좌잔액</th>
				</tr>
			</thead>

			<tbody>
				<c:forEach var="history" items="${historyList}">
					<tr>
						<th>${history.formatCreatedAt()}</th>
						<th>${history.sender}</th>
						<th>${history.receiver}</th>
						<th>${history.formatMoney(history.amount)}</th>
						<th>${history.formatMoney(history.balance)}</th>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<br>
</div>

<%@ include file="/WEB-INF/view/layout/footer.jsp"%>