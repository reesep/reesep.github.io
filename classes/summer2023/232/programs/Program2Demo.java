
import java.util.Scanner;

public class Program2Demo {

	public static void main(String[] args) {

		DocumentChecker doc = new DocumentChecker("input.txt");
		
		System.out.println("Document Spell Check Program");
		System.out.println("----------------------------");
		
		Scanner in = new Scanner(System.in);
		int choice = 0;
		while(choice != 4) {
			System.out.println("1: Spell Check your document (input.txt)");
			System.out.println("2: Print word frequency alphabetically");
			System.out.println("3: Print word frequency from greatest to least");
			System.out.println("4: Exit program");
			System.out.println("Your choice?");
			
			choice = in.nextInt();
			
			if(choice == 1) {
				doc.spellcheck();
			}
			else if(choice == 2) {
				doc.wordCountAlphabetically();
			}
			else if(choice == 3) {
				doc.wordCountByFrequency();
			}
			else if(choice == 4){
				break;
			}
			else {
				System.out.println("Invalid input");
			}
		}
		
		
		
		
	}

}
