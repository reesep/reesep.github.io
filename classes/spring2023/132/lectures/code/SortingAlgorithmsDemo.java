import java.util.Arrays;

public class SortingAlgorithmsDemo {

	public static void main(String[] args) {
		
		SortingAlgorithm sort = new SortingAlgorithm();
		
		int[] array = sort.getRandomArray(800000);
		//System.out.println(Arrays.toString(array));
		long start_time = System.nanoTime();
		int[] sorted_array = sort.quick_sort(array,0,array.length-1);
		long end_time = System.nanoTime();
		double elapsed_time = (end_time - start_time) / 1000000.0;
		System.out.println(elapsed_time);
		System.out.println("Done");
		//System.out.println(Arrays.toString(sorted_array));

	}

}
