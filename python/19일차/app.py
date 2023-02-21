from flask import Flask, render_template, request
import sqlite3 as sql
app = Flask(__name__)
 
@app.route('/')
def home():
    return render_template('home.html')
 
@app.route('/enternew') #데이터 입력 form.
def new_student():
   return render_template('student.html')
 
@app.route('/addrec',methods = ['POST', 'GET']) #student.html에서 입력한 값들을 post로 전달받음.
def addrec():
   if request.method == 'POST':
      try:
         nm = request.form['nm']
         add = request.form['add']
         city = request.form['city']
         pin = request.form['pin']
         
         with sql.connect("database.db") as con:
             #db 입력창에 입력커서 놓기.
            cur = con.cursor()
            
            #db에 값 입력. (메모리상 입력o, db에 입력x)
            cur.execute("INSERT INTO students (name,addr,city,pin) VALUES (?,?,?,?)",(nm,add,city,pin) )
            
            con.commit() #db에 값 저장. (데이터베이스에 입력됨.)
            msg = "DB 저장 완성"
 
      except:
         con.rollback()
         msg = "DB 저장 미완성"
      
      finally: #try를 하던 except을 하던 finally는 무조건 한번 실행됨. 
         return render_template("result2.html",msg = msg) #파이썬에 있는 msg객체를 result.html에 전달.
         con.close() #db 닫음.
 
@app.route('/list')
def list():
   con = sql.connect("database.db") #database.db파일에 접근.
   con.row_factory = sql.Row 
   # row_factory: 값을 지정하여 개별 행을 원하는 파이썬 타입으로 변환.
   # sqlite3.Row: 기본적인 key, value 로 액세스가 가능한 객체가 리턴됨. 
   
   cur = con.cursor() #입력커서 놓기.
   cur.execute("select * from students") #데이터 검색 
   
   rows = cur.fetchall(); #레코드 단위로 데이터를 전달받음.
   return render_template("list.html",rows = rows) #rows객체를 리스트 타입으로 list.html에 전달.
 
if __name__ == '__main__':
   app.run(debug = True)
