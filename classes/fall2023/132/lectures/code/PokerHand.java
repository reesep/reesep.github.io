import java.util.Arrays;

public class PokerHand {

	private Card[] hand = new Card[3];
	
	public PokerHand(Card c1, Card c2, Card c3) {
		hand[0] = c1;
		hand[1] = c2;
		hand[2] = c3;
	}
	
	public void printHand() {
		for(Card c: this.hand) {
			System.out.println(c);
		}
	}
	
	public void evaluate() {
		
		if(three_of_a_kind()) {
			System.out.println("Three of a kind detected");
		}
		if(is_flush()) {
			System.out.println("Flush detected");
		}
		if(is_sequence()) {
			System.out.println("Sequence detected");
		}
		if(two_of_a_kind()) {
			System.out.println("Two of a kind detected");
		}
		
	}
	
	private boolean two_of_a_kind() {
		if(hand[0].getRank() == hand[1].getRank()) {
			return true;
		}
		if(hand[1].getRank() == hand[2].getRank()) {
			return true;
		}
		if(hand[0].getRank() == hand[2].getRank()) {
			return true;
		}
		return false;
	}

	// 4 5 6
	// 5 4 6
	// 6 5 4
	public boolean is_sequence() {
		
		int[] arr = new int[3];
		for(int i = 0; i < hand.length; i++) {
			arr[i] = this.hand[i].getRank();
		}
		Arrays.sort(arr);
		
		if(arr[0] + 1 == arr[1] && arr[1] + 1 == arr[2]) {
			return true;
		}
		else {
			return false;
		}
	}

	public boolean is_flush() {
		
		if(hand[0].getSuit() == hand[1].getSuit() && hand[1].getSuit() == hand[2].getSuit()) {
			return true;
		}
		else {
			return false;
		}
	}

	public boolean three_of_a_kind() {
		if(hand[0].getRank() == hand[1].getRank() && hand[1].getRank() == hand[2].getRank()) {
			return true;
		}
		else {
			return false;
		}
	}

	
}
