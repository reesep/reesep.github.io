
import java.util.Arrays;
import java.util.Random;

public class Lab11Demo {

	public static int[] getRandomArray(int n) {
		int[] array = new int[n];
		Random random = new Random();
		for(int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(101);
		}
		return array;
	}
	
	public static int[] selection_sort(int[] array) {
		
		//TO DO: Write algorithm for selection sort here
		
		
		return array;
	}
	
	
	public static void main(String[] args) {
		
		// Sort an array of size 15
		int[] array1 = getRandomArray(15);
		System.out.println("Input: " + Arrays.toString(array1));
		long start_time = System.nanoTime();
		int[] sorted_array = selection_sort(array1);	
		long end_time = System.nanoTime();
		double elapsed_time = (end_time - start_time) / 1000000.0;
		System.out.println("Time taken: " + elapsed_time + " ms");
		System.out.println("Output: " + Arrays.toString(sorted_array));
		
		System.out.println("");
		
		// Sort an array of size 1000
		int[] array2 = getRandomArray(1000);
		System.out.println("Input: " + Arrays.toString(array2));
		start_time = System.nanoTime();
		sorted_array = selection_sort(array2);
		end_time = System.nanoTime();
		elapsed_time = (end_time - start_time) / 1000000.0;
		System.out.println("Time taken: " + elapsed_time + " ms");
		System.out.println("Output: " + Arrays.toString(sorted_array));
	}

}
