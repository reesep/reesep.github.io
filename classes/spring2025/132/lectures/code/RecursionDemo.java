import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RecursionDemo {

	public static void main(String[] args) {
		
		String[] numbers = {"1","2","3","4","5","6"};
		List<String> permutations = new ArrayList<>();
		
		generate_permutations(numbers, "", permutations);
		//System.out.println(permutations);
		
		Random rand = new Random();
		String winning_number = permutations.get(rand.nextInt(permutations.size()));
		//System.out.println(winning_number);
		
		System.out.println("Enter your lottery number to see if you are a lucky winner...");
		Scanner scan = new Scanner(System.in);
		String user_number = scan.nextLine();
		
		boolean isCorrect = user_number.equals(winning_number);
		
		System.out.println("Are you winner?" + (isCorrect ? "Yes you win" : "No you lose"));
		
		
		/*
		int answer = fib(10);
		System.out.println(answer);
		
		String input = "xoxoxxxasfsakfjhasflasjflksajxxxx";
		answer = countX(input);
		System.out.println(answer);
		
		LinkedList<String> names = new LinkedList<>();
		names.add("First");
		names.add("Second");
		names.add("Third");
		names.add("Fourth");
		printLLrecursive(names);
		*/
	}

	public static void generate_permutations(String[] numbers, String perm, List<String> list) {

		//base case
		if(perm.length() == numbers.length) {
			list.add(perm);
		}
		//recursive case
		for(int i = 0; i < numbers.length; i++) {
			if(perm.contains(numbers[i]) == false) {
				generate_permutations(numbers, perm + numbers[i] , list);
			}
		}
		
	}
	
	public static void printLLrecursive(LinkedList<String> names) {
		
		//base case
		if(names.size() == 1) {
			System.out.println(names.getFirst());
		}
		else {
			//recursive
			String s = names.removeFirst();
			printLLrecursive(names);
			System.out.println(s);
			
		}
		
	}

	public static int fib(int n) {
		//base case
		if(n == 1 || n == 2) {
			return 1;
		}
		else {
			//recursive case
			return fib(n-1) + fib(n-2);
		}
	}
	
	public static int countX(String input) {
		
		if(input.length() == 0) {
			return 0;
		}
		
		if(input.charAt(0) == 'x') {
			return 1 + countX(input.substring(1));
		}
		else {
			return countX(input.substring(1));
		}
		
		
	}
	
	
}
