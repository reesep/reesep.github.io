
public class BinarySearch {

	public static void main(String[] args) {
		
		int[] array = {2, 6, 12, 14, 17, 25, 31, 44, 55, 56, 71, 83, 90};
		String[] array2 = {"aaa", "bbb", "ccc", "ddd", "eee", "fff", "ggg"};
		
		//String search = "aaa";
		//int answer = binary_search_string(array2, search);
		
		int number = 44;
		int answer = binary_search(array, number);
		//int low = 0;
		//int high = array.length - 1;
		//int answer = binary_search_recursive(array, number, low, high);
		System.out.println(answer);
		
	}
	
	private static int binary_search_string(String[] array, String target) {
		int low = 0;
		int high = array.length - 1;
		//O(logn)
		while(low <= high) {
			
			int mid = (low + high) / 2;
			
			if(array[mid].equals(target)) {
				return mid;
			}
			else if(array[mid].compareTo(target) < 0) {
				low = mid + 1;
			}
			else {
				high = mid - 1;
			}
			
		}
		return -1;
	}

	public static int binary_search(int[] array, int target) {
		
		int low = 0;
		int high = array.length -1;
		
		while(low <= high) {
			
			int mid = (low + high) / 2;
			
			if(array[mid] == target) {
				return mid;
			}
			else if(target > array[mid]) {
				low = mid + 1;
			}
			else {
				high = mid - 1;
			}
			
			
		}
		return -1;
		
	}
	
	public static int binary_search_recursive(int[] array, int target, int low, int high) {
		
		//base case
		if(low > high) {
			return -1;
		}
		int mid = (low + high) / 2;
		
		if(array[mid] == target) {
			return mid;
		}
		else if(target > array[mid]) {
			return binary_search_recursive(array, target, mid +1, high);
		}
		else {
			return binary_search_recursive(array, target, low , mid - 1);
		}
		
		
		
	}
	
	
}
