# -*- coding:utf-8 -*-

from flask import Flask

app = Flask(__name__)

@app.route('/')
def hi():
    return 'HI'

@app.route('/myblog/<int:num>')
def myblog(num):
    print(type(num))
    return f'나의 블로그 - {num}'

# 수정번호 0.1, 실수형
@app.route('/edit/<float:num>')
def edit(num):
    print(type(num))
    return f'수정번호 - {num}'

if __name__ == '__main__':
    app.run(debug=True)
