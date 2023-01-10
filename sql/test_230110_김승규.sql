-- �������� 1. SELECT ���� 
-- ������Ʈ ���̺��� ��� �ʵ带 �˻��Ѵ�. 
select * from tb_point;

-- �������� 2. SELECT ���� 
-- ������Ʈ ���̺��� ���ڵ�, ����Ʈ����, ����Ʈ�� �˻��Ѵ�.
select customer_cd, point_memo, point from tb_point;?

-- �������� 3. SELECT ���� 
-- ������Ʈ ���̺��� ���ڵ�, ����Ʈ����, ����Ʈ �ʵ� ������ �ѱ۷� ����Ѵ�. 
select customer_cd ���ڵ�, point_memo "����Ʈ ����", point ����Ʈ from tb_point;

-- �������� 4. WHERE ����
-- ������ ���̺��� ��������Ʈ�� 10,000 �̸��� �������� ���ڵ�, ����, �̸���, ��������Ʈ �ʵ带 �˻��Ѵ�.
select customer_cd, customer_nm, email, total_point from tb_customer where total_point < 10000;

-- �������� 5. WHERE-AND ����
-- ������Ʈ ���̺��� ���ڵ尡 ��2017053���̸鼭 �Ϸù�ȣ�� 2�� �������� ���ڵ�, �Ϸù�ȣ, ����Ʈ �ʵ带 �˻��Ѵ�.
select customer_cd, seq_no, point from tb_point where customer_cd = '2017053' and seq_no = 2;

-- �������� 6. WHERE-OR ����
-- ���� ���̺��� ���ڵ尡 ��A�� �Ǵ� ��B���̰ų� ����, ����, ���� ������ ��� 80�� �̻��� �л� �ʵ带 �˻��Ѵ�.
select * from tb_grade where class_cd = 'A' or class_Cd = 'B' or kor >=80 and eng >= 80 and mat >= 80; 
?
-- �������� 7. WHERE BETWEEN ����
-- ������Ʈ ���̺��� ����Ͻð� 2018�� ���� �ְ�, ����Ʈ�� 10,000���� 50,000 ����Ʈ ������ �����͸� �˻��Ѵ�.
select * from tb_point where substr(reg_dttm, 1,4) <= 2018 and point between 10000 and 50000;

-- �������� 8. �񱳿�����
-- �� ���̺��� ��������Ʈ�� 20,000 �̻��� 1980��� ���� ���� ���ڵ�, ����, ����, �������, ��������Ʈ�� �˻��Ѵ�.
select customer_cd, customer_nm, mw_flg, birth_day, total_point 
from tb_customer 
where substr(birth_day, 1, 3) = '198' 
and total_point >= 20000;

-- �������� 9. LIKE
-- �� ���̺��� �����̸鼭 ������� �� ���� 5, 6, 7���� ���� ���ڵ�, ����, ����, �������, ��������Ʈ�� �˻��Ѵ�.
select customer_cd, customer_nm, mw_flg, birth_day, total_point 
from tb_customer where mw_flg = 'M' 
and (birth_day like '____05%' or birth_day like '____06%' or birth_day like '____07%');

-- �������� 10. LIKE
-- �� ���̺��� ���ڵ尡 ��2017���� �����ϸ鼭 ������ �� �Ǵ� ���ڵ尡 ��2019���� �����ϸ鼭 ������ ���� ���ϰ�, �� �� ��������Ʈ�� 30000 ������ �����͸� �˻��Ѵ�.
select customer_cd, customer_nm, mw_flg, birth_day, total_point 
from tb_customer 
where customer_cd like '2017%'
and mw_flg = 'M' 
or customer_cd like '2019%'
and mw_flg = 'F'
and total_point <= 30000;

-- �������� 11. IN ������ 
-- ǰ������ ���̺��� ǰ���ڵ尡 'S01��, ��S04��, ��S06��, ��S10���� �����͸� �˻��Ѵ�.
select * from tb_item_info where item_cd in ('S01', 'S04', 'S06', 'S10');

-- �������� 12. IN ������ 
-- ������Ʈ ���̺��� ���ڵ尡 ��2017042�� �Ǵ� ��2018087�� �Ǵ� '2019095' �̸鼭 ����Ʈ���뿡 �����š� ���ڰ� ���Ե� �����͸� �˻��Ѵ�.
select * from tb_point where customer_cd in ('2017042', '2018087', '2019095') and point_memo like '%����%';

-- �������� 13. ORDER BY 
-- ������Ʈ ���̺��� ������� '2019�����̰� ����Ʈ���뿡 '����'�� ���Ե� �����͸� ����Ʈ�� ū ������� �˻��Ѵ�.
select * from tb_point where substr(reg_dttm, 1, 4) = 2019 and point_memo like '%����%' order by point desc;

