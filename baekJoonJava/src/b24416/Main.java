package b24416;


import java.util.Scanner;

public class Main {
	static int cnt = 0;
	public static int reculsiveFibo(int n) {
		if (n==1||n==2) {
			cnt++;
			return 1;
		}
		else return reculsiveFibo(n-1) + reculsiveFibo(n-2);
	}
	public static int dynamicFibo(int n) {
		int[] dp = new int[n+1];
		
		dp[1] = 1;
		dp[2] = 1;
		
		for(int i=3; i<=n; i++) {
			cnt++;
			dp[i] = dp[i-1] + dp[i-2];
		}
		
		return dp[n];
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		reculsiveFibo(n);
		System.out.print(cnt + " ");
		cnt = 0;
		dynamicFibo(n);
		
		System.out.println(cnt);
	
		sc.close();
	}
}
