import java.util.Arrays;
public class Lab12Demo {

	public static void main(String[] args) {
		System.out.println("Binary Search");
		int[] array = {2, 6, 12, 14, 17, 19, 20, 23, 27, 29, 32, 37, 40, 42, 45};
		int num, answer;
		System.out.println(Arrays.toString(array));
		System.out.println("----------------------------------------------------------------");
		
		num = 12;
		answer = binary_search(array,num);
		System.out.println(num + " is located at index: " + answer);
		
		num = 45;
		answer = binary_search(array,num);
		System.out.println(num + " is located at index: " + answer);
		
		num = 29;
		answer = binary_search(array,num);
		System.out.println(num + " is located at index: " + answer);
		
		num = 55;
		answer = binary_search(array,num);
		System.out.println(num + " is located at index: " + answer);
	}

	private static int binary_search(int[] array, int n) {
		//TO DO: Write the algorithm for Binary Search here
		
	}

}