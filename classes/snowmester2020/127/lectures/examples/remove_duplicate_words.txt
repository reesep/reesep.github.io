
# Write a python function that will take in a list of words and return
# a list with all duplicate words removed


def remove_duplicate_words(word_list):

    new_list = []

    for each_word in word_list:

        if( each_word not in new_list):
            new_list.append(each_word)


    return new_list



def main():

    words = ["hi","reese","hello"]
    no_duplicates = remove_duplicate_words(words)
    print(no_duplicates)


main()
