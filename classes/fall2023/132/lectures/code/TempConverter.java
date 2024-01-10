import java.util.Scanner;

public class TempConverter {

	public static void main(String[] args) {
		
		// Get user input
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a temp in F: ");
		double input = s.nextDouble();
		System.out.println("You entered: " + input);
		
		// Convert F to C
		double answer = (input - 32.0) * 5.0 / 9.0;
		
		
		// Print out answer
		System.out.println("Temperature in C is: " + answer);
		s.close();
	}

}
