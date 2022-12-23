package graph.b1260;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int N;
	static int[] visited;
	static int[] visited2;
	static ArrayList<ArrayList<Integer>> graph;
	static int[] vertexOrderDfs;
	static int[] vertexOrderBfs;

	static int count = 1;
	static StringBuilder sb;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());

		graph = new ArrayList<>();
		visited = new int[N + 1];
		visited2 = new int[N + 1];


		for (int i = 0; i <= N; i++) {
			graph.add(new ArrayList<>());
		}

		while (M-- > 0) {
			st = new StringTokenizer(br.readLine());
			int v1 = Integer.parseInt(st.nextToken());
			int v2 = Integer.parseInt(st.nextToken());

			graph.get(v1).add(v2);
			graph.get(v2).add(v1);
		}

		for (int i = 1; i <= N; i++) {
			Collections.sort(graph.get(i));
		}

		sb = new StringBuilder();
		
		dfs(R);
		
		sb.append("\n");
		count = 1;
		
		bfs(R);
		System.out.println(sb);
		
	}

	public static void dfs(int v) {
		visited[v] = 1;
		sb.append(v+" ");

		for (int vertex : graph.get(v)) {
			if (visited[vertex] == 0) {
				dfs(vertex);
			}

		}
	}

	public static void bfs(int v) {

		Queue<Integer> queue = new LinkedList<>();
		queue.add(v);
		visited2[v] = 1;

		while (!queue.isEmpty()) {

			int peek = queue.poll();
			sb.append(peek + " ");

			for (int vertex : graph.get(peek)) {
				if (visited2[vertex] == 0) {
					queue.add(vertex);
					visited2[vertex] = 1;
				}
			}

		}

	}
}
