from flask import Flask

app = Flask(__name__)
@app.route('/')
def main():
    return "첫번째 페이지"

@app.route('/greet')
def greeting():
    return 'Hello World!!'

@app.route('/hello')
def hello():
    return 'Hello~'

if __name__ == "__main__":
    app.run(debug=True)