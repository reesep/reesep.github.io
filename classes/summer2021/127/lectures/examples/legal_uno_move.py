
# Consider a simplified game of UNO that has forty different cards.
# Each card has a color ("red", "yellow", "green" or "blue") and
# a value (0, 1, 2, 3, 4, 5, 6, 7, 8 or 9).
#
# Complete the boolean function below so that it returns True if the
# second card can be played on the first card and False otherwise.




def legal_play(card1_number, card1_color,card2_number, card2_color):

    if(card1_color == card2_color) or (card1_number == card2_number):
        return True
    else:
        return False



def main():

    print(legal_play(7,"blue",7,"yellow"))
    print(legal_play(2,"red",7,"red"))
    print(legal_play(7,"blue",7,"blue"))
    print(legal_play(3,"red",9,"green"))

main()
