
# Write a program that will ask for the number of
# quarters, dimes, nickels and pennies.
# The program will calculate the total value
# of that change.

quarters = int(input("Enter the number of quarters: "))
dimes = int(input("Enter the number of dimes: "))
nickels = int(input("Enter the number of nickels: "))
pennies = int(input("Enter the number of pennies: "))

value = (quarters * .25) + (dimes * .10) + (nickels * .05) + (pennies * .01)

print("The value of your coins is: ",value,"dollars")
