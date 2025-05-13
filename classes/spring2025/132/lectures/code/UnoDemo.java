import java.util.LinkedList;

public class UnoDemo {

	public static void main(String[] args) {
		
		//Stack discardpile = new Stack();
		//Stack drawpile = new Stack();
		
		Card c1 = new Card('B','1');
		Card c2 = new Card('B','2');
		Card c3 = new Card('B','3');
		Card c4 = new Card('B','4');
		Card c5 = new Card('B','5');
		Card c6 = new Card('B','6');
		Card c7 = new Card('R','2');

		LinkedList<Card> hand = new LinkedList<Card>();
		hand.add(c1);
		hand.add(c2);
		hand.add(c3);
		hand.add(c4);
		hand.add(c5);
		
		//Call UnoPrinter class and see nice output
		UnoPrinter.printGame(hand, c6, c7, 1);
	}
}
