import socket

## TCP Client
port = 4000
host = socket.gethostname()
clientSocket = socket.socket(socket.AF_INET,socket.SOCK_STREAM)
clientSocket.connect( (host,port))
sentence = input("Enter a sentence: ")
clientSocket.send(sentence.encode())

response = clientSocket.recv(1024).decode()
print("Response from server",response)


