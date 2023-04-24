
import java.util.Random;

public class SortingAlgorithm {

	public int[] getRandomArray(int n) {
		int[] array = new int[n];
		Random random = new Random();
		for(int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(101);
		}
		
		return array;
	}
	
	public int[] bubble_sort(int[] array) {
		
		int n = array.length;
		for(int i = 0; i < n - 1; i++) {
			
			for(int j = 0; j < n - i - 1; j++) {
				
				if ( array[j] > array[j + 1]) {
					//swap
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					
				}
				
				
			}
			
			
		}
		
		return array;
	}
	
	
	public int[] selection_sort(int[] array) {
		
		int n = array.length;
		for(int i = 0; i < n -1; i++) {
			int min_index_so_far = i;
			for(int j = i +1; j < n; j++) {
				
				if(array[j] < array[min_index_so_far]) {
					min_index_so_far = j;
				}
				
			}
			int temp = array[i];
			array[i] = array[min_index_so_far];
			array[min_index_so_far] = temp;
			
		}
		
		return array;
	}
	
	public int[] merge_sort(int[] inputArray) {
		
		int inputLength = inputArray.length;
		if(inputLength < 2) {
			return inputArray;
		}
		int midIndex = inputLength / 2;
		int[] leftHalf = new int[midIndex];
		int[] rightHalf = new int[inputLength - midIndex];
		
		for(int i = 0; i < midIndex; i++) {
			leftHalf[i] = inputArray[i];
		}
		for(int i = midIndex; i < inputLength;i++) {
			rightHalf[i-midIndex] = inputArray[i];
		}
		
		leftHalf = merge_sort(leftHalf);
		rightHalf = merge_sort(rightHalf);
		inputArray = merge(inputArray, leftHalf, rightHalf);
		return inputArray;
	}
	
	public int[] merge(int[] inputArray, int[] leftHalf, int[] rightHalf) {
		int leftSize = leftHalf.length;
		int rightSize = rightHalf.length;
		int i =0, j = 0, k = 0;
		
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
		
		//clean up the remaining non-empty sub-array
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
	
		if(end <= start) { //base case 
			return array;
		}
		int pivot = partition(array, start, end);
		quick_sort(array,start,pivot-1);
		quick_sort(array,pivot+1,end);
		
		return array;
		
		
	}

	private int partition(int[] array, int start, int end) {
		int pivot = array[end];
		int i = start-1;
		for(int j = start; j <= end -1;j++) {
			
			if ( array[j] < pivot){
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
