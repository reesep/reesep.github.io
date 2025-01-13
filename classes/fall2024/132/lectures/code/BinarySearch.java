
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {2, 5, 8, 10, 13, 16, 19, 25, 30, 100, 150};
		
		int num, answer;
		num = 100;
		
		answer = binary_search(array, num);
		System.out.println("Iterative binary search " + answer);
		
		answer = binary_search_recursive(array, num, 0, array.length-1);
		System.out.println("Recursive binary seach " + answer);
		

	}
	
	
	public static int binary_search(int[] array, int n) {
		int low = 0;
		int high = array.length-1;
		
		while (low <= high) {
			
			int mid = (low + high)/2;
			
			if(array[mid] == n) {
				return mid;
			}
			
			else if (n > array[mid]) { // discard the left section
				low = mid +1;
				
			}
			else { // discard the right section
				high = mid -1;
			}
			
		}
		return -1;
		
	}
	
	public static int binary_search_recursive(int[] array, int n, int low, int high) {
		//base case
		if (low > high) {
			return -1;
		}
		
		int mid = (low + high)/2;
		
		if (array[mid] == n) {
			return mid;
		}
		else if (n > array[mid]) { //search right half
			return binary_search_recursive(array, n, mid + 1, high);
		}
		else {//search left half
			return binary_search_recursive(array, n, low, mid-1);
		}
	}

}
