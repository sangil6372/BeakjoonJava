package b2579;

import java.util.Scanner;

public class Main {
	
	static int list[];
	static Integer dp[];
	
	public static int find(int n) {
		if (dp[n] == null) {
			dp[n] = list[n] + Math.max(list[n-1]+find(n-3), find(n-2));
		}
		return dp[n];		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		dp = new Integer[n+1];
		list = new int[n+1];
		
		
		for (int i =1;i<=n;i++) {
			list[i] = sc.nextInt();
		}
		dp[0] = list[0];
		dp[1] = list[1];
		
		if (n>=2) {
			dp[2] = list[1]+list[2];
		}
		
		System.out.println(find(n));
		
		sc.close();
	}

}
