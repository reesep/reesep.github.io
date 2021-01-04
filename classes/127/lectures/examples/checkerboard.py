import numpy as np

# Create a nxn checkboard of 0 and 1.

## 8 x 8 example
##Checkerboard pattern:                                                   
##[[0 1 0 1 0 1 0 1]                                                      
## [1 0 1 0 1 0 1 0]                                                      
## [0 1 0 1 0 1 0 1]                                                      
## [1 0 1 0 1 0 1 0]                                                      
## [0 1 0 1 0 1 0 1]                                                      
## [1 0 1 0 1 0 1 0]                                                      
## [0 1 0 1 0 1 0 1]                                                      
## [1 0 1 0 1 0 1 0]]


rows = int(input("Enter number of rows"))
columns = int(input("Enter number of columns"))

array = np.zeros(rows*columns,dtype="int")
array = array.reshape(rows,columns)

#Quick way using array slicing
array[::2,::2] = 1
array[1::2,1::2] = 1


#one possible solution
##for i in range(rows):
##
##    if i % 2 == 0:
##
##        for j in range(columns):
##
##            if j % 2 == 0:
##
##                array[i][j] = 1
##    else:
##        
##        for j in range(columns):
##
##            if j % 2 == 1:
##
##                array[i][j] = 1

print(array)


