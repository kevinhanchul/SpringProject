CREATE DATABASE mydatabase;

USE mydatabase;

CREATE TABLE numbers (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    number INT NOT NULL
);


CREATE TABLE t_member (
    이름
    아이디
    패스워드
    이메일주소
);

-- 선수정보 runner_info
CREATE TABLE t_member (
    이름
    나이
    소속
    몸무게
    키
    승률
);


-- 시간정보 race_table
CREATE TABLE t_member (
    선수명
    일자
    회차
    시행처
);

-- 구매정보 sell
CREATE TABLE t_member (
    고객명
    경주번호
    승식
    선수선택(1번~7번)
    배팅금액
    배당
    환불금액
);


