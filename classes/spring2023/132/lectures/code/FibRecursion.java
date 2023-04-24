
public class FibRecursion {

	public static void main(String[] args) {
		
		int n = 1000;
		long answer = fib(n);
		System.out.println(answer);

	}

	private static long fib(int n) {
		
//		if( n==1 || n == 2) {
//			return 1;
//		}
//		else {
//			return fib(n-1) + fib(n-2);
//		}
		return (long) (0.5 * Math.pow((1+Math.sqrt(5))/2, n) + Math.pow((1 - Math.sqrt(5))/2, n));
		
	}

}
