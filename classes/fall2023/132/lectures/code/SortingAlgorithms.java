
public class SortingAlgorithms {

	public int[] merge_sort(int[] inputArray) {
		
		int inputLength = inputArray.length;
		//base case
		if(inputLength < 2) {
			return inputArray;
		}
		//recursive case
		int midIndex = inputLength / 2;
		int[] leftArray = new int[midIndex];
		int[] rightArray = new int[inputLength - midIndex];
		//fill left array
		for(int i = 0; i < midIndex; i++) {
			leftArray[i] = inputArray[i];
		}
		//fill right array
		for(int i = midIndex; i < inputLength; i++) {
			rightArray[i-midIndex] = inputArray[i];
		}
		
		leftArray = merge_sort(leftArray);
		rightArray = merge_sort(rightArray);
		//merge
		inputArray = merge(inputArray, leftArray, rightArray);
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
		
		//clean up
		while( i < leftSize) {
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
	
	
	
	
	public int[] bubbleSort(int[] array) {
		
		int n = array.length;
		for(int i = 0; i < n -1; i++) {
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
		//one loop of bubble sort to sort one thing 
		for(int i = 0; i < n -1; i++) {
			if(array[i] > array[i+1]) {
				//swap
				int temp = array[i];
				array[i] = array[i+1];
				array[i+1] = temp;
			}
		}
		bubbleSortRecursion(array, n-1);
		
	}
	
	public static int[] quick_sort(int[] array, int start, int end) {
		
		if(end <= start) {
			return array;
		}
		int pivot = partition(array, start, end);
		
		quick_sort(array, start, pivot -1);
		quick_sort(array, pivot +1, end);
		return array;
		
	}
	
	public static int partition(int[] array, int start, int end) {
		int pivot = array[end];
		int i = start -1;
		
		for(int j = start; j <= end-1; j++) {
			
			if(array[j] < pivot) {
				i++;
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}	
		}
		i++;
		int temp = array[i];
		array[i] = pivot;
		array[end] = temp;
		
		return i;
	}
	
    public int[] selectionSort(int[] array) {
        
        int n = array.length;
        
        for(int i = 0; i < n -1; i++) {
            
            int min_index_so_far = i;
            
            for (int j = i + 1; j < n; j++) {
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
    
    public void insertionSort(int array[]) {
        int size = array.length;

        for (int step = 1; step < size; step++) {
          int key = array[step];
          int j = step - 1;

          // Compare key with each element on the left of it until an element smaller than
          // it is found.
          // For descending order, change key<array[j] to key>array[j].
          while (j >= 0 && key < array[j]) {
            array[j + 1] = array[j];
            --j;
          }

          // Place key at after the element just smaller than it.
          array[j + 1] = key;
        }
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
