INSERT INTO user_tb(username, password, fullname, created_at) values('길동', '1234',
'고', now());
INSERT INTO user_tb(username, password, fullname, created_at) values('둘리', '1234',
'애기공룡', now());
INSERT INTO user_tb(username, password, fullname, created_at) values('콜', '1234',
'마이', now());

INSERT INTO account_tb(number, password, balance, user_id, created_at)
values('1111', '1234', 900, 1, now());
INSERT INTO account_tb(number, password, balance, user_id, created_at)
values('2222', '1234', 1100, 2, now());
INSERT INTO account_tb(number, password, balance, user_id, created_at)
values('333', '1234', 0, 3, now());

-- 이체 내역을 기록 ( 1번 계좌에서 2번 계좌로 100원을 이체 한다) 
INSERT INTO history_tb(amount, w_balance, d_balance, 
					   w_account_id, d_account_id, created_at)
VALUES (100, 900, 1100, 1, 2, now());

-- 출금 내역 ( 1번계좌에서 100원을 출금 처리 )
INSERT INTO history_tb(amount, w_balance, d_balance, 
					   w_account_id, d_account_id, created_at)
VALUES (100, 800, null, 1, null, now());

-- 입금 내역 (1번 계좌에 500원 입금 처리 )
INSERT INTO history_tb(amount, w_balance, d_balance, 
					   w_account_id, d_account_id, created_at)
VALUES (500, null, 700, null, 1, now());
