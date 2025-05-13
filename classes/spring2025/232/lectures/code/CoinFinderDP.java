
public class CoinFinderDP {

	public static void main(String[] args) {
		
		int[] denom = {1, 5, 10, 18, 25};
		int k = 2500;
		
		int[] dp = new int[k + 1];
		for(int i = 0; i < dp.length; i++) {
			dp[i] = -1;
		}
		
		int solution = min_coins(denom, k, dp);
		System.out.println(solution);
		solution = min_coinsBU(denom, k);
		System.out.println(solution);

	}
	
	public static int min_coins(int[] denom, int k, int[] dp) {
		
		//base case
		if(k == 0) {
			return 0;
		}
		else if(dp[k] != -1) {
			return dp[k];
		}
		
		int min = Integer.MAX_VALUE;
		int a = Integer.MAX_VALUE;
		for(int i = 0; i < denom.length; i++) {
			
			if(k - denom[i] >= 0 ) {
				a = min_coins(denom, k - denom[i], dp);
			}
			if(a < min) {
				min = a;
			}
			
		}
		dp[k] = 1 + min;
		return 1 + min;
		
		
	}
	
	public static int min_coinsBU(int[] coins, int p) {
		
		int[] cache = new int[p + 1];
		cache[0] = 0;
		for(int i = 1; i <= p; i++) {
			cache[i] = Integer.MAX_VALUE;
		}
		
		for(int i = 1; i <= p; i++) { //iterate through each spot in cache
			for(int j = 0; j < coins.length; j++) { //iterate through each possible coin
				
				if(coins[j] <= i) {
					int value = cache[i - coins[j]];
					if(value != Integer.MAX_VALUE && value + 1 < cache[i]) {
						cache[i] = value+1;
					}
				}
				
			}
		}
		if(cache[p] == Integer.MAX_VALUE) {
			return -1;
		}
		return cache[p];
		
	}
	
}

