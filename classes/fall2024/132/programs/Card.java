
public class Card {
	private char color;
	private char value;
	
	public Card(char color, char value) {
		this.color = color;
		this.value = value;
	}
	
	public char getColor() {
		return color;
	}
	
	public char getValue() {
		return value;
	}
	
	@Override
	public String toString() {
		String textColor = null;
		switch(color) {
			case 'R':
				textColor = UnoPrinter.RED_TEXT;
				break;
			case 'B':
				textColor = UnoPrinter.CYAN_TEXT;
				break;
			case 'G':
				textColor = UnoPrinter.GREEN_TEXT;
		}
				
		
		return textColor + color + " " + value + UnoPrinter.RESET_TEXT;
	}
}
