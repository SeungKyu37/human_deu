# -*- coding: utf-8 -*-

# 핵심 주제 : Decorator
# 중첨함수, 함수를 객체처럼 사용
# 사칙연산을 만들 예정 (중첩함수, 객체)

def math_functions(func_name):
    """ 사칙연산을 하는 함수입니다.
    Args:
        func_name(str) : 함수 이름 기입

    Returns:
        math_functions(func_name)

    Raises:
        ZeroDivisionError : 0으로 나누면 에러를 발생시킨다.
    """

    if func_name == "add":
        def add(a, b):
            return a + b
        return add
    
    elif func_name == "multiple":
        def multiple(a, b):
            return a * b
        return multiple

    elif func_name == "substract":
        def substract(a, b):
            return a - b
        return substract
    elif func_name == "divide":
        def divide(a, b):
            return a // b
        return divide
    else:
        print("....")

if __name__ == "__main__":
    x = 100
    y = 2

    # Closures 개념
    add = math_functions("add")
    print("100 + 2 = {}".format(add(x,y)))

    multiple = math_functions("multiple")
    print("100 * 2 = {}".format(multiple(x,y)))

    substract = math_functions("substract")
    print("100 - 2 = {}".format(substract(x,y)))

    divide = math_functions("divide")
    print("100 / 2 = {}".format(divide(x,y)))