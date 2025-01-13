import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RecursionDemo3 {

	public static void main(String[] args) {

		String[] numbers = {"1","2","3","4","5","6"};
		List<String> permutations = new ArrayList<>();
		
		generate_permutations(numbers, "", permutations);
		System.out.println("Generated permutations");
		for(String perm: permutations) {
			System.out.println(perm);
		}
		
		Random random = new Random();
		String correctAnswer = permutations.get(random.nextInt(permutations.size()));
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a guess");
		String userGuess = scanner.nextLine();
		
		System.out.println("my guess: " + userGuess);
		System.out.println("correct answer: " +  correctAnswer);
		
		
		boolean isCorrect = userGuess.equals(correctAnswer);
		
		//ternary operator syntax
		//condition ? ifTrue : ifFalse
		System.out.println("Is our guess correct: " + (isCorrect ? "Yes" : "No"));

	}
	
	public static void generate_permutations(String[] numbers, String perm, List<String> list) {
		//base case
		if (perm.length() == numbers.length) {
			list.add(perm);
		}
		//recursive case
		else {
			for(int i = 0; i < numbers.length; i++) {
				if(perm.contains(numbers[i]) == false) {
					generate_permutations(numbers, perm + numbers[i], list);
				}
			}
		}
	}

}
