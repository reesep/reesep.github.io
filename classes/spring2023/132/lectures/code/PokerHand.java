import java.util.Arrays;

public class PokerHand {

	private Card[] hand = new Card[3];
	
	public PokerHand(Card card1, Card card2, Card card3) {
		this.hand[0] = card1;
		this.hand[1] = card2;
		this.hand[2] = card3;
	}
	
	
	
	public boolean three_of_a_kind() {
		
		if(this.hand[0].getRank() == this.hand[1].getRank() && this.hand[1].getRank() == this.hand[2].getRank()) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public boolean flush() {
		
		if(this.hand[0].getSuit() == this.hand[1].getSuit() && this.hand[1].getSuit() == this.hand[2].getSuit()) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	// 3 5 4
	// 8 7 6
	// 1 2 3

	public boolean sequence() {
		
		int[] arr = new int[3];
		for(int i = 0; i < 3; i++) {
			arr[i] = this.hand[i].getRank();
		}
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		if(arr[0] + 1 == arr[1] && arr[1] + 1 == arr[2]) {
			return true;
		}
		else {
			return false;
		}
		
	}
	

}
