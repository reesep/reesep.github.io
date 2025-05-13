import java.util.Random;

public class Lab12Demo {

	public static void main(String[] args) {
		
		Random rand = new Random();
		int array_sizes[] = {50, 500, 5000, 50000};

		for(int size: array_sizes) {
			System.out.println("Array Size: " + size);
			//TO DO: Write some code below in this for loop and call your searching algorithms





		}
		
		
	}
	
	//use this method to fill contents of array
	private static int[] getRandomArray(int size) {
		
		int[] array = new int[size];
		Random rand = new Random();
		for(int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(0,10000);
		}
		return array;
	}

	public static int linear_search(int[] array, int target) {
		//TO DO: Write code for basic linear search
	}

	public static int binary_search(int[] array, int target) {
		//TO DO: Write code for binary search (don't use recursion)
	}
	
}
