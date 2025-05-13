
public class CardDemo {

	public static void main(String[] args) {
		
		Card c1 = new Card("Three","Hearts");
		Card c2 = new Card("Three","Diamonds");
		Card c3 = new Card("Three","Spades");
		
		
		CardAnalysis.three_of_a_kind(c1, c2, c3);
		
		
	}

	
	
	
}
