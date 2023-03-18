
public class PokerHandDemo {

	public static void evaluate(PokerHand ph) {
		
		if(ph.three_of_a_kind()) {
			System.out.println("Three of a kind detected!!");
		}
		if(ph.flush()) {
			System.out.println("Flush detected!!");
		}
		if(ph.sequence()) {
			System.out.println("Sequence detected!!");
		}
		
	}
	
	public static void main(String[] args) {
		
		
		PokerHand pokerhand1 = new PokerHand(new Card("Hearts",6), new Card("Diamonds",6), new Card("Spades",6));
		
		evaluate(pokerhand1);
		
		System.out.println();
		
		PokerHand pokerhand2 = new PokerHand(new Card("Hearts",4), new Card("Hearts",4), new Card("Hearts",10));
		
		evaluate(pokerhand2);
		
		System.out.println();
		
		PokerHand pokerhand3 = new PokerHand(new Card("Hearts",4), new Card("Hearts",6), new Card("Hearts",5));

		evaluate(pokerhand3);
		
	}

}