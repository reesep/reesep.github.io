import java.util.Arrays;

public class PokerHand {

	private Card[] hand = new Card[3];
	
	public PokerHand(Card card1, Card card2, Card card3) {
		
		hand[0] = card1;
		hand[1] = card2;
		hand[2] = card3;
		
	}
	
	public void checkHand() {
		
		System.out.println(Arrays.toString(hand));
		for(Card c: hand) {
			System.out.println(c.getRank() + " " + c.getSuit());
		}
		
		if(three_of_a_kind()) {
			System.out.println("Three of a kind detected! ");
		}
		if(flush()){
			System.out.println("Flush detected");
		}
		if(sequence()) {
			//4, 6, 5
			//7, 6, 5
			// 7, 8, 9
			System.out.println("Sequence detected");
		}
	}

	private boolean sequence() {
		int[] numbers = new int[3];
		for(int i = 0; i < 3; i++) {
			numbers[i] = hand[i].getRank();
		}
		
		Arrays.sort(numbers);
		
		System.out.println(Arrays.toString(numbers));
		
		if(numbers[0] + 2 == numbers[2] && numbers[1] + 1 == numbers[2]) {
			return true;
		}
		
		return false;
	}

	private boolean three_of_a_kind() {

		if(hand[0].getRank() == hand[1].getRank() && hand[1].getRank() == hand[2].getRank()) {
			
			return true;
			
		}
		
		return false;

	}
	
	private boolean flush() {
		if(hand[0].getSuit().equals(hand[1].getSuit()) && hand[1].getSuit().equals(hand[2].getSuit())) {
			
			return true;
			
		}
		
		return false;
	}
	
	
	
}
