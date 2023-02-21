# -*- coding: utf-8 -*-
# BMI 계산기 간단하게 만들어보기

import streamlit as st

def main():
    # 제목
    st.title('BMI 계산기')

    # 몸무게 저장 변수
    weight = st.number_input('몸무게를 입력해주세요. (Kg)')

    # 단위 선택
    h_format = st.radio('키 입력 단위 설정: ', ('cm', 'm', 'feet'))
    

    # 단위 별 BMI 계산기 입력
    if h_format == 'cm':
        height = st.number_input('키를 입력해주세요.')
        try:
           bmi_result = weight / ((height / 100) ** 2)
        except:
            st.text('0 또는 음수 입력하지 마시오.')

    elif h_format == 'm':
        height = st.number_input('키를 입력해주세요.')
        try:
            bmi_result = weight / (height ** 2)
        except:
            st.text('0 또는 음수 입력하지 마시오.')

    else:
        height = st.number_input('키를 입력해주세요.')
        try:
            bmi_result = weight / ((height / 3.281) ** 2)
        except:
            st.text('0 또는 음수 입력하지 마시오.')

    if (st.button('BMI 계산기')):
        st.text(bmi_result)

        if bmi_result >= 25.0:
            st.error("비만")
        elif 23.0 <= bmi_result < 25:
            st.warning("과제중")
        elif 18.5 <= bmi_result < 23:
            st.success("정상")
        else:
            st.warning("저체중")

if __name__ == "__main__":
    main()