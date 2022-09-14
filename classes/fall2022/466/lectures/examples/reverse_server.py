import socket

# TCP Server
print("Server starting...")
port = 4000
host = socket.gethostname()
serverSocket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
serverSocket.bind( (host,port) )

serverSocket.listen(1)
print("Server is ready for connections")
while True:

    connection, addr = serverSocket.accept()
    sentence = connection.recv(1024).decode()

    sentence = list(sentence)
    sentence.reverse()
    sentence = "".join(sentence)
    connection.send(sentence.encode())
    connection.close()
