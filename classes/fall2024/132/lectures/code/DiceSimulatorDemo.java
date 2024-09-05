import java.util.Scanner;

public class DiceSimulatorDemo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter # of times to roll dice");
		int num_of_rolls = input.nextInt();
		System.out.println("Enter # of sides");
		int num_of_sides = input.nextInt();
		
		DiceSimulator ds = new DiceSimulator(num_of_rolls, num_of_sides);
		ds.simulate();
		ds.printFrequency();
		
	}

}
