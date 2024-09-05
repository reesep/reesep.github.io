import java.util.Random;

public class DiceSimulator {

	private int num_of_rolls;
	private int num_of_sides;

	// [1] - "****"   4 1s were rolled
	private String[] freq;
	
	public DiceSimulator(int num_of_rolls, int num_of_sides) {
		this.num_of_rolls = num_of_rolls;
		this.num_of_sides = num_of_sides;
		this.freq = new String[num_of_sides + 1];
		for(int i = 0; i < this.freq.length; i++) {
			this.freq[i] = "";
		}
	}
	
	public void simulate() {
		
		for(int i = 0; i < num_of_rolls; i++) {
			
			Random rand = new Random();
			int random_int = rand.nextInt(1,num_of_sides+1);
			
			this.freq[random_int] += "*";
			
		}
		
	}
	
	public void printFrequency() {
		
		for(int i = 1; i < this.freq.length; i++) {
			System.out.println(i + ": " + this.freq[i]);
		}
		
	}
	
}
