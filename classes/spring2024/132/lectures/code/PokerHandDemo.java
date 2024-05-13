
public class PokerHandDemo {

	public static void main(String[] args) {
		
		
		PokerHand ph = new PokerHand(new Card("Hearts",9), new Card("Hearts",9), new Card("Hearts",8));

		ph.checkHand();		
	}

}
