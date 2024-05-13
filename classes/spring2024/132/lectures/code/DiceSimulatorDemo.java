import java.util.Scanner;

public class DiceSimulatorDemo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter # of time to roll dice: ");
		int num_of_rolls = input.nextInt();
		
		System.out.println("Enter # of sides of dice: ");
		int num_of_sides = input.nextInt();
		
		DiceSimulator dc = new DiceSimulator(num_of_rolls, num_of_sides);
		
		dc.simulate();
		dc.printFrequency();
		input.close();
	}

}
