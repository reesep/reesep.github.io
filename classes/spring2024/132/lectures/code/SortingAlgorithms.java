
public class SortingAlgorithms {


	public int[] bubbleSort(int[] array) {

		int n = array.length;
		for(int i = 0; i < n - 1; i++) {
			for(int j = 0; j < n - i - 1; j++) {
				if(array[j] > array[j+1]) {
					//swap
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		return array;

	}

	public void bubbleSortRecursion(int[] array, int n) {

		//base case
		if(n == 1) {
			return;
		}

		//recursive case
		//one loop of bubble sort
		for(int i = 0; i < n - 1; i ++) {
			if(array[i] > array[i+1]) {
				//swap
				int temp = array[i];
				array[i] = array[i+1];
				array[i+1] = temp;
			}
		}
		bubbleSortRecursion(array, n-1);

	}

	public int[] merge_sort(int[] inputArray) {

		int inputLength = inputArray.length;
		if(inputLength < 2) { //base case
			return inputArray;
		}
		//Recursive Case
		//Create two sub arrays, left half and right half, and fill them
		int midIndex = inputLength / 2;
		int[] leftHalf = new int[midIndex];
		int[] rightHalf = new int[inputLength - midIndex];

		for(int i = 0; i < midIndex; i ++) {
			leftHalf[i] = inputArray[i];
		}
		for(int i = midIndex; i < inputLength; i++) {
			rightHalf[i - midIndex] = inputArray[i];
		}

		//recursively sort the left half and right half
		leftHalf = merge_sort(leftHalf);
		rightHalf = merge_sort(rightHalf);
		//merge the two sorted arrays
		inputArray = merge(inputArray, leftHalf, rightHalf);
		//we now have a sorted array
		return inputArray;
	}

	public static int[] merge(int[] inputArray, int[] leftHalf, int[] rightHalf) {

		int leftSize = leftHalf.length;
		int rightSize = rightHalf.length;

		int i = 0, j = 0, k = 0;
		//compare the smallest values of the left half and right half, insert into array
		while( i < leftSize && j < rightSize) {

			if(leftHalf[i] <= rightHalf[j]) {
				inputArray[k] = leftHalf[i];
				i++;
			}
			else {
				inputArray[k] = rightHalf[j];
				j++;
			}
			k++;
		}
		//clean up any remaining items
		//only one of these while loops will run
		while(i < leftSize) {
			inputArray[k] = leftHalf[i];
			i++;
			k++;
		}

		while(j < rightSize) {
			inputArray[k] = rightHalf[j];
			j++;
			k++;
		}
		return inputArray;

	}
	
	public int[] quick_sort(int[] array, int start, int end) {
		
		if(end <= start) { //base case: array section is 1 or nothing
			return array;
		}
		int pivot = partition(array, start, end);
		quick_sort(array, start, pivot - 1);
		quick_sort(array, pivot+1, end);
		return array;
		
	}
	
	public int partition(int[] array, int start, int end) {
		
		int pivot = array[end];
		int i = start - 1;
		for(int j = start; j <= end - 1; j++) {
			
			if(array[j] < pivot) {
				
				i++;
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}

		}
		i++;
		int temp = array[i];
		array[i] = array[end];
		array[end] = temp;
		return i;
		
		
	}


}
