
# Write a program that will ask for the number of
# quarters, dimes, nickels and pennies.
# The program will calculate the total value
# of that change.

def sum_change(quarters,dimes,nickels,pennies):
    value = (quarters * .25) + (dimes * .10) + (nickels * .05) + (pennies * .01)
    return value


def main():

    answer = sum_change(10,4,8,1)
    print(answer)




main()
