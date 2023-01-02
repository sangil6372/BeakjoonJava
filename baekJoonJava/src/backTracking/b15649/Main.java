package backTracking.b15649;

import java.util.Scanner;

public class Main {

	static int N, M;
	static int[] graph;
	static int[] visited;
	static int depth = 0;
	static StringBuilder sb;

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		sb = new StringBuilder();

		N = sc.nextInt();
		M = sc.nextInt();

		graph = new int[N + 1];
		visited = new int[N + 1];

		dfs(1);
		
		System.out.println(sb);
		
		sc.close();
	}

	public static void dfs(int depth) {
		if (depth==M+1) {
			for (int i = 1;i<=M;i++) {
				sb.append(graph[i] + " ");
			}
			sb.append("\n");
			return;
		}
		
		
		
		for (int i = 1; i <= N; i++) {
			
			if (visited[i]==0) {
				visited[i] = 1;
				graph[depth] = i; 
				
				dfs(depth+1);
				
				visited[i] = 0;
			}
		}

	}

}
