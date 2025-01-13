import java.util.Arrays;
import java.util.List;

public class UnoPrinter {

    public static final String RESET_TEXT = "\033[0m";
    public static final String RED_TEXT  = "\033[31m";
    public static final String YELLOW_TEXT  = "\033[33m";
    public static final String GREEN_TEXT  = "\033[32m";
    public static final String CYAN_TEXT  = "\033[36m";
    public static final String BLUE_TEXT  = "\033[34m";
    public static final String MAGENTA_TEXT  = "\033[35m";
	
	public static void printGame(List<Card> hand, Card topOfDiscard, Card topOfDraw, int numRemainingDrawCards) {
		int handCharLength = getHandCharLength(hand);
		System.out.println("\n\n\n\n");
		printDiscardAndDraw(handCharLength, topOfDiscard, topOfDraw, numRemainingDrawCards);
		printHand(hand);
		System.out.println();
	}
	
	// yuck
	private static void printDiscardAndDraw(int handCharLength, Card topOfDiscard, Card topOfDraw, int numRemainingDrawCards) {

	    String centeringSpaces = "";
	    for (int i = 0; i < (handCharLength / 2) - 13; i++) {
	        centeringSpaces += " ";
	    }
	    
	    System.out.println(centeringSpaces + " Discard        Draw");
	    
	    String[] lines = new String[7];
	    Arrays.fill(lines, centeringSpaces);
	    
	    // discard pile
	    if (topOfDiscard.getValue() == 'W') {
            lines[0] += RED_TEXT 		+ "┏━━━━━━━┓    " + RESET_TEXT;
            lines[1] += YELLOW_TEXT 	+ "┃       ┃    " + RESET_TEXT;
            lines[2] += GREEN_TEXT 		+ "┃       ┃    " + RESET_TEXT;
            lines[3] += CYAN_TEXT 		+ "┃  " + topOfDiscard + CYAN_TEXT +"  ┃    " + RESET_TEXT;
            lines[4] += BLUE_TEXT 		+ "┃       ┃    " + RESET_TEXT;
            lines[5] += MAGENTA_TEXT 	+ "┃       ┃    " + RESET_TEXT;
            lines[6] += RED_TEXT 		+ "┗━━━━━━━┛    " + RESET_TEXT;
	    }
	    else {
            lines[0] += "┏━━━━━━━┓    ";
            lines[1] += "┃       ┃    ";
            lines[2] += "┃       ┃    ";
            lines[3] += "┃  " + topOfDiscard + "  ┃    ";
            lines[4] += "┃       ┃    ";
            lines[5] += "┃       ┃    ";
            lines[6] += "┗━━━━━━━┛    ";
	    }
	    
	    // draw pile
	    if (numRemainingDrawCards == 0) {
	    	lines[2] += "  Empty";
	    }
	    else if (topOfDraw.getValue() == 'W') {
            lines[0] += RED_TEXT 		+ "┏━━━━━━━┓    " + RESET_TEXT;
            lines[1] += YELLOW_TEXT 	+ "┃       ┃    " + RESET_TEXT;
            lines[2] += GREEN_TEXT 		+ "┃       ┃    " + RESET_TEXT;
            lines[3] += CYAN_TEXT 		+ "┃  " + topOfDraw + CYAN_TEXT +"  ┃    " + RESET_TEXT;
            lines[4] += BLUE_TEXT 		+ "┃       ┃    " + RESET_TEXT;
            lines[5] += MAGENTA_TEXT 	+ "┃       ┃    " + RESET_TEXT;
            lines[6] += RED_TEXT 		+ "┗━━━━━━━┛    " + RESET_TEXT;
	    }
	    else {
            lines[0] += "┏━━━━━━━┓";
            lines[1] += "┃       ┃";
            lines[2] += "┃       ┃";
            lines[3] += "┃  " + topOfDraw + "  ┃    ";
            lines[4] += "┃       ┃";
            lines[5] += "┃       ┃";
            lines[6] += "┗━━━━━━━┛";
	    }
	    
	    for (String line : lines) {
	    	System.out.println(line);
	    }

	    System.out.println(centeringSpaces + "           " + numRemainingDrawCards + " cards left");
	}
	
	private static void printHand(List<Card> hand) {

		String centeringSpaces = "";
		if (hand.size() == 2) centeringSpaces = "  ";
		else if (hand.size() == 1) centeringSpaces = "        ";

		int handCharLength = getHandCharLength(hand);
		String handTitle = "\n\n" + centeringSpaces;
		for (int i = 0; i < (handCharLength / 2) - 2; i++) {
			handTitle += " ";
		}
		handTitle += "Hand";
		System.out.println(handTitle);
		
		String[] lines = new String[8];
		Arrays.fill(lines, centeringSpaces);

		for (int i = 0; i < hand.size(); i++) {
			Card card = hand.get(i);
	        if (card.getValue() == 'W') {
	            lines[0] += RED_TEXT 		+ "┏━━━━━━━┓  " + RESET_TEXT;
	            lines[1] += YELLOW_TEXT 	+ "┃       ┃  " + RESET_TEXT;
	            lines[2] += GREEN_TEXT 		+ "┃       ┃  " + RESET_TEXT;
	            lines[3] += CYAN_TEXT 		+ "┃  " + card + CYAN_TEXT +"  ┃  " + RESET_TEXT;
	            lines[4] += BLUE_TEXT 		+ "┃       ┃  " + RESET_TEXT;
	            lines[5] += MAGENTA_TEXT 	+ "┃       ┃  " + RESET_TEXT;
	            lines[6] += RED_TEXT 		+ "┗━━━━━━━┛  " + RESET_TEXT;
	        } else {
	            lines[0] += "┏━━━━━━━┓  ";
	            lines[1] += "┃       ┃  ";
	            lines[2] += "┃       ┃  ";
	            lines[3] += "┃  " + card + "  ┃  ";
	            lines[4] += "┃       ┃  ";
	            lines[5] += "┃       ┃  ";
	            lines[6] += "┗━━━━━━━┛  ";
	        }

	        if (i < 9) lines[7] += " ";
	        lines[7] += "   " + (i + 1) + "      ";
	    }

	    for (String line : lines) {
	        System.out.println(line);
	    }
	}
	
	private static int getHandCharLength(List<Card> hand) {
		return (9 * hand.size()) + (2 * (hand.size() - 1));
	}
}
