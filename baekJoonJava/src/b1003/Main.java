package b1003;

import java.util.Scanner;

public class Main {
	
	static int dp[][];
	
	public static int[] recur(int n) {
		if (dp[n][0]!=0||dp[n][1]!=0) return dp[n];
		
		else {
			dp[n][0] = recur(n-1)[0] + recur(n-2)[0];
			dp[n][1] = recur(n-1)[1] + recur(n-2)[1];
		}
		return dp[n];
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		dp = new int[41][2];
		dp[0][0] = 1;
		dp[0][1] = 0;
		dp[1][0] = 0;
		dp[1][1] = 1;
		
		int buffer;
		
		for (int i = 0; i < N; i++) {
			buffer = sc.nextInt();
			System.out.println(recur(buffer)[0] + " " + recur(buffer)[1]);
		}
		
		sc.close();
	}
}
