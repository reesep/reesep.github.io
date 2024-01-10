
public class CoinFinder {

	public static void main(String[] args) {
		
		int[] D = {1};
		int p = 37;
		
		int n = min_coins(D, p);
		System.out.println(n);

	}

	private static int min_coins(int[] d, int p) {
		//base case
		if(p == 0 || p < 0) {
			return 0;
		}
		
		//recursive case
		int min = Integer.MAX_VALUE;
		int a = Integer.MAX_VALUE;
		
		for(int i = 0; i < d.length; i++) {
			
			if(p - d[i] >= 0){
				a = min_coins(d, p - d[i]);
			}
			if(a < min) {
				min = a;
			}
			
		}
		return 1 + min;
	}

}
