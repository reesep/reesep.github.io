import java.util.Arrays;
public class Program5Demo {

	public static void main(String[] args) {
		
		System.out.println("Part I: Palindromes");
		
		String test;
		boolean answer;
		
		test = "racecar";
		answer = is_palindrome(test);
		System.out.println("Word: " + test + ", Is palindrome: " + answer);

		test = "aa";
		answer = is_palindrome(test);
		System.out.println("Word: " + test + ", Is palindrome: " + answer);
		

		test = "computer";
		answer = is_palindrome(test);
		System.out.println("Word: " + test + ", Is palindrome: " + answer);
		
		System.out.println("-----------------------------------------------------");
		
		System.out.println("Part II: Binary Search");
		int[] array = {2, 6, 12, 14, 17, 19, 20, 23, 27, 29, 32, 37, 40, 42, 45};
		int num, answer2;
		
		int low = 0;
		int high = array.length - 1;
		
		System.out.println(Arrays.toString(array));
		
		num = 12;
		answer2 = binary_search(array,num,low,high);
		System.out.println(num + " is located at index: " + answer2);
		
		num = 45;
		answer2 = binary_search(array,num,low,high);
		System.out.println(num + " is located at index: " + answer2);
		
		num = 29;
		answer2 = binary_search(array,num,low,high);
		System.out.println(num + " is located at index: " + answer2);
		
		num = 55;
		answer2 = binary_search(array,num,low,high);
		System.out.println(num + " is located at index: " + answer2);
		
		System.out.println("-----------------------------------------------------");
		System.out.println("Part III and IV: Finding minimum number of coins");
		int k; //target value
		int n; // answer for part III
		int[] D = {1, 5, 10, 18, 25};
		
		k = 37; //find minimum number of coins from D to make value K 
		n = min_coins(D, k);
		System.out.println("Minimum coins needed to create " + k + ": " + n);
		System.out.println("Coins used:");
		find_coins(D,k,n);
		
		k = 4; //find minimum number of coins from D to make value K 
		n = min_coins(D, k);
		System.out.println("Minimum coins needed to create " + k + ": " + n);
		System.out.println("Coins used:");
		find_coins(D,k,n);
		
		k = 81; //find minimum number of coins from D to make value K 
		n = min_coins(D, k);
		System.out.println("Minimum coins needed to create " + k + ": " + n);
		System.out.println("Coins used:");
		find_coins(D,k,n);
				
	}

	private static boolean is_palindrome(String test) {
		
		//TO DO: Part I: Fill in method using recursion, or have it call another method that uses recursion
		
		return false;
	}

	private static int binary_search(int[] array, int num, int low, int high) {
		
		//TO DO: Part I: Fill in method using recursion, or have it call another method that uses recursion
		
		return -1;
	}


	private static int min_coins(int[] d, int k) {
		
		//TO DO: Part I: Fill in method using recursion, or have it call another method that uses recursion
		
		return -1;
	}
	
	private static void find_coins(int[] d, int k, int n) {
		
		//TO DO: Part I: Fill in method using recursion, or have it call another method that uses recursion
		
	}



}
