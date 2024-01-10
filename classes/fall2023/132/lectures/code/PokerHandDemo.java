
public class PokerHandDemo {

	public static void main(String[] args) {
		
		PokerHand p1 = new PokerHand(new Card(2,"Hearts"), new Card(3,"Spades"), new Card(7,"Hearts"));
		p1.printHand();
		p1.evaluate();
	}

}
