import java.util.Random;

public class DiceSimulator {

	private int num_of_rolls;
	private int num_of_sides;
	
	private String[] frequency;
	
	public DiceSimulator(int r, int s) {
		this.num_of_rolls = r;
		this.num_of_sides = s;
		this.frequency = new String[num_of_sides+1];
		for(int i = 0; i < this.frequency.length; i++) {
			this.frequency[i] = "";
		}
	}
	
	public void simulate() {
		
		for(int i = 0; i < this.num_of_rolls; i++) {
			Random rand = new Random();
			//generate random number between 1 and (num_of_sides)
			int random_num = rand.nextInt(num_of_sides) + 1;
			this.frequency[random_num] += "*";
		}
	}
	
	public void print() {
		for(int i = 1; i < this.frequency.length; i++) {
			System.out.println(i + ": " + this.frequency[i]);
		}
	}
}
