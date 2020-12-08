

# Write a python function count_p() that will take in
# a word. The function will count how many P’s are
# in that word


def count_p(word):
    #count the number of P's
    counter = 0
    for each_letter in word:
        if each_letter == "p" or each_letter == "P":
            counter += 1
            
    print("Number of P's:",counter)



count_p("Pepper")
count_p("poppy")
count_p("cat")
