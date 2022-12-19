-- code block(익명(anonymous, unnamed))
declare
 vi_num NUMBER;
 vi_char CHAR(20);
 pi CONSTANT number:=3.14; -- 상수
begin
 vi_num:=100;
 vi_char:='Hello World';
 dbms_output.put_line(vi_num); -- System.out.println()
 dbms_output.put_line(vi_char);
 dbms_output.put_line(3**4);
 end;
 /
set serveroutput on;

declare
    v_employee_id employees.employee_id%type;
    vs_emp_name employees.emp_name%type;
    vs_dep_name departments.department_name%type;
begin
    select employee_id, emp_name
    into v_employee_id, vs_emp_name
    from employees where employee_id=145;
    dbms_output.put_line('사번='||to_char(v_employee_id)||', 이름='||vs_emp_name);
end;
/

declare --조인
    vs_dep_name departments.department_name%type;
    v_cap_id departments.manager_id%type;
    v_cap_name employees.emp_name%type;
begin
    select a.department_name, a.manager_id, b.emp_name
    into vs_dep_name, v_cap_id, v_cap_name
    from departments a, employees b 
    where a.department_id=80
    and a.manager_id=b.employee_id;
    dbms_output.put_line('부서명='||vs_dep_name||', 부서장 사번='||to_char(v_cap_id)||', 부서장 이름='||v_cap_name);
end;
/
declare -- 조인을 안쓰는 법
    vs_dep_name departments.department_name%type;
    v_cap_id departments.manager_id%type;
    v_cap_name employees.emp_name%type;
begin
    select department_name, manager_id
    into vs_dep_name, v_cap_id
    from departments where department_id=80;
    
    select emp_name into v_cap_name
    from employees
    where employee_id=v_cap_id;
    
    dbms_output.put_line('부서명='||vs_dep_name||', 부서장 사번='||to_char(v_cap_id)||', 부서장 이름='||v_cap_name);
end;
/

declare
    vn_salary employees.salary%type;
    vn_did employees.department_id%type;
begin
    vn_did := round(dbms_random.value(10,110),-1);
    select salary into vn_salary from employees where department_id=vn_did 
    and rownum=1; -- 의사칼럼
    dbms_output.put_line(to_char(vn_did));
    
    if vn_salary between 1 and 3000 then
    dbms_output.put_line(to_char(vn_salary)||' = low');
    elsif vn_salary between 3001 and 6000 then
    dbms_output.put_line(to_char(vn_salary)||' = middle');
    elsif vn_salary between 6001 and 10000 then
    dbms_output.put_line(to_char(vn_salary)||' = high');
    else
    dbms_output.put_line(to_char(vn_salary)||' = super');
    end if;
end;
/

declare
    vn_salary employees.salary%type;
    vn_did employees.department_id%type;
begin
    vn_did := round(dbms_random.value(10,110),-1);
    select salary into vn_salary from employees where department_id=vn_did 
    and rownum=1; -- 의사칼럼
    dbms_output.put_line(to_char(vn_did));
    
    case 
    when vn_salary between 1 and 3000 then
    dbms_output.put_line(to_char(vn_salary)||' = low');
    when vn_salary between 3001 and 6000 then
    dbms_output.put_line(to_char(vn_salary)||' = middle');
    when vn_salary between 6001 and 10000 then
    dbms_output.put_line(to_char(vn_salary)||' = high');
    else
    dbms_output.put_line(to_char(vn_salary)||' = super');
    end case;
end;
/

declare
    vn number :=0;
begin
    while vn<10
    loop
        dbms_output.put_line(vn);
        vn:=vn+1;
    end loop;
end;
/

declare
    vn number;
begin
    for vn in 0 .. 9
    loop
        dbms_output.put_line(vn);
    end loop;
end;
/

declare
    n1 number;
    n2 number;
begin
    for n1 in 1 .. 9
    loop
        for n2 in 1 .. 9
        loop
            dbms_output.put_line(to_char(n1)||' X '||to_char(n2)||' = '|| to_char(n1*n2));
        end loop;
    end loop;
end;
/

declare
    n1 number:=0;
    n2 number:=0;
begin
    loop
        n1 := n1+1;
        n2 := 0;
        loop
            n2 := n2+1;
            dbms_output.put_line(to_char(n1)||' X '||to_char(n2)||' = '|| to_char(n1*n2));
            exit when n2 = 9;
        end loop;
        exit when n1 = 9;
    end loop;
end;
/
create or replace procedure department_info(d_id departments.department_id%type)
is 
    vs_dep_name departments.department_name%type;
    v_cap_id departments.manager_id%type;
    v_cap_name employees.emp_name%type;
begin
    select department_name, manager_id
    into vs_dep_name, v_cap_id
    from departments where department_id=d_id;
    
    select emp_name into v_cap_name
    from employees
    where employee_id=v_cap_id;
    
    dbms_output.put_line('부서명='||vs_dep_name||', 부서장 사번='||to_char(v_cap_id)||', 부서장 이름='||v_cap_name);
end;
/
exec department_info(110);
drop procedure department_info;

create or replace procedure gugu(dan number)
is
    n number;
begin
        for n in 1 .. 9
        loop
            dbms_output.put_line(to_char(dan)||' X '||to_char(n)||' = '|| to_char(dan*n));
    end loop;
end;
/
exec gugu(9);

create or replace procedure howmany(d_id employees.department_id%type:=80)
is
    cnt number;
begin
    select count(*)
    into cnt
    from employees where department_id=d_id;
    dbms_output.put_line(to_char(cnt));
end;
/
exec howmany();

create or replace procedure howmany2(d_id employees.department_id%type)
is
    cnt number;
begin
    select count(*)
    into cnt
    from employees 
    where department_id in (select department_id from departments where parent_id=d_id)
    or department_id=d_id;
    
    dbms_output.put_line(cnt);
end;
/
exec howmany2(10);

create or replace function plus(a number, b number)
return number
is
    c number;
begin
    c := a+b;
    return c;
end;
/
select plus(12,13) from dual;

select b.department_name, sum(a.salary)
from employees a, departments b
where a.department_id = b.department_id
group by b.department_name
order by b.department_name;
create or replace function tot_sal(d_id departments.department_id%type)
return employees.salary%type
is
    total employees.salary%type;
begin
    select sum(salary) into total from employees where department_id=d_id;
    return total;
end;
/
select department_name, tot_sal(department_id)
    from departments order by department_name;

create or replace function getDname(d_id departments.department_id%type)
return departments.department_name%type
is
    Dname departments.department_name%type;
begin
    select department_name into Dname from departments where department_id=d_id;
    return Dname;
end;
/

create or replace function getMname(d_id departments.department_id%type)
return employees.emp_name%type
is
    Mname employees.emp_name%type;
begin
    select emp_name into Mname from employees a, departments b where a.employee_id = b.manager_id and b.department_id=d_id;
    return Mname;
end;
/

create or replace function getCount(d_id departments.department_id%type)
return number
is
    cnt number;
begin
    select count(*) into cnt from employees where department_id=d_id;
    return cnt;
end;
/

select Dname(department_id), Mname(), getCount()
from departments order by department_name;