
import java.util.Scanner;

public class ExceptionsDemo {

	
	public static void printOptions() {
		System.out.println("Press 1 for Hi");
		System.out.println("Press 2 for Hey");
		System.out.println("Press 3 for Goodbye");
	}
	
	public static void main(String[] args) {
			
		int userChoice = 0;
		System.out.println("Enter your choice: ");
		
		while(userChoice != 3) {
			
				try {
					Scanner scanner = new Scanner(System.in);
					userChoice = scanner.nextInt();
			
					if(userChoice == 1) {
						System.out.println("Hi");
					}
					else if(userChoice == 2) {
						System.out.println("Hey");
					}
					else if(userChoice == 3) {
						System.out.println("Goodbye");
					}
					else {
						System.out.println("Enter a valid integer");
					}
				}
				catch(Exception e) {
					System.out.println(e);
					System.out.println("Invalid input detected: Try again");
				}
				printOptions();
			}
			
			
			
			
		}
		
		
		
		
		

	}


