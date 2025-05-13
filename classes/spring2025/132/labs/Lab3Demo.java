import java.util.Scanner;

public class Lab3Demo {

	public static void main(String[] args) {
		

		Dictionary dict = new Dictionary();
		
		
		System.out.println("The last word is " + dict.lastWord());
		System.out.println("The longest word is " + dict.longestWord());
		System.out.println("The median word length is " + dict.medianWordLength());
		System.out.println("Number of words that contain all vowels at least once: " + dict.wordsWithAllVowels());
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a letter: ");
		char letter = input.next().charAt(0);
		
		
		System.out.println("Number of words starting with " + letter +  ": " + dict.countByLetter(letter));
			
		input.close();
		
	}
	

}
