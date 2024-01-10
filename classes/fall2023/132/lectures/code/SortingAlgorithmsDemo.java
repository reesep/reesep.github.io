import java.util.Arrays;
import java.util.Random;

public class SortingAlgorithmsDemo {

	
	
	
	public static void main(String[] args) {
		
		SortingAlgorithms sort = new SortingAlgorithms();
		int[] array = getRandomArray(10);
		System.out.println(Arrays.toString(array));
		
		//sort.bubbleSortRecursion(array, array.length);
		//System.out.println(Arrays.toString(array));
		
		//int[] sorted = sort.bubbleSort(array);
		//System.out.println(Arrays.toString(sorted));

		//int[] sorted = sort.merge_sort(array);
		//System.out.println(Arrays.toString(sorted));
		
		//int[] sorted = sort.quick_sort(array, 0, array.length-1);
		//System.out.println(Arrays.toString(sorted));
		
		//int[] sorted = sort.selectionSort(array);
		//System.out.println(Arrays.toString(sorted));
		
		sort.insertionSort(array);
		System.out.println(Arrays.toString(array));
	}

	private static int[] getRandomArray(int n) {
		int[] array = new int[n];
		Random rand = new Random();
		for(int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(101);
		}
		return array;
	}

}
