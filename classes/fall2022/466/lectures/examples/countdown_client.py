import socket

port = 8001
host = socket.gethostname()

clientSocket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

clientSocket.connect((host,port) )

number = input("Enter a number for countdown: ")

clientSocket.send(number.encode())

