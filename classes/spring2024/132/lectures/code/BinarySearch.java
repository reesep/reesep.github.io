
public class BinarySearch {

	public static void main(String[] args) {
		
		int[] array = {2, 6, 12, 14, 17, 25, 31, 44, 55, 56, 71, 83, 99};
		
		int num, answer;
		num = 56;
		
		answer = binary_search(array, num);
		System.out.println(answer);

	}
	
	public static int binary_search(int[] array, int n) {
		
		int low = 0;
		int high = array.length - 1;
		
		while(low <= high) {
			
			int mid = (low + high) / 2;
			
			if(array[mid] == n) {
				return mid;
			}
			else if(n > array[mid]) { //discard left section
				low = mid + 1;
			}
			else { //discard right section
				high = mid -1;
			}
			
			
		}
		return -1;
		
		
	}

}
