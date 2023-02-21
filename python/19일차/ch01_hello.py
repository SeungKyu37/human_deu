from flask import Flask

app  = Flask(__name__)

@app.route('/') # URL 세팅
def greeting():
    return 'Hello World'

if __name__ == "__main__":
    app.run(debug=True)
