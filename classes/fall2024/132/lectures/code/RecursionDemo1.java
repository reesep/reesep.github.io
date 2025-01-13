import java.util.Arrays;

public class RecursionDemo1 {
	
	public static int fib(int n) {
		if (n == 1 || n ==2) {
			return 1;
		}
		
		else {
			return fib(n-1) + fib(n-2);
		}
		
		
	}
	
	public static int fibMemo(int n, int[] memo) {
		if (n == 1 || n == 2) {
			return 1;
		}
		
		if(memo[n] != -1) {
			return memo[n];
		}
		
		memo[n] = fibMemo(n-1, memo) + fibMemo(n-2, memo);
		return memo[n];
	}
	

	public static void main(String[] args) {
		
		long start = System.nanoTime();
		System.out.println(fib(40));
		long end = System.nanoTime();
		
		double totalTime = end-start;
		System.out.println("Fib execution time in nanoseconds: "+ totalTime);
        System.out.printf("Fib execution time in seconds: %.10f %n", totalTime/1000000000.0);

		
        System.out.println("---------------------------");
		int n = 40;
		int[] memo = new int[n+1]; //account for index 40
		Arrays.fill(memo, -1);
		
		long memoStart = System.nanoTime();
		System.out.println(fibMemo(n, memo));

		long memoEnd = System.nanoTime();
		
		double memoTotalTime = memoEnd-memoStart;
		System.out.println("Fib with memoization execution time in nanoseconds: "+ memoTotalTime);
        System.out.printf("Fib with memoization execution time in seconds: %.10f %n", memoTotalTime/1000000000.0);


	}

}
