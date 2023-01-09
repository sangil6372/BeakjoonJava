package BellmanFord.b1865;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	static long[] dist;
	static Edge[] edge;
	final static long INF = 500 * 100_000;
	static int V, E, W;
	static Edge[] edges;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int TC = Integer.parseInt(st.nextToken());

		while (TC-- > 0) {
			st = new StringTokenizer(br.readLine());
			V = Integer.parseInt(st.nextToken());
			E = Integer.parseInt(st.nextToken());
			W = Integer.parseInt(st.nextToken());

			dist = new long[V + 1];

			edges = new Edge[2 * E + W];

			for (int i = 0; i < E; i++) {
				st = new StringTokenizer(br.readLine());
				int start = Integer.parseInt(st.nextToken());
				int end = Integer.parseInt(st.nextToken());
				int weight = Integer.parseInt(st.nextToken());

				edges[i] = new Edge(start, end, weight);
				edges[E + W + i] = new Edge(end, start, weight);
			}

			// 웜홀 정보?
			for (int i = E; i < E + W; i++) {
				st = new StringTokenizer(br.readLine());
				int start = Integer.parseInt(st.nextToken());
				int end = Integer.parseInt(st.nextToken());
				int weight = Integer.parseInt(st.nextToken());

				edges[i] = new Edge(start, end, -weight);

			}

			if (!bellmanFord(1)) {
				System.out.println("YES");
			} else
				System.out.println("NO");

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
		Arrays.fill(dist, INF);
		dist[start] = 0;

		for (int i = 1; i < V; i++) {
			for (int j = 0; j < 2 * E + W; j++) {
				Edge curEdge = edges[j];

				if (dist[curEdge.end] > dist[curEdge.start] + curEdge.weight) {
					dist[curEdge.end] = dist[curEdge.start] + curEdge.weight;
				}

			}

		}

		for (int j = 0; j < 2 * E + W; j++) {
			Edge curEdge = edges[j];

			if (dist[curEdge.end] > dist[curEdge.start] + curEdge.weight) {
				dist[curEdge.end] = dist[curEdge.start] + curEdge.weight;
				return false;
			}

		}

		return true;
	}

}
