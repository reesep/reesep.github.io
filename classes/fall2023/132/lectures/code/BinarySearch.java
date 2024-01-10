
import java.util.Arrays;
public class BinarySearch {

		public static void main(String[] args) {
			System.out.println("Binary Search");
			//already sorted
			int[] array = {2, 6, 12, 14, 17, 19, 20, 23, 27, 29, 32, 37, 40, 42, 45};
			int num, answer;
			System.out.println(Arrays.toString(array));
			System.out.println("----------------------------------------------------------------");
			
			num = 7;
			answer = binary_search(array,num);
			//answer = binary_search_recursive(array, num, 0, array.length-1);
			System.out.println(num + " is located at index: " + answer);

		}

		private static int binary_search(int[] array, int n) {
			int low = 0;
			int high = array.length -1;
			
			while(low <= high) {
				
				int mid = (low + high) / 2;
				if(n == array[mid]) {
					return mid;
				}
				else if(n > array[mid]) {
					low = mid + 1;
				}
				else {
					high = mid - 1;
				}
				
				
			}
			return -1;
		}
		
		private static int binary_search_recursive(int[] array, int n, int low, int high) {
			if(low <= high) {
				int mid = (low + high) / 2;
				if(n == array[mid]) {
					return mid;
				}
				else if(n > array[mid]) {
					return binary_search_recursive(array, n, mid+1, high);
				}
				else{
					return binary_search_recursive(array, n, low, mid-1);
				}
			}
			else {
				return -1;
			}
		}
		

	}
	
	

