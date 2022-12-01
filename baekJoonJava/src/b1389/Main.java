package b1389;

import java.util.Scanner;

public class Main {

	static final int INF = 987654321;
	static int N,M;
	static int[][] arr;
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		M = sc.nextInt();
		arr = new int[N + 1][N + 1];

		for (int i = 1; i < N + 1; i++) {
			for (int j = 1; j < N + 1; j++) {
				arr[i][j] = INF;
				 
                if (i == j) {
                    arr[i][j] = 0;
                }
			}
		}

		while (M-- > 0) {
			int a, b;
			a = sc.nextInt();
			b = sc.nextInt();
			arr[a][b] = arr[b][a] = 1;
		}
		
		// 플로이드 마샬 알고리즘
		for (int k = 1; k < N + 1; k++) {
			for (int i = 1; i < N + 1; i++) {
				for (int j = 1; j < N + 1; j++) {
					arr[i][j] = Math.min(arr[i][k] + arr[k][j], arr[i][j]);
				}
			}
		}
		int minIdx = -1;
		int res = INF;
		int total;
		
		for (int i = 1; i < N + 1; i++) {
			total = 0;
			for (int j = 1; j < N + 1; j++) {
				total += arr[i][j];
			}
			if (res > total) {
				res = total;
				minIdx = i;
			}
		}
		
		System.out.println(minIdx);

		sc.close();
	}

}
