import java.util.Arrays;
import java.util.Random;

public class SortingAlgorithmsDemo {

	public static void main(String[] args) {
		
		
		int[] array = getRandomArray(1000000);
		int n = array.length;
		
		System.out.println("Unsorted:");
		System.out.println(Arrays.toString(array));
		
		SortingAlgorithms sort = new SortingAlgorithms();
		//sort.bubbleSort(array);
		//sort.bubbleSortRecursive(array, n);
		
		//array = sort.merge_sort(array);
		
		array = sort.quick_sort(array, 0, array.length -1);
		
		
		System.out.println("Sorted:");
		System.out.println(Arrays.toString(array));
		
	}

	public static int[] getRandomArray(int n) {

		int[] array = new int[n];
		Random rand = new Random();
		for(int i =0; i < array.length; i++) {
			array[i] = rand.nextInt(101);
		}
		return array;
		
	}

}
