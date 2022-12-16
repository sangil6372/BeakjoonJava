package dp.b11053;

import java.util.Scanner;

public class Main {

	public static int[] dp;
	public static int[] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		arr = new int[N + 1];
		dp = new int[N + 1];

		for (int i = 1; i <= N; i++) {
			arr[i] = sc.nextInt();
		}
		dp[1] = 1;

		int max = 1;
		
		for (int i = 1;i<=N;i++) {
			max = Math.max(max, countAscendingSeq(i));
		}
		System.out.println(max);
		
		sc.close();
	}

	public static int countAscendingSeq(int n) {
		if (dp[n] == 0) {
			dp[n] = 1;
			for (int i = n - 1; i > 0; i--) {
				if (arr[n] > arr[i])
					dp[n] = Math.max(dp[n], countAscendingSeq(i) + 1);
			}
		}

		return dp[n];
	}
}
