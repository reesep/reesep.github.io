import socket
import time

host = socket.gethostname()
recv_port =  9000
connection = (host,recv_port)

# Define a UDP socket
clientSocket = socket.socket(socket.AF_INET,socket.SOCK_DGRAM)
# Need to bind a socket for receiving data (port 9000)
clientSocket.bind( connection )

for i in range(50):

    print("Sending to server",i)

    # Send out to (host,9001) and hope that socket is listening
    # sendto() is NOT a blocking call
    clientSocket.sendto(str(i).encode(),(host,9001))

    time.sleep(3)

    # Receive data on port 9000 (our binded socket)
    # recvfrom() IS a blocking call
    response = clientSocket.recvfrom(1024)

    # response is a tuple where
    # --> response[0] is the data
    # --> response[1] is connection information 
    print(response[0].decode())

print("program finished")