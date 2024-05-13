import java.util.Arrays;

public class Lab3Demo {

	public static void main(String[] args) {
	
		
		int[] array1 = {97, 43, 80, 80, 63, 20, 67, 8, 20, 80};
		System.out.println(Arrays.toString(array1));
		calculate_statistics(array1);
		System.out.println("---------------------------------------------");
		
		
		int[] array2 = {11, 45, 27, 55, 11};
		System.out.println(Arrays.toString(array2));
		calculate_statistics(array2);
		System.out.println("---------------------------------------------");
		
		int[] array3 = {44, 44, 44, 81, 53, 53, 53, 44};
		System.out.println(Arrays.toString(array3));
		calculate_statistics(array3);
		System.out.println("---------------------------------------------");
		

	}


	private static void calculate_statistics(int[] array) {
		calculate_mean(array);
		calculate_median(array);
		calculate_mode(array);
		
	}

	private static void calculate_mean(int[] array) {
		//TO DO: Write method that will calculate mean of an integer array
	} 
	
	private static void calculate_median(int[] array) {
		//TO DO: Write method that will calculate median of an integer array
	}

	private static void calculate_mode(int[] array) {
		//TO DO: Write method that will calculate mode of an integer array

	}
}