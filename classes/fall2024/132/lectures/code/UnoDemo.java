import java.util.LinkedList;

public class UnoDemo {
	
	public static void main(String[] args ) {
		LinkedList<Card> hand = new LinkedList<>();
		Card one = new Card('R', 'D');
		Card two = new Card('B', 'D');
		Card three = new Card('G', 'D');
		Card four = new Card('R', 'W');
		Card five = new Card('G', '1');
		Card six = new Card('B', '2');
		
		hand.add(one);
		hand.add(two);
		hand.add(three);
		hand.add(four);
		hand.add(five);
		hand.add(six);
		
		//list for hand, card for top of discard, card for top of draw, num for cards left in draw
		UnoPrinter.printGame(hand, five, six, 2);
	}

}
