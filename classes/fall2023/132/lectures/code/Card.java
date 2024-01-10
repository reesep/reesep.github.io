
public class Card {

	private int rank;
	private String suit;
	
	public Card(int r, String s) {
		this.rank = r;
		this.suit = s;
	}
	
	public int getRank() {
		return this.rank;
	}
	
	public String toString() {
		return this.rank + " of " +this.suit;
	}
	
	public String getSuit() {
		return this.suit;
	}
	
}
