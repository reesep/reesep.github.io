import java.util.Scanner;

public class TempConverter {

	public static void main(String[] args) {
		
		// get the temperature from user in F
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a temp in F:");
		double f = input.nextDouble();
		
		// convert to C
		double c = (f - 32) * (5.0 / 9.0);
		
		//print out answer
		System.out.println("The answer is: " + c);

		input.close();
	}

}
