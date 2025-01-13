
public class SortingAlgorithms {

	
	public void bubbleSort(int[] array) {
		// O(n^2) where n = length of array
		int n = array.length;
		
		for(int i = 0; i < n - 1; i++) {
			
			for(int j = 0; j < n - i - 1; j++) {
				
				if( array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
				
			}
		}
		
	}
	
	public void bubbleSortRecursive(int[] array, int n) {
		
		//base case
		if(n == 1) {
			return;
		}
		
		//recursive case
		for(int i = 0; i < n - 1; i++) {
			if(array[i] > array[i+1]) {
				int temp = array[i];
				array[i] = array[i+1];
				array[i+1] = temp;
			}
		}
		bubbleSortRecursive(array, n-1);
		
		
	}
	
	public int[] merge_sort(int[] inputArray) {
		
		int inputLength = inputArray.length;
		//if subarray is of length 0 or 1 --> base case, so return
		if (inputLength < 2) {
			return inputArray;
		}
		
		//recursive
		int midIndex = inputLength / 2;
		int[] leftHalf = new int[midIndex];
		int[] rightHalf = new int[inputLength - midIndex];
		
		for(int i = 0; i < midIndex; i++) {
			leftHalf[i] = inputArray[i];
		}
		
		for(int i = midIndex; i < inputLength; i++) {
			rightHalf[i - midIndex] = inputArray[i];
		}
		
		leftHalf = merge_sort(leftHalf);
		rightHalf = merge_sort(rightHalf);
		
		inputArray = merge(inputArray, leftHalf, rightHalf);
		return inputArray;
		
	}
	
	public static int[] merge(int[] inputArray, int[] leftHalf, int[] rightHalf) {
		
		int leftSize = leftHalf.length;
		int rightSize = rightHalf.length;
		
		int i =0, j=0, k=0;
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
		//clean up remaining elements from left subarray or right subarray
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
		
		//base case
		if(end <= start) {
			return array;
		}
		
		//recursive case
		int pivotIndex = partition(array, start, end);
		
		//left section
		quick_sort(array, start, pivotIndex-1);
		
		//right half
		quick_sort(array, pivotIndex+1, end);
		
		return array;
		
		
	}
	
	public int partition(int[] array, int start, int end) {
		
		int pivot = array[end];
		int i = start - 1;
		
		for(int j = start; j <= end-1; j++) {
			
			if(array[j] < pivot) {
				i++;
				int temp = array[i];
				array[i] = array[j];
				array[j] =temp;
			}
			
		}
		i++;
		int temp = array[i];
		array[i] = pivot;
		array[end] = temp;
		//element of pivot is returned
		return i;
	}
	
	
	
}
