
# Write a function, is_prime, that takes a single integer
# argument and returns True when the argument is a prime
# number and False otherwise. 



# 7 2,3,4,5,6
# 10  2,3,4,5,6,7,8,9


# number = 6
# 2, 3, 4, 5 

def is_prime(number):

    for i in range(2,number):
        if(number % i == 0):
            return False
    return True



print(is_prime(7))
print(is_prime(10))
print(is_prime(91))
print(is_prime(13))
