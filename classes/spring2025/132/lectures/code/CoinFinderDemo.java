
public class CoinFinderDemo {

	public static void main(String[] args) {
		
		int[] denom = {1, 5, 10, 18, 25};
		//this algorithm will struggle if we increase p or length of denom
		int p = 37;
		
		//really bad algorithm (lots of branching)
		int solution = min_coins(denom, p);
		System.out.println(solution);
	}
	
	public static int min_coins(int[] denom, int p) {
		
		//base case
		if(p == 0) {
			return 0;
		}
		
		else {
			//recursive case
			int a = Integer.MAX_VALUE;
			int min = Integer.MAX_VALUE;
			
			for(int i = 0; i < denom.length; i++) {
				if( p - denom[i] >= 0) {
					a = min_coins(denom, p - denom[i]);
					if(a < min) {
						min = a;
					}
				}
			}
			return 1 + min;
			
		}
		
		
	}

}
