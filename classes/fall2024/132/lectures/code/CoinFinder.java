
public class CoinFinder {

	public static void main(String[] args) {
		
		int[] D = {1, 5, 10, 18, 25};
		int p = 100;

		int answer = min_coins(D, p);
		System.out.println(answer);
		
	}
	
	public static int min_coins(int[] D, int p) {
		
		//base case
		if(p == 0) {
			return 0;
		}
		
		//recursive case
		int min = Integer.MAX_VALUE;
		int a = Integer.MAX_VALUE;
		
		for(int i = 0; i < D.length; i++) {
			
			if(p - D[i] >= 0) {
				a = min_coins(D, p - D[i]);
			}
			
			if(a < min) {
				min = a;
			}
			
		}
		return 1 + min;
		
		
		
	}
	

}
