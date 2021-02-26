# check to see if a number is positive or negative (or 0)

num = int(input("Enter a number: "))

if(num >= 0):
    if(num == 0):
        print("It is zero")
    else:   
        print("It is positive")
elif(num < 0):
    print("It is negative")
