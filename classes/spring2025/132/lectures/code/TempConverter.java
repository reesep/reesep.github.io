import java.util.Scanner;

public class TempConverter {

	public static void main(String[] args) {
		
		// Get Input From user
		System.out.println("Enter temp in F: ");
		Scanner input = new Scanner(System.in);
		
		double farenheit = input.nextDouble();
		
		// Convert from F to C
		
		double answer = (farenheit - 32) * (5.0/9.0);
		
		//Print out answer
		
		System.out.println("Temp in C is: "+ answer);
		
		input.close();
	}

}
