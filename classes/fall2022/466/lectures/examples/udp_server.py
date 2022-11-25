import socket
import time

host = socket.gethostname()
recv_port =  9001
connection = (host,recv_port)

# Define a UDP socket
serverSocket = socket.socket(socket.AF_INET,socket.SOCK_DGRAM)
# Need to bind a socket for receiving data (port 9001)
serverSocket.bind( connection )

print("Waiting for data")
while(True):
    # Receive data on port 9001 (our binded socket)
    # recvfrom() IS  a blocking call
    data = serverSocket.recvfrom(1024)

    time.sleep(3)

    data = int(data[0])
    # response is a tuple where
    # --> response[0] is the data
    # --> response[1] is connection information 
    print("Got from client:",data)

    if data % 2 == 0:
        # Send out to (host,9000) and hope that socket is listening
        # sendto() is NOT a blocking call
        serverSocket.sendto("even".encode(),(host,9000))
    else:
        serverSocket.sendto("odd".encode(),(host,9000))
    

