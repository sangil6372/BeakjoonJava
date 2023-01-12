package ploydWarshall.b1956;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	static long[][] dist;
	static int V;
	final static long INF =  500 * 100_000;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		V = Integer.parseInt(st.nextToken());
		int E = Integer.parseInt(st.nextToken());
		dist = new long[V + 1][V + 1];

		for (int i = 0; i <= V; i++) {
			Arrays.fill(dist[i], INF);
		}

		while (E-- > 0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());

			dist[a][b] = c;
		}
		// 모든 간선 정보 저장 완료

		for (int i = 1; i <= V; i++) {
			ployd(i);
		} // 모든 노드에 대하여 같은 로직 수행

		long[] min = new long[V];
		for (int i = 1; i <= V; i++) {
			min[i - 1] = dist[i][i];
		}
		Arrays.sort(min);
		if (min[0] >= INF)
			System.out.println("-1");
		else {
			System.out.println(min[0]);
		}
		
		
	}

	public static void ployd(int v) {

		for (int i = 1; i <= V; i++) {
			if (i==v) continue;
			for (int j = 1; j <= V; j++) {
				if (dist[i][j] > dist[i][v] + dist[v][j]) {
					dist[i][j] = dist[i][v] + dist[v][j];
				}
			}
		}

	}

}
