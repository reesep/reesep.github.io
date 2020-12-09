# Write a python function that will return the
# largest value in a list. Next, generate a list
# of a random size (between 10 and 20) that is filled
# with random integers between 1 and 1000 and pass it
# into the function you created


# input -> [10, 15, 7, 11]
# output -> 15

import random

def find_largest_value(values):

    current_largest = 0
    for each_num in values:

        if each_num > current_largest:
            current_largest = each_num
        
    return current_largest


random_list = []
size_of_list = random.randint(10,20)
for i in range(size_of_list):
    rand_num = random.randint(1,1000)
    random_list.append(rand_num)

print(random_list)


largest_num = find_largest_value(random_list)
print(largest_num)
