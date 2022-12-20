package backTracking.b15649;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	static int[] dp;
	static int[][] wire;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		wire = new int[N][2];
		dp = new int[N];

		// wire 입력
		for (int i = 0; i < N; i++) {
			wire[i][0] = sc.nextInt();
			wire[i][1] = sc.nextInt();
		}

		Arrays.sort(wire, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[0] < o2[0])
					return -1;
				else if (o1[0] == o2[0])
					return 0;
				else
					return 1;
			}
		});

		int max = 1;

		for (int i = 0; i < N; i++) {
			max = Math.max(max, recur(i));
		}

		System.out.println(N - max);

		sc.close();
	}

	public static int recur(int n) {
		if (dp[n] == 0) {
			dp[n] = 1;
			for (int i = n + 1; i < dp.length; i++) {
				if (wire[n][1] < wire[i][1]) {
					dp[n] = Math.max(dp[n], recur(i) + 1);
				}
			}
		}
		return dp[n];
	}

}
