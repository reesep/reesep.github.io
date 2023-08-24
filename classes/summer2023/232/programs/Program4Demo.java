import java.util.Arrays;

public class Program4Demo {

	
	
	
	public static void main(String[] args) {
		
            //test case 1	
	    int[] prices = { 1, 5, 8, 9, 10, 17, 17, 20 };
	    int rod_length = 8;
		
	    int dp[][] = new int[rod_length][rod_length + 1];
            //initially store -1 at each spot
	    for (int i = 0; i < rod_length; i++) {
	      Arrays.fill(dp[i], -1);
	    }

	    int solution = cutRod(prices, rod_length - 1, rod_length, dp);
            System.out.println("Maximum profit: " + solution);
		
            // test case 2
            int[] prices2 = { 5, 2, 2, 3, 3, 4, 40, 5, 5, 5 };
            int rod_length2 = 10;
		
	    int dp2[][] = new int[rod_length2][rod_length2 + 1];
	    for (int i = 0; i < rod_length2; i++) {
	      Arrays.fill(dp2[i], -1);
	    }

	    solution = cutRod(prices2, rod_length2 - 1, rod_length2, dp2);
	    System.out.println("Maximum profit: " + solution);
		
	}

	
	public static int cutRod(int[] prices, int index, int rod_length, int[][] dp) {
	    //TO DO: Your code will go here. You dont need to write any other methods or classes.
	


	}
	
	
	
}
