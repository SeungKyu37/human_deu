create table student(
name varchar2(20) not null,
gender varchar2(1) not null,
school_name varchar2(20) not null,
grade_num varchar2(1) not null,
mobile varchar2(8),
math_score number(3),
english_score number(3),
korean_score number(3)
);
desc student;

--C(데이터생성/추가)insert
--insert into 테이블명 values (값1, 값2, ... ,값n);
--insert into 테이블명(칼럼명1, 칼럼명2, ... ,칼럼명n); values (값1, 값2, ... ,값n);
insert into student values ('John','M','WestLake',6,null,null,null,null);
insert into student values ('Jane','F','RiverWest',5,null,null,null,null);
insert into student(name,gender,school_name,grade_num) values ('Jacob','M','RiverEast',6);
insert into student values ('김승규','M','동양중',3,null,null,null,null);
insert into student values ('Greg','M','RiverNorth',2,null,null,null,null);
insert into student values ('James','M','SouthLake',3,null,null,null,null);
insert into student values ('Suzi','F','RiverWest',1,null,null,null,null);
insert into student values ('Kane','M','RiverNorth',6,null,null,null,null);
insert into student values ('Harry','M','WestLake',2,null,null,null,null);
insert into student values ('Emma','F','RiverEast',4,null,null,null,null);
-- ''==null
--insert into 테이블명 set 컬럼명1=값1, 컬럼명2=값2, ... , 컬럼명n=값n(mySQL, mariaDB에서 가능)
--R(데이터조회) select
select * from student;
--U(데이터수정) update
update student set gender='M' where name = 'Harry';
update student set mobile='-' where mobile is null;
update student set math_score=-1,english_score=-1,korean_score=-1 where grade_num=6;
--update 테이블명 set 컬럼명1=값1, 컬럼명2=값2, ... , 컬럼명n=값n where 컬럼명=값
--D(데이터삭제) delete
commit;
rollback;
delete from student where grade_num < 4;
--delete from 테이블명 where 컬렁명 = 값;
--특정 컬럼의 값이 특정값인 레코드(row,line)를 지운다.
--delete from student where mobile is null;



create table worker as select * from employees;
select * from worker;
commit;
--worker 테이블에서 manager_id가 null인 사람의 월급(salary)을 30000으로 변경(update)
update worker set salary='30000' where manager_id is null;
--manager_id가 124인 사람의 커미션퍼센티지를 0.25로 변경
update worker set commission_pct=0.25 where manager_id =124;