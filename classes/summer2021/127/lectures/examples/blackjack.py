
import random

class Card():

    def __init__(self,rank,suit):
        self.rank = rank
        self.suit = suit
        #number represetation of rank
        self.value = self.assign_value(self.rank)

    def getValue(self):
        return self.value


    def assign_value(self,word):

        word_to_rank = {}
        word_to_rank["two"] = 2
        word_to_rank["three"] = 3
        word_to_rank["four"] = 4
        word_to_rank["five"] = 5
        word_to_rank["six"] = 6
        word_to_rank["seven"] = 7
        word_to_rank["eight"] = 8
        word_to_rank["nine"] = 9
        word_to_rank["ten"] = 10
        word_to_rank["jack"] = 10
        word_to_rank["queen"] = 10
        word_to_rank["king"] = 10
        word_to_rank["ace"] = 11

        return word_to_rank[word]


    def __str__(self):
        return self.rank + " of " + self.suit + " Value: " + str(self.value)


def process_hand(hand_list):

    sum_of_hand = 0
    for each_card in hand_list:
        print(each_card)
        sum_of_hand += each_card.getValue()

    print("Hand total:",sum_of_hand)

    if(sum_of_hand > 21):
        print("You busted! Try another hand")

    elif(sum_of_hand <= 21):


        dealer_score = random.randint(10,21)
        print("Dealer Score:",dealer_score)

        if sum_of_hand > dealer_score:
            print("You win!")
        elif sum_of_hand < dealer_score:
            print("You lose!")
        else:
            print("It's a tie!")

    print("")

    

def main():

    ace = Card("ace","spades")
    king = Card("king","hearts")
    queen = Card("queen","diamonds")
    jack = Card("jack", "clubs")
    ten = Card("ten", "spades")
    nine = Card("nine", "hearts")
    eight = Card("eight","diamonds")
    seven = Card("seven", "clubs")
    six = Card("six", "spades")
    five = Card("five", "hearts")
    four = Card("four", "diamonds")
    three = Card("three", "clubs")
    two = Card("two", "spades")


    process_hand([ace])
    process_hand([six,seven,two])
    process_hand([two,three,four,five,six,eight])




main()
