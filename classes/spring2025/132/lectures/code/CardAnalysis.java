
public class CardAnalysis {

	public static boolean three_of_a_kind(Card c1, Card c2, Card c3) {
		
		if(c1.getRank().equals(c2.getRank()) && c2.getRank().equals(c3.getRank())) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	
	
}
