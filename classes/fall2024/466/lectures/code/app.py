from flask import Flask,request

app = Flask(__name__)

@app.route('/')
def example():
    return "Hello World!"

@app.route('/reese')
def reese():
    return "I am reese!"

@app.route('/raven')
def raven():

    name = request.headers['name']

    file = open("raven.txt", "r", encoding="utf8")
    filetext = file.read()

    
    return "Hello there, " + name + "\n \n" + filetext

if __name__ == '__main__':
    app.run()
