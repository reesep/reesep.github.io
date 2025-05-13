import java.util.Arrays;

public class EditDistanceDP {

	public static void main(String[] args) {
		
		String str1 = "SUNWYAAAAAAAAAA";
		String str2 = "SUNNY";
		
		int m = str1.length();
		int n = str2.length();
		
		int[][] dp = new int[n+1][m+1];
		for(int i = 0; i < n + 1; i++) {
			Arrays.fill(dp[i], -1);
		}
		
		int solution = editDistance(str1, str2, m, n, dp);
		System.out.println(solution);
		
	}

	private static int editDistance(String str1, String str2, int i, int j, int[][] dp) {
		
		//base case
		if(i == 0) {
			return j;
		}
		else if(j == 0) {
			return i;
		}
		//check memoization table to see if we already have answer
		if(dp[j][i] != -1) {
			return dp[j][i];
		}
		
		if(str1.charAt(i-1) == str2.charAt(j-1)) {
			int x = editDistance(str1, str2, i-1, j-1, dp);
			dp[j][i] = x;
			return dp[j][i];
		}
		
		//try space in x
		int x_space = 1 + editDistance(str1, str2, i, j-1, dp);
		//try space in y
		int y_space = 1 + editDistance(str1, str2, i-1, j, dp);
		//no spaces, align characters normally
		int misalign = 1 + editDistance(str1, str2, i-1, j-1, dp);
		
		int solution = Math.min( Math.min(x_space,  y_space), misalign );
		dp[j][i] = solution;
		return dp[j][i];
		
	}

}
