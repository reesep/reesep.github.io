import java.util.Arrays;

public class Lab6Demo {

	public static void main(String[] args) {

		int[] array = {23, 7, 45, 12, 89, 34, 56, 78, 90, 11, 67, 3};
		
		System.out.println("Unsorted array");
		System.out.println("---------------------------");
		System.out.println(Arrays.toString(array));
		
		HeapSort sort = new HeapSort(array);
		array = sort.heapSort();
		System.out.println();
	
		System.out.println("Sorted array");
		System.out.println("---------------------------");
		System.out.println(Arrays.toString(array));

	}

}
