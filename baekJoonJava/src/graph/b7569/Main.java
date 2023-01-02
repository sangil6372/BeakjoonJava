package graph.b7569;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main {

	static int[][][] graph;
	static int max = 0, M, N, H;
	static int[] dx = { -1, 1, 0, 0, 0, 0 };
	static int[] dy = { 0, 0, -1, 1, 0, 0 };
	static int[] dz = { 0, 0, 0, 0, 1, -1 };

	static Queue<Pair> queue;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		H = Integer.parseInt(st.nextToken());

		graph = new int[H][N][M];
		queue = new LinkedList<>();

		for (int i = 0; i < H; i++) {
			for (int j = 0; j < N; j++) {
				st = new StringTokenizer(br.readLine());
				for (int k = 0; k < M; k++) {
					graph[i][j][k] = Integer.parseInt(st.nextToken());
					if (graph[i][j][k] == 1)
						queue.add(new Pair(i, j, k));
				}
			}
		}

		bfs();

		int max = 0;
		int flag = 0;

		for (int i = 0; i < H; i++) {
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < M; k++) {
					if (graph[i][j][k] == 0)
						flag++;
					max = Math.max(max, graph[i][j][k]);
				}
			}
		}
		if (flag != 0)
			System.out.println("-1");
		else {
			System.out.println(max-1);
		}
	}

	public static void bfs() {

		while (!queue.isEmpty()) {

			Pair peek = queue.poll();

			for (int i = 0; i < 6; i++) {
				Pair nextPeek = new Pair(peek.x + dx[i], peek.y + dy[i], peek.z + dz[i]);

				if (nextPeek.x >= 0 && nextPeek.y >= 0 && nextPeek.x < H && nextPeek.y < N&&nextPeek.z>=0&&nextPeek.z<M) {
					if (graph[nextPeek.x][nextPeek.y][nextPeek.z] == 0) {
						graph[nextPeek.x][nextPeek.y][nextPeek.z] = graph[peek.x][peek.y][peek.z] + 1;
						queue.add(new Pair(nextPeek.x, nextPeek.y, nextPeek.z));
					}
				}
			}
		}

	}

	public static class Pair {
		int x, y, z;

		public Pair(int x, int y, int z) {
			this.x = x;
			this.y = y;
			this.z = z;
		}
	}

}