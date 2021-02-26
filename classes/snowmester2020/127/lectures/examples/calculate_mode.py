#Write a python function that will calculate the mode in a list of
# integers (you can always assume there will
# always be one single answer)



# input -> [1,2,3,2,2,3,1]
# output -> 2


def calculate_mode(dataset):

    largest_freq_so_far = 0
    answer = 0
    for each_num in dataset:
        freq = dataset.count(each_num)
       
        if freq > largest_freq_so_far :
            largest_freq_so_far = freq
            answer = each_num
    

    return answer


dataset = [10,20,20,20,3,3,2,1,1,0,21]
answer = calculate_mode( dataset )
print(answer)

            
