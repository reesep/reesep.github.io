
import java.util.Random;

public class DiceSimulator {

	private int num_of_rolls;
	private int num_of_sides;
	
	private String[] frequency;
	
	
	public DiceSimulator(int inRolls, int inSides) {
		this.num_of_rolls = inRolls;
		this.num_of_sides = inSides;
		
		this.frequency = new String[num_of_sides + 1];
		
		for(int i = 0; i < this.frequency.length; i++) {
			this.frequency[i] = "";
		}
		
	}
	
	
	public void simulate() {
		int min = 1;
		int max = num_of_sides;
		for(int i = 0; i < this.num_of_rolls; i++) {
			int random_int = (int)Math.floor(Math.random() * (max - min + 1) + min);
			
			this.frequency[random_int] += "*";
			
		}
	}
	
	public void printResults() {
		
		for(int i=1; i < this.frequency.length; i++) {
			System.out.println(i + ": " + this.frequency[i]);
		}
		
	}
	
}
