package jan23;

import java.util.Scanner;

public class TempConverter {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter temp in F: ");
		String input = scanner.next();
	
		double farenheit = Double.parseDouble(input);
		
		double answer;
		
		answer = (farenheit - 32) * (5.0/9.0);
		
		System.out.println(answer);
		
		
	}
	
}
