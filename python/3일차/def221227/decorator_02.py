# -*- coding: utf-8 -*-

def make_something(func):
    def face():
        print("눈 성형 함")
        func()

    return face

@make_something # 데코레이터
def normal():
    print("노멀한 얼굴")

if __name__ =="__main__":
    normal()