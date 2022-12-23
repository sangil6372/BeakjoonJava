package graph.b24479;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	static int N;
	static int[] visited;
	static ArrayList<ArrayList<Integer>> graph;
	static int[] vertexOrder;
	static int count = 1;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());

		graph = new ArrayList<>();
		visited = new int[N + 1];
		vertexOrder = new int[N + 1];

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

		dfs(R);

		for (int i = 1; i <= N; i++) {
			System.out.println(vertexOrder[i]);
		}
	}

	public static void dfs(int v) {
		visited[v] = 1;
		vertexOrder[v] = count++;

		for (int vertex : graph.get(v)){
			if (visited[vertex]==0) {
				dfs(vertex);
			}
			
		}
	}

}
