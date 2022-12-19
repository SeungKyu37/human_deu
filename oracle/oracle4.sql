select a.employee_id, a.emp_name, b.emp_name manager_name
from employees a, employees b
where a.manager_id=b.employee_id
order by a.employee_id;

select a.department_id, a.department_name, b.department_name 상위부서
from departments a, departments b
where a.parent_id=b.department_id;

select a.employee_id, a.emp_name, b.emp_name manager_name, c.department_name
from employees a, employees b, departments c
where a.manager_id=b.employee_id
and a.department_id = c.department_id
order by a.employee_id;

select a.employee_id, a.emp_name, a.salary, b.department_name parent_name
from employees a, departments b
where a.department_id=b.department_id
and a.salary>6000
order by a.salary;

-- ANSI문법
select a.employee_id, a.emp_name, a.salary, b.department_name parent_name
from employees a inner join departments b
on a.department_id=b.department_id  --조인조건
where a.salary>6000 --필터링조건
order by a.salary;

select a.employee_id, a.emp_name, a.salary, b.department_name parent_name
from (select * from employees where salary>6000) a, departments b   -- sub-query
where a.department_id=b.department_id;

create view v_six as select * from employees where salary>6000;
select a.employee_id, a.emp_name, a.salary, b.department_name parent_name
from v_six a, departments b   -- sub-query
where a.department_id=b.department_id;

select a.employee_id, a.emp_name, a.salary, b.department_name
from employees a, departments b
where a.department_id=b.department_id
and a.employee_id in(select employee_id from employees where salary>6000);


select * from departments;
select a.employee_id, a.emp_name, b.emp_name manager, c.department_name, d.emp_name 부서장
from employees a, employees b, departments c, employees d
where a.manager_id=b.employee_id
and a.department_id=c.department_id
and c.manager_id=d.employee_id
order by a.emp_name;

select b.department_name,count(*)
from employees a, departments b
where a.department_id=b.department_id
group by b.department_name
order by b.department_name;

select a.emp_name, count(*) 인원수
from employees a, departments b, employees c
where b.manager_id=a.employee_id
and c.department_id = b.department_id
group by a.emp_name
order by a.emp_name;

select * from employees;
select b.department_name, count(*) 인원수, sum(a.salary) 월급합계
from employees a, departments b
where a.department_id = b.department_id
group by b.department_name
order by b.department_name;

select a.employee_id, a.emp_name, b.emp_name manager_name
from employees a, employees b
where a.manager_id=b.employee_id(+);

select a.department_id, a.department_name, b.department_name 상위부서
from departments a, departments b
where a.parent_id=b.department_id(+);

-- only in MySQL
select a.department_id, a.department_name, b.department_name 상위부서
from departments a left outer join departments b
on a.parent_id=b.department_id;

create view v_six as
select a.employee_id, a.emp_name, a.salary, b.department_name parent_name
from employees a, departments b
where a.department_id=b.department_id(+)
and a.salary>6000;

drop view v_six;
select * from v_six order by emp_name;

select emp_name, salary from employees where salary>(select avg(salary) from employees) order by salary;
-- subquery에는 order by 사용할 수 없다.

select a.emp_name,b.department_name,c.emp_name 부서장
from employees a, departments b, employees c
where a.department_id=b.department_id
and b.department_name like '%부'
and b.manager_id=c.employee_id(+);

select x.emp_name, x.department_name, y.emp_name captain
from (select a.emp_name, a.manager_id, b.manager_id captain_id, b.department_name
      from employees a, departments b  
      where a.department_id=b.department_id
      and b.department_name like '%부') x, employees y
where x.department_name like '%부'
and x.captain_id=y.employee_id(+)
order by x.emp_name;

select a.emp_name,b.department_name,c.emp_name 부서장
from employees a, 
    (select department_id,department_name, manager_id captain_id
    from departments
    where department_name like '%부')b,
    employees c
where a.department_id=b.department_id
and captain_id=c.employee_id(+);

select a.emp_name, b.department_name, c.emp_name captain
from employees a, departments b, employees c
where a.department_id in
    (select department_id from departments where department_name like '%부')
    and a.department_id=b.department_id(+)
    and b.manager_id=c.employee_id;

desc roomtype;    
desc roominfo;
create table book(
booknum number()
num number()
start_dt