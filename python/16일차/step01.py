# -*- coding:utf-8 -*-
# 비디오 캡처와 화면 표시

import cv2

def main():
    # print("Hello OpenCV")
    # print(cv2.__version__)
    cap = cv2.VideoCapture(0) # 0번 카메라

    frame_size = (int(cap.get(cv2.CAP_PROP_FRAME_WIDTH)),
                    int(cap.get(cv2.CAP_PROP_FRAME_HEIGHT)))

    print('frame_size = ', frame_size)

    while True:
        # 비디오 영상을 읽겠습니다.
        retval, frame = cap.read()

        # 비디오 영상 캡쳐 못할 시, break
        if not retval:
            break

        cv2.imshow('frame', frame)

        keyboard = cv2.waitKey(25)
        if keyboard == 27: #ESC 입력된 키
            break
    
    if cap.isOpened():
        cap.release()
    cv2.destroyAllWindows()

if __name__ == "__main__":
    main()