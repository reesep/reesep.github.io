import java.util.Arrays;
import java.util.Random;

public class SortingAlgorithmsDemo {

	public static void main(String[] args) {

		int[] array = getRandomArray(1000000);
		System.out.println(Arrays.toString(array));

		SortingAlgorithms sort = new SortingAlgorithms();

		//sort.bubbleSortRecursion(array, array.length);
		//System.out.println(Arrays.toString(array));

		//array = sort.bubbleSort(array);

		//array = sort.merge_sort(array);

		array = sort.quick_sort(array, 0, array.length - 1);
		
		System.out.println(Arrays.toString(array));

	}

	public static int[] getRandomArray(int n) {

		int[] array = new int[n];
		Random rand = new Random();
		for(int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(101); //0-100
		}

		return array;
	}

	

}
