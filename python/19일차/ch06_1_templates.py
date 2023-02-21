from flask import Flask

app = Flask(__name__)

@app.route('/')
def index():
   return '<html><body><h2>Hello World</h2></body></html>'

if __name__ == '__main__':
    app.run(debug=True)
