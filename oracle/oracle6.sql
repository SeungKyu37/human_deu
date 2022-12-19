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

select getDname(department_id), getMname(department_id), getCount(department_id)
from departments order by getCount(department_id) desc;

set serveroutput on;
declare
    m_name employees.emp_name%type;
--    vs_emp_name employees.emp_name%type;
--    vn_emp_id employees.employee_id%type;
--    cursor c1 (vn number)
--    is
--        select employee_id,emp_name from employees where employee_id>vn; -- 선언
begin
--    for rec in c1(200)
    for rec in (select employee_id,emp_name, manager_id from employees where employee_id>200)
    loop 
        select emp_name into m_name
        from employees
        where employee_id=rec.manager_id;
        dbms_output.put_line(to_char(rec.employee_id)||' , '||rec.emp_name||' , '||m_name);
--        dbms_output.put_line(to_char(rec.employee_id)||' , '||rec.emp_name);
    end loop;
--    open c1(200); -- 열기(실행)
--    loop
--        fetch c1 into vn_emp_id, vs_emp_name; -- 사용
--        exit when c1%notfound; 
--        dbms_output.put_line(to_char(vn_emp_id) ||' , '|| vs_emp_name);
--    end loop;
--    close c1; -- 닫기
end;
/

select emp_name from employees where employee_id>200;

declare
    dname departments.department_name%type;
begin
    for rec in (select a.employee_id, a.emp_name name, b.emp_name mname, b.department_id d_id
                from employees a, employees b
                where a.manager_id is not null
                and a.manager_id = b.employee_id
                order by a.employee_id)
    loop
        select department_name into dname
        from departments
        where department_id = rec.d_id;
        dbms_output.put_line(to_char(rec.employee_id)||' , '||rec.name||' , '||rec.mname||' , ' ||dname);
    end loop;
end;
/

select * from employees order by employee_id;
select * from departments;