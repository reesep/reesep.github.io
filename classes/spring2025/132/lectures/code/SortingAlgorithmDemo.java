import java.util.Arrays;
import java.util.Random;

public class SortingAlgorithmDemo {

	public static void main(String[] args) {
		
		int[] array = generateRandomArray(600000);
		System.out.println(Arrays.toString(array));
		
		SortingAlgorithm sort = new SortingAlgorithm();
		//sort.bubbleSort(array);
		long start_time = System.nanoTime(); 
		//sort.merge_sort(array);
		sort.quick_sort(array, 0, array.length-1);
		long end_time = System.nanoTime();
		double elapsed_time = (end_time - start_time) / 1000000.0;
		System.out.println(elapsed_time);
		//sort.bubbleSortRecursive(array, array.length);
		System.out.println(Arrays.toString(array));

	}
	
	public static int[] generateRandomArray(int n) {
		Random rand = new Random();
		int[] random_array = new int[n];
		for(int i = 0; i < random_array.length; i++) {
			random_array[i] = rand.nextInt(1, 101);
		}
			
		return random_array;	
	}

}
