

# Write a function that is going to create a list of
# squared number from 1 to N


# list_of_squares(5)
# 1. 1
# 2. 4
# 3. 9
# 4. 16
# 5. 25



def list_of_squares(n):

    for i in range(1,n+1):
        print(str(i) + ".", i*i)

    


list_of_squares(100)
