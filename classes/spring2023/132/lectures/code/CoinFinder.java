
import java.util.ArrayList;

public class CoinFinder {

	public static void main(String[] args) {
		
		int[] D = {1, 5, 10, 25};
		int k = 37;
		int n = 4;
		
		find_coins(D, k, n);
		

	}
	
	private static void find_coins(int[] d, int k, int n) {
        
        int chosen[] = new int[n + 1];
 
        calculate_combinations(chosen, d, 0, n, 0, d.length - 1, k);
    }

    private static void calculate_combinations(int[] chosen, int[] arr, int index, int r, int start, int end, int target) {

        if (index == r) {
        		int counter = 0;
        		ArrayList<Integer> coins = new ArrayList<Integer>();
	            for (int i = 0; i < r; i++) {
	                counter += arr[chosen[i]];
	                coins.add(arr[chosen[i]]);
	            }
	            if(counter == target) {
	            	System.out.println(coins);
	            }
	            return;
        }
 
        for (int i = start; i <= end; i++) {
            chosen[index] = i;
            calculate_combinations(chosen, arr, index + 1, r, i, end, target);
        }
        return;

        
    }
}
