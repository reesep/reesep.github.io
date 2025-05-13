import java.util.Scanner;

public class DiceSimulatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter # of times to roll dice");
		int num_of_rolls = scan.nextInt();
		
		System.out.println("Enter # of sides of dice");
		int sides = scan.nextInt();
		
		DiceSimulator ds = new DiceSimulator(num_of_rolls, sides);
		ds.simulate();
		ds.printFrequency();
		
	}


}
