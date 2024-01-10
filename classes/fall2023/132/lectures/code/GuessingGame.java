
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

	public void playGame() {
		
		//generate a random number
		Random rand = new Random();
		int random_number = rand.nextInt(11);
		//System.out.println(random_number);
		
		System.out.println("Guess a number between 0 and 10:");
		Scanner scanner = new Scanner(System.in);
		int user_guess = scanner.nextInt();
		
		int guesses = 1;
		
		while(user_guess != random_number) {
			
			if(user_guess > random_number) {
				System.out.println("Lower!");
			}
			else if(user_guess < random_number) {
				System.out.println("Higher!");
			}
			user_guess = scanner.nextInt();
			guesses++;
			
		}
		System.out.println("That took " + guesses + " guesses");
		
		
		
	}
	
	
}
