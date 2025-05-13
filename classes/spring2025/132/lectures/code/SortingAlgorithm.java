
public class SortingAlgorithm {

	public void bubbleSort(int[] array) {
		//O(n^2)
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
		
		
	}
	
	public void bubbleSortRecursive(int[] array, int n) {
		//O(n^2)
		//base case
		if(n==1) {
			return;
		}
		//recursive case
		for(int i = 0; i < n - 1; i++) {
			if(array[i] > array[i+1]) {
				//swap
				int temp = array[i];
				array[i] = array[i+1];
				array[i+1] = temp;
			}
		}
		bubbleSortRecursive(array, n-1);
		
		
	}
	
	public static int[] merge_sort(int[] inputArray) {
		
		int n = inputArray.length;
		//base case
		if(n < 2) {
			return inputArray;
		}
		
		int midIndex = n / 2;
		int[] leftHalf = new int[midIndex];
		int[] rightHalf = new int[n - midIndex];
		
		for(int i = 0; i < midIndex; i++) {
			leftHalf[i] = inputArray[i];
		}
		for(int i = midIndex; i < n; i++) {
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
		int i = 0, j = 0, k = 0;
		
		while(i < leftSize && j < rightSize) {
			
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
		//clean up remaining elements
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
	
	public static int[] quick_sort(int[] array, int start, int end) {
		//base case
		if(end <= start) {
			return array;
		}
		//recursive case
		int pivot = partition(array, start, end);
		
		quick_sort(array, start, pivot -1);
		quick_sort(array, pivot+1, end);
		return array;
	}

	private static int partition(int[] array, int start, int end) {
		
		int pivot = array[end];
		int i = start - 1;
		
		for(int j = start; j <= end-1; j++) {
			
			if(array[j] < pivot) {
				i++;
				//swap i and j
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				
			}
			
		}
		i++;
		//swap i and j
		int temp = array[i];
		array[i] = pivot;
		array[end] = temp;
		
		return i;
		
	}
	
	
}
