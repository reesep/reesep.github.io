
import java.util.Scanner;
public class DiceSimulatorDemo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter # of times to roll dice");
		int num_of_rolls = scan.nextInt();
		System.out.println("Enter # of dice sides");
		int dice_sides = scan.nextInt();
		
		DiceSimulator dc = new DiceSimulator(num_of_rolls, dice_sides);
		dc.simulate();
		dc.print();
		scan.close();
	}

}
