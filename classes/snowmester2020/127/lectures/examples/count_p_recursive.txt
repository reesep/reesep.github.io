

def count_p(word):

    # base case
    if len(word) == 0:
        return 0


    # recursive case

    elif word[0] == "p":
        return 1 + count_p(word[1:])
    elif word[0] != "p":
        return 0 + count_p(word[1:])



def main():

    word = "pepper"
    word = word.lower()
    count = count_p(word)
    print(count)

main()




    
