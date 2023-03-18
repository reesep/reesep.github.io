
import java.util.Scanner;

public class DiceSimulatorDemo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number of rolls: ");
		int num_of_rolls = scanner.nextInt();
		System.out.println("Enter number of sides: ");
		int num_of_sides = scanner.nextInt();
		
		
		DiceSimulator dc = new DiceSimulator(num_of_rolls, num_of_sides);
		
		dc.simulate();
		dc.printResults();
		
		

	}

}
