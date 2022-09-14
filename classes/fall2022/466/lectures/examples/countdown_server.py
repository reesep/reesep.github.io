import socket
import threading
import time


def handle_connection(connection, addr):

    number = connection.recv(1024).decode()

    for i in range(int(number),0,-1):
        print(i)
        time.sleep(1)


port = 8001
host = socket.gethostname()

serverSocket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

serverSocket.bind( (host,port) )

serverSocket.listen(5)

print("Waiting for connections:")

while True:

    connection, addr=  serverSocket.accept()

    thread = threading.Thread(target=handle_connection, args=(connection,addr))
    thread.start()




