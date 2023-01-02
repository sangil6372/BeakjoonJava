package backTracking.b15650;

import java.util.Scanner;

public class Main {

	static int N, M;
	static int[] graph;
	static int depth = 0;
	static StringBuilder sb;

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		sb = new StringBuilder();

		N = sc.nextInt();
		M = sc.nextInt();

		graph = new int[N + 1];

		dfs(0, 1);
		
		System.out.println(sb);
		
		sc.close();
	}

	public static void dfs(int v, int depth) {
		if (depth==M+1) {
			for (int i = 1;i<=M;i++) {
				sb.append(graph[i] + " ");
			}
			sb.append("\n");
			return;
		}
		
		
		
		for (int i = 1; i <= N; i++) {
			
			if (i>v) {
				graph[depth] = i; 
				
				dfs(i, depth+1);
				
			}
		}

	}

}
