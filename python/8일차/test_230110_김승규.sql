-- 연습문제 1. SELECT 조건 
-- 고객포인트 테이블의 모든 필드를 검색한다. 
select * from tb_point;

-- 연습문제 2. SELECT 조건 
-- 고객포인트 테이블에서 고객코드, 포인트내용, 포인트를 검색한다.
select customer_cd, point_memo, point from tb_point;?

-- 연습문제 3. SELECT 조건 
-- 고객포인트 테이블에서 고객코드, 포인트내용, 포인트 필드 제목을 한글로 출력한다. 
select customer_cd 고객코드, point_memo "포인트 내용", point 포인트 from tb_point;

-- 연습문제 4. WHERE 조건
-- 고객관리 테이블에서 누적포인트가 10,000 미만인 데이터의 고객코드, 고객명, 이메일, 누적포인트 필드를 검색한다.
select customer_cd, customer_nm, email, total_point from tb_customer where total_point < 10000;

-- 연습문제 5. WHERE-AND 조건
-- 고객포인트 테이블에서 고객코드가 ‘2017053’이면서 일련번호가 2인 데이터의 고객코드, 일련번호, 포인트 필드를 검색한다.
select customer_cd, seq_no, point from tb_point where customer_cd = '2017053' and seq_no = 2;

-- 연습문제 6. WHERE-OR 조건
-- 성적 테이블에서 반코드가 ‘A’ 또는 ‘B’이거나 국어, 영어, 수학 점수가 모두 80점 이상인 학생 필드를 검색한다.
select * from tb_grade where class_cd = 'A' or class_Cd = 'B' or kor >=80 and eng >= 80 and mat >= 80; 
?
-- 연습문제 7. WHERE BETWEEN 조건
-- 고객포인트 테이블에서 등록일시가 2018년 내에 있고, 포인트가 10,000에서 50,000 포인트 범위의 데이터를 검색한다.
select * from tb_point where substr(reg_dttm, 1,4) <= 2018 and point between 10000 and 50000;

-- 연습문제 8. 비교연산자
-- 고객 테이블에서 누적포인트가 20,000 이상인 1980년대 남성 고객의 고객코드, 고객명, 성별, 생년월일, 누적포인트를 검색한다.
select customer_cd, customer_nm, mw_flg, birth_day, total_point 
from tb_customer 
where substr(birth_day, 1, 3) = '198' 
and total_point >= 20000;

-- 연습문제 9. LIKE
-- 고객 테이블에서 남성이면서 생년월일 중 월이 5, 6, 7월인 고객의 고객코드, 고객명, 성별, 생년월일, 누적포인트를 검색한다.
select customer_cd, customer_nm, mw_flg, birth_day, total_point 
from tb_customer where mw_flg = 'M' 
and (birth_day like '____05%' or birth_day like '____06%' or birth_day like '____07%');

-- 연습문제 10. LIKE
-- 고객 테이블에서 고객코드가 ‘2017’로 시작하면서 남성인 고객 또는 고객코드가 ‘2019’로 시작하면서 여성인 고객을 구하고, 그 중 누적포인트가 30000 이하인 데이터를 검색한다.
select customer_cd, customer_nm, mw_flg, birth_day, total_point 
from tb_customer 
where (customer_cd like '2017%'
and mw_flg = 'M'
or customer_cd like '2019%'
and mw_flg = 'W')
and total_point <= 30000;

-- 연습문제 11. IN 연산자 
-- 품목정보 테이블에서 품목코드가 'S01’, ‘S04’, ‘S06’, ‘S10’인 데이터를 검색한다.
select * from tb_item_info where item_cd in ('S01', 'S04', 'S06', 'S10');

-- 연습문제 12. IN 연산자 
-- 고객포인트 테이블에서 고객코드가 ‘2017042’ 또는 ‘2018087’ 또는 '2019095' 이면서 포인트내용에 ‘구매’ 문자가 포함된 데이터를 검색한다.
select * from tb_point where customer_cd in ('2017042', '2018087', '2019095') and point_memo like '%구매%';

-- 연습문제 13. ORDER BY 
-- 고객포인트 테이블에서 등록일이 '2019＇년이고 포인트내용에 '구매'가 포함된 데이터를 포인트가 큰 순서대로 검색한다.
select * from tb_point where substr(reg_dttm, 1, 4) = 2019 and point_memo like '%구매%' order by point desc;

-- 연습문제 14. ORDER BY 
-- 성적 테이블에서 ‘B’반의 국어, 영어, 수학 점수의 합계가 높은 순으로 검색한다.
select kor, eng, mat, tot 합계 from tb_grade where class_cd = 'B' order by tot desc;

