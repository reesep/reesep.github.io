
public class CoinFinder {

	public static void main(String[] args) {

		int[] D = {1, 5, 10, 18, 25}; //coin denominations
		int p = 50; //If we change this to a big number, our program might take too long :-)
		int solution = minCoins(D, p);
		System.out.println(solution);
	}
	
	public static int minCoins(int[] D, int p) {
		
		//base case
		if(p == 0) {
			return 0;
		}
		else {
			//recursive case
			int a = Integer.MAX_VALUE;
			int min = Integer.MAX_VALUE;
			for(int i = 0; i < D.length; i++) { //branch K times
				if( p - D[i] >= 0) {
					a = minCoins(D, p - D[i] );
					if(a < min) {
						min = a;
					}
				}
			}
			return 1 + min;
		}
		
	}

}
