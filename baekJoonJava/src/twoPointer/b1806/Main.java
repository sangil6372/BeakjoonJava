package twoPointer.b1806;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 첫째 줄에 N (10 ≤ N < 100,000)과 S (0 < S ≤ 100,000,000)가 주어진다.
		int N = sc.nextInt();
		int S = sc.nextInt();

		int[] arr = new int[N];

		// 둘째 줄에는 수열이 주어진다.
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		// 연속된 수들의 부분합 중에 그 합이 S 이상이 되는 것 중, 가장 짧은 것의 길이
		int start = 0;
		int end = 0;

		int minLength = N+1;

		int sum = arr[0];

		while (start <= end) {
			if (sum < S) {
				end++;
				if (end>=N) break;
				sum+=arr[end];
			} else {
				minLength = Math.min(minLength, end - start + 1);
				sum-=arr[start];
				start++;
			}
		}
		
		if (minLength == N+1) {
			System.out.println("0");
		}else {
			System.out.println(minLength);
		}
		
		sc.close();
	}

}