-- 연습문제 15. GROUP BY
-- 판매 테이블에서 판매일이 ‘20190802’ 또는 ‘20190803’을 대상으로 판매일과 상품명으로 그룹화해 총판매수를 구하고 판매일과 상품명은 가나다 순으로 정렬한다.
select sales_dt, product_nm, sum(sales_count) 총판매수
from tb_sales
where sales_dt in ('20190802', '20190803')
group by sales_dt, product_nm
order by sales_dt, product_nm;

-- 연습문제 16. DISTINCT 
-- 판매 테이블에서 '20190801＇에서 ‘20190802’ 기간에 판매한 상품명을 가나다 순으로 중복없이 검색한다.
select distinct product_nm 
from tb_sales 
where sales_dt in ('20190801', '20190802') 
order by product_nm; 
?
-- 연습문제 17. JOIN
-- 고객 테이블의 고객코드가 2019069 데이터를 고객포인트 테이블과 연관 검색하여 고객 테이블에서는 고객코드, 고객명, 성별을 검색한 후 고객포인트 테이블에서는 일련번호, 포인트내용, 포인트를 검색한다.
select a.customer_cd, a.customer_nm, a.mw_flg, b.seq_no, b.point_memo, b.point 
from tb_customer a, tb_point b
where a.customer_cd = b.customer_cd
and a.customer_cd = 2019069;

-- 연습문제 18. CASE
-- 고객 테이블에서 누적포인트가 1,000에서 20,000미만이면 “실버”, 20,000에서 50,000미만 이면 “골드”, 50,000이상이면 “VIP” 등급을 보이고 위 조건에 해당 없으면 “일반” 등급을 보인다.       
select customer_cd, customer_nm, total_point,
    case when total_point >= 1000 and total_point < 20000 then '실버'
        when total_point >= 20000 and total_point < 50000 then '골드'
        when total_point >= 50000 then 'VIP'
        else '일반'
        end as total_point
from tb_customer;
-- 연습문제 19. ROWNUM
-- 성적 테이블에서 반코드가 ‘A’ 또는 ‘C’반의 학생을 대상으로 모든 필드와 순차적인 행번호를 검색한다.
select rownum, class_cd, student_no, student_nm, kor, eng, mat, tot, avg from tb_grade where class_cd = 'A' or class_cd = 'C';

-- 연습문제 20. NULL
-- 고객 테이블에서 고객코드가 ‘2018’ 또는 ‘2019’로 시작하고, 생일이 1990년 또는 2000년 대인 고객 중 전화번호가 설정되어 있는 데이터를 검색한다.
?select * from tb_customer where ;
select * from tb_customer 
where (customer_cd like '2018%' or customer_cd like '2019%') 
and (birth_day like '199%' or birth_day like '200%')
and phone_number is not null;

-- 연습문제 21. DUAL
-- DUAL 테이블로 300÷60과 오늘 날짜와 30일 이후의 날짜를 'YYYY-MM-DD' 형식으로 보인다. 참고로 'YYYY-MM-DD' 형식은 CHAR() 함수에 현재날짜와 'YYYY-MM-DD' 형식을 옵션으로 입력해 보인다.
select 300/60, to_char(sysdate, 'YYYY-MM-DD') "오늘 날짜", to_char(sysdate + 30, 'YYYY-MM-DD') "30일 후 날짜" from dual;?

-- 연습문제 22. 서브쿼리
-- 성적 테이블에서 반코드가 ‘A’ 또는 ‘C’반의 학생을 대상으로 합계가 많은 순으로 행번호를 보인다. (가장 높은 점수가 1등이다.)
-- 아래 코드 실행
UPDATE TB_GRADE
SET    TOT = KOR + ENG + MAT,
       AVG = ROUND((KOR + ENG + MAT) / 3,1);
SELECT * FROM TB_GRADE;
COMMIT;
-- 코드 작성
select rownum 등수, class_cd, student_no, student_nm, kor, eng, mat, tot, avg 
from (select * from tb_grade
where class_cd = 'A' or class_cd = 'C'
order by tot desc);

-- 연습문제 23. EXISTS
-- 고객포인트 테이블에서 포인트 내용에 “이벤트”가 포함된 고객을 찾아 고객 테이블에 같은 고객코드가 존재한다면 검색한다.
SELECT *
FROM   TB_CUSTOMER CU
WHERE  EXISTS (SELECT 'A'
               FROM   TB_POINT CP
               WHERE  CP.CUSTOMER_CD = CU.CUSTOMER_CD
               AND    CP.POINT_MEMO LIKE '%이벤트%');