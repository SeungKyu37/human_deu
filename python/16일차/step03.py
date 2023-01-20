# -*- coding:utf-8 -*-
# 유투브에서 영상 가져오기

import cv2
import pafy
import numpy as np

def rescale_frame(frame, scale):    # works for image, video, live video
    width = int(frame.shape[1] * scale)
    height = int(frame.shape[0] * scale)
    dimensions = (width, height)
    return cv2.resize(frame, dimensions, interpolation=cv2.INTER_AREA)

def main():
    url = 'https://www.youtube.com/watch?v=2_nEJd6JkOk'
    video = pafy.new(url)

    print('title = ', video.title)
    print('video.rating = ', video.rating)
    print('video.duration = ', video.duration)

    # backend_youtube_dl.py 파일 에서
    # 53, 54번째 줄 
    # self._likes = self._ydl_info.get('like_count',0)
    # self._dislikes = self._ydl_info.get('dislike_count',0)
    # 로 수정

    best = video.getbest()
    print('best.resolution', best.resolution)

    cap=cv2.VideoCapture(best.url)
    frame_size = (int(cap.get(cv2.CAP_PROP_FRAME_WIDTH)),
                int(cap.get(cv2.CAP_PROP_FRAME_HEIGHT)))
    print('frame_size =', frame_size)

    out = cv2.VideoWriter('Background_Subtraction_Tutorial_frame.mp4',
                     cv2.VideoWriter_fourcc('M', 'J', 'P', 'G'),
                     30,
                     (frame_size))

    backSub = cv2.createBackgroundSubtractorMOG2()

    while(True):

        retval, frame = cap.read()
        if not retval:
            break
        # frame_resized = rescale_frame(frame, scale=.5)
        # cv2.imshow('frame', frame_resized)
        
        # gray = cv2.cvtColor(frame, cv2.COLOR_BGR2GRAY)
        # edges = cv2.Canny(gray, 100, 100)

        # edges_resized = rescale_frame(edges, scale=.5)
        
        # cv2.imshow('edges', edges_resized)

        cv2.rectangle(frame, (10, 2), (100, 20), (255, 255, 255), -1)
        cv2.imshow('Frame', frame)
        fgmask = backSub.apply(frame)
        cv2.imshow('FG Mask', fgmask)
        out.write(cv2.cvtColor(fgmask, cv2.COLOR_BGR2RGB))

        key = cv2.waitKey(25)
        if key == 27: # Esc
                break
    cv2.destroyAllWindows()

if __name__ == "__main__":
    main()
