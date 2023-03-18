
import java.util.Scanner;
import java.util.Random;

public class GuessingGame {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int random_number = rand.nextInt(11);
		
		System.out.println("Enter your guess: ");
		Scanner scanner = new Scanner(System.in);
		
		int guess = scanner.nextInt();
		
		int guesses = 1;
		
		while(guess != random_number) {
			
			if(guess > random_number) {
				System.out.println("Lower");
			}
			else if(guess < random_number) {
				System.out.println("Higher");
			}
			
			System.out.println("Enter a new guess: ");
			guess = scanner.nextInt();
			guesses++;
			
		}
		System.out.println("You got it! The number was: " + random_number);
		System.out.println("That took " + guesses + " guesses");
	}

}
