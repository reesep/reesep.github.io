import java.util.Scanner;

public class Lab2Demo {

	public static void main(String[] args) {
		

		Dictionary dict = new Dictionary();
		
		System.out.println("The first word is " + dict.firstWord());
		System.out.println("The last word is " + dict.lastWord());
		System.out.println("The longest word is " + dict.longestWord());
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a letter: ");
		char letter = input.next().charAt(0);
		
		
		System.out.println("Number of words starting with " + letter +  ": " + dict.countByLetter(letter));
			
		input.close();
		
	}
	

}
