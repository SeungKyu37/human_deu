# -*- coding: utf-8 -*-
# 컨텍스트 매니저
# 파티 식당 종업원
# - 테이블 세팅
# - 손님 식사 주문 / 식사
# - 테이블 닦고 / 테이블 정리 / 다음 손님 맞을 준비

# 활용 예제
# 데이터를 모음 --> 업데이트 / DB 작업 후 종료

def main():
    with open("data/my_file.txt") as my_file: # with : 파일을 열고 처리 후 닫기
        text = my_file.read()
        text_length = len(text)
        # 파일 연결 작업 완료 / 닫기

    print("파일 글자 총 길이는 {}과 같다.".format(text_length))

if __name__ == "__main__":
    main()