import java.util.Random;

public class DiceSimulator {

	private int num_of_rolls;
	private int num_of_sides;
	private String[] frequency;
	
	public DiceSimulator(int r, int s) {
		this.num_of_rolls = r;
		this.num_of_sides = s;
		this.frequency = new String[num_of_sides + 1];
		
		for(int i = 0; i < frequency.length; i++) {
			this.frequency[i] = "";
		}
		
		
	}
	
	public void simulate() {
		
		Random rand = new Random();
		for(int i = 0; i < num_of_rolls; i++) {
			
			int rand_num = rand.nextInt(1, num_of_sides + 1);
			
			this.frequency[rand_num] += "*";
			
		}
	
	}

	public void printFrequency() {
		
		for(int i = 1; i < frequency.length; i++) {
			
			System.out.println(i + ": " + this.frequency[i]);
		}
		
		
	}
	
	
}
