package b9461;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		long[] dp = new long[101];

		dp[1] = dp[2] = dp[3] = 1;
		dp[4] = dp[5] = 2;
		dp[6] = 3;
		dp[7] = 4;
		dp[8] = 5;

		while (n-- > 0) {
			int m = sc.nextInt();
			if (m >= 9) {
				for (int i = 9; i <= m; i++) {
					dp[i] = dp[i - 5] + dp[i - 1];
				}

			}
			System.out.println(dp[m]);
		}
	}
}
