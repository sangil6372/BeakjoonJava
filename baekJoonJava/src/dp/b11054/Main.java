package dp.b11054;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static int[] dpA;
	public static int[] dpB;
	public static int[] arr;
	public static int N;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());

		arr = new int[N + 1];
		dpA = new int[N + 1];
		dpB = new int[N + 1];
		int dp[] = new int [N+1];
		
		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());

		}
		
		int max = 1;
		
		for (int i = 0; i < N; i++) {
			dp[i] = ascendingSeq(i) + descendingSeq(i) -1;
			if (dp[i]>max) max = dp[i];
		}
		
		System.out.println(max);
		

	}

	public static int ascendingSeq(int n) {
		if (dpA[n] == 0) {
			dpA[n] = 1;

			for (int i = n - 1; i >= 0; i--) {
				if (arr[n] > arr[i]) {
					dpA[n] = Math.max(dpA[n], ascendingSeq(i) + 1);
				}
			}
		}
		return dpA[n];

	}

	public static int descendingSeq(int n) {
		if (dpB[n] == 0) {
			dpB[n] = 1;

			for (int i = n + 1; i < N; i++) {
				if (arr[n] > arr[i]) {
					dpB[n] = Math.max(dpB[n], descendingSeq(i) + 1);
				}
			}
		}
		return dpB[n];

	}

}
