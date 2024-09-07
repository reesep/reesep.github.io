# Server Program

import socket
import random

print("Server is starting")
port = 9000
host = socket.gethostname()

#bind socket
serverSocket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
serverSocket.bind( (host, port) )

random_num = random.randint(1,10)

print("Server is ready for connections")

serverSocket.listen(1)

#accept new connection(s)
connection, addr = serverSocket.accept()

while True:

    user_guess = int(connection.recv(1024).decode())
    print("The user guessed",user_guess)

    if (user_guess > random_num):
        connection.send("Lower".encode())
    elif(user_guess < random_num):
        connection.send("Higher".encode())
    else:
        connection.send("Win!".encode())
        break






