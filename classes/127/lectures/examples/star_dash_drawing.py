
# Write a Python program that asks the user to enter
# two integers: one for the number of rows and one for
# the number of columns. The program should then
# produce a text-based drawing where each position in
# the drawing is randomly determined with equal
# probability to be either a "*" or a "-". For example,
# with 4 rows and 6 columns, the drawing might look
# like this:

#**-*-*
#--**--
#-*--*-
#---*-*

import random

rows = int(input("enter numbers of rows: "))
columns = int(input("enter numbers of columns: "))


rowtext = ""

for y in range(rows):

    rowtext = ""
    for x in range(columns):

        val = random.randint(1,2)
        if val == 1:
            rowtext += "*"
        elif val == 2:
            rowtext += "-"

    print(rowtext)

