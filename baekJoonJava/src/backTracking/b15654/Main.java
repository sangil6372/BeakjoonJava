package backTracking.b15654;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {

	static int N, M;
	static StringBuilder sb;
	static int[] arr;
	static int[] check;
	static int[] visited;
	static ArrayList<String> str;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sb = new StringBuilder();

		N = sc.nextInt();
		M = sc.nextInt();

		arr = new int[N];
		check = new int[M];
		visited = new int[N];
		
		str = new ArrayList<>();
		
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
			visited[i] = 0;
		}
		// 입력 완료
		Arrays.sort(arr);
		
		backTrackingBFS(0);
		
		LinkedHashSet<String> set = new LinkedHashSet<>();
		
		for (String s : str) {
			set.add(s);
		}
		for (String s : set) {
			System.out.print(s);
		}
		
		sc.close();
	}

	public static void backTrackingBFS(int depth) {

		if (depth == M) {
			// 출력
			for (int i = 0; i < M; i++) {
				sb.append(check[i] + " ");
			}
			sb.append("\n");
			str.add(sb.toString());
			sb.setLength(0);
			return;
		}

		for (int i = 0; i < N; i++) {
			if (depth==0) {
				check[depth] = arr[i];
				backTrackingBFS(depth+1);
				continue;
			}
			
			if (check[depth-1]<=arr[i]) {
				check[depth] = arr[i];
				backTrackingBFS(depth + 1);
			}
		}

	}

}