-- �������� 14. ORDER BY 
-- ���� ���̺��� ��B������ ����, ����, ���� ������ �հ谡 ���� ������ �˻��Ѵ�.
select kor, eng, mat, tot �հ� from tb_grade where class_cd = 'B' order by tot desc;

-- �������� 15. GROUP BY
-- �Ǹ� ���̺��� �Ǹ����� ��20190802�� �Ǵ� ��20190803���� ������� �Ǹ��ϰ� ��ǰ������ �׷�ȭ�� ���Ǹż��� ���ϰ� �Ǹ��ϰ� ��ǰ���� ������ ������ �����Ѵ�.
select sales_dt, product_nm, sum(sales_count) ���Ǹż�
from tb_sales
where sales_dt in ('20190802', '20190803')
group by sales_dt, product_nm
order by sales_dt, product_nm;

-- �������� 16. DISTINCT 
-- �Ǹ� ���̺��� '20190801������ ��20190802�� �Ⱓ�� �Ǹ��� ��ǰ���� ������ ������ �ߺ����� �˻��Ѵ�.
select distinct product_nm 
from tb_sales 
where sales_dt in ('20190801', '20190802') 
order by product_nm; 
?
-- �������� 17. JOIN
-- �� ���̺��� ���ڵ尡 2019069 �����͸� ������Ʈ ���̺�� ���� �˻��Ͽ� �� ���̺����� ���ڵ�, ����, ������ �˻��� �� ������Ʈ ���̺����� �Ϸù�ȣ, ����Ʈ����, ����Ʈ�� �˻��Ѵ�.
select a.customer_cd, a.customer_nm, a.mw_flg, b.seq_no, b.point_memo, b.point 
from tb_customer a, tb_point b
where a.customer_cd = b.customer_cd
and a.customer_cd = 2019069;

-- �������� 18. CASE
-- �� ���̺��� ��������Ʈ�� 1,000���� 20,000�̸��̸� ���ǹ���, 20,000���� 50,000�̸� �̸� ����塱, 50,000�̻��̸� ��VIP�� ����� ���̰� �� ���ǿ� �ش� ������ ���Ϲݡ� ����� ���δ�.       
select customer_cd, customer_nm, total_point,
    case when total_point >= 1000 and total_point < 20000 then '�ǹ�'
        when total_point >= 20000 and total_point < 50000 then '���'
        when total_point >= 50000 then 'VIP'
        else '�Ϲ�'
        end as total_point
from tb_customer;
-- �������� 19. ROWNUM
-- ���� ���̺��� ���ڵ尡 ��A�� �Ǵ� ��C������ �л��� ������� ��� �ʵ�� �������� ���ȣ�� �˻��Ѵ�.
select rownum, class_cd, student_no, student_nm, kor, eng, mat, tot, avg from tb_grade where class_cd = 'A' or class_cd = 'C';

-- �������� 20. NULL
-- �� ���̺��� ���ڵ尡 ��2018�� �Ǵ� ��2019���� �����ϰ�, ������ 1990�� �Ǵ� 2000�� ���� �� �� ��ȭ��ȣ�� �����Ǿ� �ִ� �����͸� �˻��Ѵ�.
?select * from tb_customer where ;
select * from tb_customer 
where (customer_cd like '2018%' or customer_cd like '2019%') 
and (birth_day like '199%' or birth_day like '200%')
and phone_number is not null;

-- �������� 21. DUAL
-- DUAL ���̺�� 300��60�� ���� ��¥�� 30�� ������ ��¥�� 'YYYY-MM-DD' �������� ���δ�. ����� 'YYYY-MM-DD' ������ CHAR() �Լ��� ���糯¥�� 'YYYY-MM-DD' ������ �ɼ����� �Է��� ���δ�.
?
-- �������� 22. ��������
-- ���� ���̺��� ���ڵ尡 ��A�� �Ǵ� ��C������ �л��� ������� �հ谡 ���� ������ ���ȣ�� ���δ�. (���� ���� ������ 1���̴�.)
-- �Ʒ� �ڵ� ����
UPDATE TB_GRADE
SET    TOT = KOR + ENG + MAT,
       AVG = ROUND((KOR + ENG + MAT) / 3,1);
SELECT * FROM TB_GRADE;
COMMIT;

UPDATE TB_GRADE
SET    TOT = KOR + ENG + MAT,
       AVG = ROUND((KOR + ENG + MAT) / 3,1);
?
SELECT * FROM TB_GRADE;
?
-- �ڵ� �ۼ�
?
-- �������� 23. EXISTS
-- ������Ʈ ���̺��� ����Ʈ ���뿡 ���̺�Ʈ���� ���Ե� ���� ã�� �� ���̺� ���� ���ڵ尡 �����Ѵٸ� �˻��Ѵ�.