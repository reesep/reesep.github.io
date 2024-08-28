import java.util.Scanner;
public class FirstProgram {

	public static void main(String[] args) {
		//We use Scanner to get user input
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter temp in F: ");
		
		//Get user input as a double (decimal)
		double input = scan.nextDouble();
		
		double answer;
		answer = (input - 32) * (5.0 / 9.0);
		System.out.println(answer);
		
		
	}

}
