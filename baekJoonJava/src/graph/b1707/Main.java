package graph.b1707;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	static ArrayList<ArrayList<Integer>> graph;
	final static int RED = 1;
	static final int BLUE = -1;
	static int[] visited;
	static boolean isBipertite;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int K = Integer.parseInt(st.nextToken());

		visited = new int[200021];

		

		// K번 반복 수행
		while (K-- > 0) {
			graph = new ArrayList<>();
			
			st = new StringTokenizer(br.readLine());
			
			// 노드V개 간선E개 입력
			int V = Integer.parseInt(st.nextToken());
			int E = Integer.parseInt(st.nextToken());

			visited = new int[V+1];
			
			// 그래프 초기화 색칠 초기화
			for (int i = 0; i < V + 1; i++) {
				graph.add(new ArrayList<>());
				visited[i] = 0;
			}

			// 양방향 그래프 연결
			for (int i = 0; i < E; i++) {
				st = new StringTokenizer(br.readLine());
				int v = Integer.parseInt(st.nextToken());
				int e = Integer.parseInt(st.nextToken());

				graph.get(v).add(e);
				graph.get(e).add(v);
			}

			// 그래프 오름차순 필요한가? NO -> 우선순위가 있는 순회가 아님
//			for (int i = 0; i < graph.size(); i++) {
//				Collections.sort(graph.get(i));
//			}

			isBipertite = true;

			for (int i = 1; i <= V; i++) {
				if (!isBipertite) {
					break;
				}
				if (visited[i] == 0)
					dfs(i, RED);
			}
		
			System.out.println(isBipertite ? "YES" : "NO");
		}

	}

	public static void dfs(int v, int color) {
		visited[v] = color;

		for (int adj : graph.get(v)) {

			if (visited[adj] == color) {
				isBipertite = false;
				return;
			}

			if (visited[adj] == 0) {
				dfs(adj, -color);

			}

		}

	}

}
