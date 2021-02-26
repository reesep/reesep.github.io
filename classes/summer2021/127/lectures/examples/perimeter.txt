import numpy as np


# Write a program that will take in some number of rows
# and columns for a 2D array. Then, a 2d array will be
# created with random numbers. The program should sum up
# all of the numbers that make up the perimeter of that array


# 5 5 5
# 2 2 2
# 5 5 5 = 34

rows= int(input("Enter number of rows: "))
columns= int(input("Enter number of columns: "))

s = rows * columns
array = np.random.randint(1,10, size = s)
array = array.reshape(rows,columns)
print(array)
total = 0
for row in range(rows):
    for col in range(columns):

        #sums the top and bottom row
        if row == 0 or row == (rows-1):
            total += array[row][col]

        #sums the "sides" of the array
        else:
            if col == 0 or col == (columns - 1):
                total += array[row][col]
            


print(total)
        


