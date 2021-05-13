
# Write a calculator program that will ask for
# two numbers from the user. The program
# should then as the user what operation they
# want to do (addition, subtraction,
# multiplication, division). The program
# should then do the requested operation and
# print out the answer.

def addition(num1, num2):
    return num1 + num2

def subtraction(num1, num2):
    return num1 - num2

def multiplication(num1, num2):
    return num1 * num2

def division(num1, num2):
    return num1 / num2

def main():

    num1 = int(input("Enter a number: "))
    num2 = int(input("Enter another number: "))

    operation = input("What would you like to do? (Addition, Subtraction, Multiplication, Division: ")

    #update string to only lowercase letters
    operation = operation.lower()

    if(operation == "addition"):
        answer = addition(num1,num2)
        print(answer)
    if(operation == "subtraction"):
        answer = subtraction(num1,num2)
        print(answer)
    if(operation == "multiplication"):
        answer = multiplication(num1,num2)
        print(answer)
    if(operation == "division"):
        answer = division(num1,num2)
        print(answer)
        
main()
 


