# -*- coding: utf-8 -*-
# 클래스 attribute 사용
# 클래스 변수를 정의

class Employee:

    MIN_SALARY = 20000

    def __init__(self, name, salary = 0):

        self.name = name

        # 인스턴스 생성시, 입력된 급여와 비교
        # 입력된 급여가 기본값보다 적으면, 기본값 부여
        if salary >= Employee.MIN_SALARY:
            self.salary = salary
        else:
            self.salary = Employee.MIN_SALARY

if __name__ =="__main__":
    emp1 = Employee("Evan")
    emp2 = Employee("park", 30000)
    print(emp1.name, emp1.salary)
    print(emp2.name, emp2.salary)