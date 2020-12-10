populations = [["California", 38332521],
["Texas", 26448193],
["New York", 19651127], 
["Florida", 19552860],
["Illinois", 12882135],
["Pennsylvania", 12773801], 
["Ohio", 11570808], 
["Georgia", 9992167],
["Michigan", 9895622], 
["North Carolina",9848060] ]



def calculate_top_10_population(populations):

    total = 0
    for each_state in populations:
        total += each_state[1]

    return total


def calculate_percentage(populations):

    for each_state in populations:

        percent = (each_state[1] / 316128839) * 100

        print(each_state[0],"holds",percent,"percent of the total US population")

    



answer = calculate_top_10_population(populations)
print(answer)
calculate_percentage(populations)
