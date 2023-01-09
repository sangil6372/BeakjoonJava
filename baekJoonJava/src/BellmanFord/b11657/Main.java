package BellmanFord.b11657;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	static long [] dist;
	static Edge[] edge;
	final static long INF =  500 * 100_000;
	static int V, E;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		V = Integer.parseInt(st.nextToken());
		E = Integer.parseInt(st.nextToken());

		dist = new long[V + 1];
		Arrays.fill(dist, INF);

		edge = new Edge[E];

		for (int i = 0; i < E; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());

			edge[i] = new Edge(a, b, c);
		}
		// 그래프 E 입력 끝
		
		
		if(bellmanFord(1)) {
			for (int i = 2;i<=V;i++) {
				if (dist[i]>=INF) {
					System.out.println("-1");
					continue;
				}
				System.out.println(dist[i]);
			}
		}else {
			System.out.println("-1");
		}
		
		
	}

	public static class Edge {
		int start;
		int end;
		int weight;

		public Edge(int start, int end, int weight) {
			this.start = start;
			this.end = end;
			this.weight = weight;
		}
	}

	public static boolean bellmanFord(int start) {
		dist[start] = 0;

		for (int i = 1; i < V; i++) {
			for (int j = 0; j < E; j++) {
				Edge curEdge = edge[j];
				
				if (dist[curEdge.start] != INF && dist[curEdge.end] > dist[curEdge.start] + curEdge.weight) {
					dist[curEdge.end] = dist[curEdge.start] + curEdge.weight;
				}
			}

		}
		for (int j = 0; j < E; j++) {
			Edge curEdge = edge[j];
			
			if (dist[curEdge.start] != INF && dist[curEdge.end] > dist[curEdge.start] + curEdge.weight) {
				return false;
			}
		}
		
		return true;
	}

}
