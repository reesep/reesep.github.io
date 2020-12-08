
# Write a python program that will simulate a game of rock
# paper scissors against a computer. The user is given 3
# lives and if the user ever loses to the computer, they
# lose a life. The user gets a point every time they beat
# the computer. The game ends when the user loses all of
# their lives

import random

def pick_option():

    rand = random.randint(1,3)

    if(rand == 1):
        return "paper"
    elif(rand == 2):
        return "scissors"
    elif(rand == 3):
        return "rock"

def determine_winner(user,computer):

    if(user=="paper" and computer == "rock"):
        return "win"
    elif(user=="rock" and computer == "scissors"):
        return "win"
    elif(user=="scissors" and computer == "paper"):
        return "win"
    elif(user=="paper" and computer == "scissors"):
        return "loss"
    elif(user=="rock" and computer == "paper"):
        return "loss"
    elif(user=="scissors" and computer == "rock"):
        return "loss"
    else:
        return "tie"
    
    


def main():

    num_of_lives = 3
    score = 0

    while(num_of_lives != 0):

        user_choice = input("Rock, paper, or scissors?" )
        user_choice = user_choice.lower()

        computer_choice = pick_option()

        print("You selected",user_choice)
        print("Computer selected",computer_choice)

        outcome = determine_winner(user_choice, computer_choice)

        if(outcome == "win"):
            score += 1
            print("You win! Your score is",score)
            
        elif(outcome == "loss"):
            num_of_lives -= 1
            print("Computer wins! Number of lives remaining:",num_of_lives)
        else:
            print("It's a tie!")

    print("Game over! Your score was",score)
        

main()



