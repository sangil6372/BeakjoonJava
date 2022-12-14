package b1904;

import java.util.Scanner;

public class Main {

	public static int[] dp = new int[1000001];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 2;
		
		System.out.println(tile(N));
		
		
		sc.close();
	}
	
	
	public static int tile (int n) {
		
		if (dp[n]==0) dp[n] = (tile(n-1)+ tile(n-2))%15746;
		
		return dp[n];
	}
}
