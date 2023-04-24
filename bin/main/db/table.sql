
-- user 테이블 설계 해보기 
CREATE TABLE user_tb(
	id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(30) NOT NULL,
    fullname VARCHAR(50) NOT NULL,
    created_at TIMESTAMP NOT NULL DEFAULT now()
);

-- user의 계좌 정보 테이블 설계해보기 
CREATE TABLE account_tb(
	id INT AUTO_INCREMENT PRIMARY KEY,
    number VARCHAR(30) NOT NULL UNIQUE,
    password VARCHAR(100) NOT NULL,
    balance BIGINT NOT NULL COMMENT '계좌잔액',
    user_id INT,
    created_at TIMESTAMP NOT NULL DEFAULT now()
);

-- 입금 내역 저장 
-- 출금 내역 저장 
-- 사용자 간 이체 내역 저장 

-- user의 history 테이블 설계해보기
-- BIGINT 8바이트 크기의 정수형
-- 조(10의 12승) -- 경(10의 16승) -- 해(10의 20승)
-- 자(10의 24승) -- 양(10의 28승) 
CREATE TABLE history_tb(
	id INT AUTO_INCREMENT PRIMARY KEY COMMENT '거래 내역 ID',
    amount BIGINT NOT NULL COMMENT '거래 금액',
    w_account_id INT COMMENT '출금 계좌 id', 
    d_account_id INT COMMENT '입금 계좌 id',
    w_balance BIGINT COMMENT '출금요청된 계좌의 잔액',
    d_balance BIGINT COMMENT '입금요청된 계좌의 잔액',
    created_at TIMESTAMP NOT NULL DEFAULT now()    
);

