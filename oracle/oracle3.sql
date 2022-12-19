select employee_id eid,emp_name,salary,commission_pct pct,
        to_char(salary*(1+commission_pct/100),'99999.99') final_salary
        from worker
        where commission_pct is not null;
        
        
--count() 갯수
--sum() 합계
--avg() 평균
--min()/max()   최소값/최대값
--variance()/stddev()   분산도/표준편차
select count(*), count(manager_id) from worker;
-- null값은 카운트 안한다.
select sum(salary) from worker;
select to_char(avg(salary),'99,999.99') avg from worker;
select max(salary) from worker;

-- select 컬럼명1, ... , 컬럼명n, 집계함수1, ... , 집계함수n
-- from 테이블명
-- group by 컬럼명1, ... , 컬럼명n
select manager_id,count(*) cnt,sum(salary) total,to_char(avg(salary),'99,999.99') avg_sal
from worker
group by manager_id;
select department_id 부서ID,count(*) cnt
    from worker
    group by department_id
    having count(*)>1
    order by cnt desc;
    
select commission_pct pct, count(*) cnt, to_char(avg(salary),'99,999.99') avg_salary
from worker
where commission_pct is not null
group by commission_pct
order by avg(salary);

select * from worker order by salary desc;

select cust_gender gender, count(*) cnt
from customers
group by cust_gender;

select cust_marital_status, count(*) from customers
group by cust_marital_status
order by upper(cust_marital_status);
update customers set cust_marital_status='divorced' where cust_marital_status='Divorc.';

select cust_year_of_birth birth, cust_gender gender, count(*) cnt
from customers
group by cust_year_of_birth, cust_gender
order by cust_year_of_birth, cust_gender;

select substr(emp_name,1,1) one, count(*)
from worker
group by substr(emp_name,1,1)
order by one;

select floor(salary/1000)*1000 salary_level, count(*) cnt
from worker
group by floor(salary/1000)*1000
order by salary_level;

create table exp_goods_asia (
country varchar2(10),seq number,goods varchar2(80));
desc exp_goods_asia;
insert into exp_goods_asia values('한국',1,'원유제외 석유류');
insert into exp_goods_asia values('한국',2,'자동차');
insert into exp_goods_asia values('한국',3,'전자집적회로');
insert into exp_goods_asia values('한국',4,'선박');
insert into exp_goods_asia values('한국',5,'LCD');
insert into exp_goods_asia values('한국',6,'자동차부품');
insert into exp_goods_asia values('한국',7,'휴대전화');
insert into exp_goods_asia values('한국',8,'환식탄화수소');
insert into exp_goods_asia values('한국',9,'무선송신기 디스플레이 부속품');
insert into exp_goods_asia values('한국',10,'철 또는 비합금강');
insert into exp_goods_asia values('일본',1,'자동차');
insert into exp_goods_asia values('일본',2,'자동차부품');
insert into exp_goods_asia values('일본',3,'전자집적회로');
insert into exp_goods_asia values('일본',4,'선박');
insert into exp_goods_asia values('일본',5,'반도체웨이퍼');
insert into exp_goods_asia values('일본',6,'화물차');
insert into exp_goods_asia values('일본',7,'원유제외 석유류');
insert into exp_goods_asia values('일본',8,'건설기계');
insert into exp_goods_asia values('일본',9,'다이오드,트랜지스터');
insert into exp_goods_asia values('일본',10,'기계류');
select * from exp_goods_asia order by goods;
select goods from exp_goods_asia where country='한국'
intersect
select goods from exp_goods_asia where country='일본';
select goods from exp_goods_asia where country='한국'
union
select goods from exp_goods_asia where country='일본';
select goods from exp_goods_asia where country='한국'
union all
select goods from exp_goods_asia where country='일본' order by goods;
select goods from exp_goods_asia where country='한국'
minus
select goods from exp_goods_asia where country='일본';
select goods from exp_goods_asia where country='일본'
minus
select goods from exp_goods_asia where country='한국';
(select goods from exp_goods_asia where country='한국'
union
select goods from exp_goods_asia where country='일본')
minus
(select goods from exp_goods_asia where country='한국'
intersect
select goods from exp_goods_asia where country='일본');


-- select A.보고 싶은 칼럼명,A.보고 싶은 칼럼명,B.보고 싶은 칼럼명
-- from A,B 
-- where A.같은 칼럼명 = B.같은 칼럼명
select worker.emp_name, departments.department_name
from worker, departments
where worker.department_id=departments.department_id;

select a.emp_name, b.job_title
from worker a, jobs b   -- alias name
where a.job_id=b.job_id
order by b.job_title;

select distinct prod_id from sales order by prod_id;

select * from roomtype;
select * from roominfo;
insert into roominfo values(101,'지리산',2,7,1500);
insert into roominfo values(102,'설악산',4,8,1800);
insert into roominfo values(103,'한라산',3,5,1600);

select a.num, a.name, b.typename, a.howmany, a.howmuch
from roominfo a, roomtype b
where a.type = b.typenum
order by a.num;

select b.prod_name, c.cust_name, d.channel_desc, e.emp_name, f.department_name
from sales a, products b, customers c, channels d, employees e, departments f
where a.prod_id=b.prod_id
  and a.cust_id=c.cust_id
  and a.channel_id=d.channel_id
  and a.employee_id=e.employee_id
  and e.department_id=f.department_id;
  
select * from products;
select * from sales;

select b.prod_name,to_char(sum(a.amount_sold),'9,999,999,999.99'), a.sales_date
from sales a, products b
where a.prod_id=b.prod_id
group by b.prod_name,a.sales_date
order by b.prod_name, a.sales_date;

select b.emp_name, to_char(sum(a.amount_sold),'9,999,999,999.99') sold
from sales a, employees b
where a.employee_id=b.employee_id
group by b.emp_name
order by  b.emp_name;