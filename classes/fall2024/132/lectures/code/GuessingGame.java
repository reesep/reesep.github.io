import java.util.Random;
import java.util.Scanner;
public class GuessingGame {

	public static void main(String[] args) {
		
		//generate random number 1-10 
		Random rand = new Random();
		int random_number = rand.nextInt(1,10);
		//System.out.println(random_number);
		
		//prompt the user for a guess
		Scanner scan = new Scanner(System.in);
		System.out.println("Your guess?");
		int user_guess = scan.nextInt();
		
		int counter = 1;
		while(user_guess != random_number) {
			
			if(user_guess > random_number) {
				System.out.println("Lower!");
			}
			else if(user_guess < random_number) {
				System.out.println("Higher!");
			}
			user_guess = scan.nextInt();
			counter++;
			
		}
		System.out.println("You got it!");
		System.out.println("That took " + counter + " guesses.");
		
		
		scan.close();
		
		
		

	}

}
