
# Write a program that will print out whether a number is even
# or oddfor all number from 1 to 100

# 1 is odd
# 2 is even
# 3 is odd
# 4 is even
# ....
# 100 is even


for nums in range(1,101):
    if( nums % 2 == 0):
        print(nums,"is even")
    else:
        print(nums,"is odd")



