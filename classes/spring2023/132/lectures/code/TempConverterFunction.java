package jan23;

import java.util.Scanner;

public class TempConverterFunction {

	public static double convert(double farenheit) {
		double answer;
		answer = (farenheit - 32) * (5.0/9.0);
		return answer;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter temp in F: ");
		String input = scanner.next();
	
		double farenheit = Double.parseDouble(input);
		
		double answer;
		
		answer = convert(farenheit);
		System.out.println("The temp is C is: "+answer);
		
		
	}
	
}
