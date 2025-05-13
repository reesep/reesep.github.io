import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
	
	public void play() {
		
		//generate a random number
		Random r = new Random();
		int answer = r.nextInt(0, 11);
		//System.out.println(answer);
		Scanner scan = new Scanner(System.in);

		//ask the user for guess
		int num_of_guesses = 0;
		int guess = -1;
		while(guess != answer) {
			
			System.out.println("Your guess? ");
			guess = scan.nextInt();
			num_of_guesses++;
			if(guess > answer) {
				System.out.println("lower");
			}
			else if(guess < answer) {
				System.out.println("higher");
			}
		}
		System.out.println("You got the correct answer!");
		System.out.println("That took: " + num_of_guesses + " guesses.");
		
		
		
	}
	
	
}
