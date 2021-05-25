



def is_palindrome(word):

    if(len(word) == 1 or len(word) == 0):
        return True
    elif(word[0] != word[-1]):
        return False
    else:
        return is_palindrome(word[1:-1])



def main():

    word = input("Enter a word or sentence: ")
    
    word = word.lower()

    no_spaces = word.replace(" ","") #remove space characters
    print(no_spaces)
    
    if( is_palindrome(no_spaces) ):
        print(word, "is a palindrome")
    else:
        print(word, "is not a palindrome")
        
    
main()
