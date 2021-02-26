
# Write a Python program that generates a random
# number between 1 and 10. The program should
# repeatedly ask the user to guess what the
# number is until the user guesses correctly.
# When the user guesses correctly, the program
# should print a message that shows how many
# tries it took. For example, the message might
# be Congratulations! That took 6 guesses.
import random

# generate a random number between 1 and 10 for the user to guess
answer = random.randint(1,10)
guess = 0
num_of_guesses = 0
while(guess != answer):
    guess = int(input("Your guess? "))
    num_of_guesses += 1

print("You got it! That took ",num_of_guesses,"guesses")








