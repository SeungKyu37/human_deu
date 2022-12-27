# -*- coding: utf-8 -*-
# 문자열 포맷팅 연습

def main():
    print(1+1)

if __name__ == "__main__":
    # 숫자 바로 대입
    print("I eat %d apples." %3)
    # 문자열 바로 대입
    print("I eat %s apples." %"five")

    # 숫자값 변수 대입
    number = 3
    print("I eat %d apples." %number)
    # 2개 이상의 값 넣기
    number = 10
    day = "three"
    print("I ate %d apples. so I was sick for %s days." %(number, day))

    print("------------------")

    # .format() 사용
    # 숫자 바로 대입
    print("I eat {0} apples.".format(3)) # 0 안 써도 순서대로 들어간다.
    # 문자열 바로 대입
    print("I eat {0} apples.".format("five"))

    # 숫자값 변수 대입
    number = 3
    print("I eat {0} apples.".format(number))
    # 2개 이상의 값 넣기
    number = 10
    day = "three"
    print("I ate {0} apples. so I was sick for {1} days.".format(number, day)) # 0, 1 안 써도 순서대로 들어간다.

    print("------------------")

    # f-string 문자열
    name = '홍길동'
    age = 30
    print(f'나의 이름은 {name}입니다. 나이는 {age}입니다.')
    # 표현식 지원
    age = 30
    print(f'나는 내년이면 {age+1}살이 된다.')
    # 딕셔너리 사용
    dic = {'name':'홍길동', 'age':30}
    print(f'나의 이름은 {dic["name"]}입니다. 나이는 {dic["age"]}입니다.')