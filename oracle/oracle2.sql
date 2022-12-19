create table person(
name varchar2(20),
gender varchar2(6),
mobile varchar2(8) primary key,
address varchar2(30),
city varchar2(20)
);
desc person;

--기본키(Primaey key)
--1. 테이블 하나당 오직 하나만 존재한다. 두개이상 불가. 기본키 없는 테이블은 가능
--2. 키값은 전체 컬럼을 통틀어서 유일해야(Uniqueness)
--3. 키값은 null을 넣을 수 없다.(Not Null)

create table roomtype(
typenum number(3) primary key,
typename varchar(20) not null,
comments varchar2(32)
);
desc roomtype;
create table roominfo(
num varchar2(10) primary key,
name varchar2(20) not null,
type number(3), constraint fk_typenum foreign key(type) references roomtype(typenum),
howmany number(3) default 1,
howmuch number(4) default 0
);
desc roominfo;
insert into roomtype values(1,'Suite Room', null);
insert into roomtype values(2,'Deluxe Room', null);
insert into roomtype values(3,'Family Room', null);
select * from roomtype;
insert into roominfo values(100,'백두산',1,6,1200);
select * from roominfo;
insert into roominfo values(100,'한라산',4,6,1200);

-- 삭제관련
-- delete from - data only 북구가능(rollback)
-- truncate table - data only 복구불가능
-- drop table - data+schema 복구불가능

create view under_five as select * from worker where salary < 5000;
select * from under_five;
create index ndx_emp_name on worker(emp_name);
create synonym human_resource for employees;
select * from human_resource;

create sequence seq_id;
select seq_id.currval from dual;

desc roomtype;
select * from roomtype;
insert into roomtype values(seq_id.nextval,'Standard Room',null);
select emp_name||','||salary from worker;
-- 이름 : 매니저사번, 월급
select emp_name||':'||manager_id||','||salary from worker;

--산술연산자 : +,-,*,/,||
--비교연산자 : =,!=,<>,>,<,>=,<=, is null, us not null
--논리연산자 : and, or, not
--집합연산자 : 교집합(intersect), 합집합(union, union all) 차집합(minus)

select 1+5 from dual;

select emp_name,employee_id, salary,
    case when salary<=5000 then 'C'
        when salary>5000 and salary <= 15000 then 'B'
        else 'A'
    end as salary_level
from worker;
--salary>=10000: 본부장급, 6000<=salary<10000: 팀장급, 6000<salary: 팀원급
select emp_name,employee_id, salary,
    case when salary<6000 then '팀원급'
        when salary>=6000 and salary < 10000 then '팀장급'
        else '본부장급'
    end as salary_level
from worker;
select emp_name, salary from worker where salary between 4000 and 6000;
select emp_name, salary from worker where salary in (3000,4000,5000,6000,7000);
select emp_name from worker where emp_name like 'E%';

select ceil(3.14) from dual;
select floor(3.14) from dual;
select power(4,4) from dual;
select sqrt(16) from dual;
select initcap('good mornig vietnam') from dual;
select lower(emp_name) from worker;
select upper(emp_name) from worker;
select concat(emp_name,',') from worker;

--substr(문자열,시작인덱스[,길이])
--시작인덱스는 1부터 시작
select substr('good morning',6,4) from dual;
select substr('good morning',-3) from dual;
select emp_name from worker where substr(emp_name,-3)='son';
select emp_name from worker where emp_name like '%son';
select substrb('ABCDEFG',1,4), substrb('가나다라마바사',1,4) from dual;
select emp_name from worker where emp_name like 'John%';
select replace (emp_name,' ','') from worker where emp_name like '%%';

-- instr(문자열,찾을문자열,시작인덱스,출현횟수)
-- 문자열에서 '찾을문자열'이 나타나는 위치의 인덱스 번호(못찾으면 0)
select instr('내가 만약 외로울 때면, 내가 만약 괴로울 때면, 내가 만약 즐거울 때면','만약',5,2)from dual;
select instr('John Wick','Joe') from dual;
select length('good morning vietnam') from dual;
select emp_name,length(emp_name) from worker;

select instr(emp_name,' ') from worker;
select substr(emp_name,1,instr(emp_name,' ')-1) from worker;
select replace(emp_name,' ','-') from worker where emp_name like '%%';

select to_char(salary,'99,999') from worker;
select sysdate,systimestamp from dual;
select to_char(sysdate,'yyyy-mm-dd HH24:MI:SS') from dual;

select to_char(sysdate,'PM HH')||'시 '||to_char(sysdate,'MI')||'분 '||to_char(sysdate,'SS')||'초' 시간 from dual;

--nvl(컬럼/데이터, 숫자): 컬럼/데이터가 null이면 숫자로 표시, 아니면 그대로 자체 표시
select * from student;
select name,gender,school_name,grade_num,mobile,nvl(math_score,0),nvl(english_score,0),nvl(korean_score,0) from student;

--nullif(표현식1, 표현식2):표현식1==표현식2이면, null출력, 다르면 표현식1을 출력
select employee_id,
        to_char(start_date,'yyyy'),
        to_char(end_date,'yyyy'),
        nullif( to_char(start_date,'yyyy'), to_char(end_date,'yyyy')) nullif_year
    from job_history;
    
select emp_name, salary, decode(salary,3000,'3k',4000,'4k',5000,'5k',6000,'6k',7000,'7k',8000,'8k','etc') decode from worker;
select emp_name, salary, case   when salary between 3000 and 3999 then '3k'
                                else 'etc' end salary from worker;
