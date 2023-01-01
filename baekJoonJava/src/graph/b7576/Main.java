package graph.b7576;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static int[][] graph;
	static int max = 0, M, N;
	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };
	static Queue<Pair> queue;
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());

		graph = new int[N][M];
		queue = new LinkedList<>();
		
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				graph[i][j] = Integer.parseInt(st.nextToken());
				if (graph[i][j]==1) queue.add(new Pair(i,j));
			}
		}

		bfs();

		int flag = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (max < graph[i][j])
					max = graph[i][j];
				if (graph[i][j] == 0)
					flag++;
			}
		}
		if (flag > 0)
			System.out.println("-1");
		else {
			System.out.println(max-1);
		}

	}

	public static class Pair {
		int x, y;

		Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	public static void bfs() {

		while (!queue.isEmpty()) {

			Pair peek = queue.poll();

			for (int i = 0; i < 4; i++) {
				Pair nextPeek = new Pair(peek.x + dx[i], peek.y + dy[i]);

				if (nextPeek.x >= 0 && nextPeek.y >= 0 && nextPeek.x < N && nextPeek.y < M) {
					if (graph[nextPeek.x][nextPeek.y] > graph[peek.x][peek.y] + 1	// 필요 없는 조건 <- 깊이 우선으로 돌기 때문! 
							|| (graph[nextPeek.x][nextPeek.y] == 0)) {
						graph[nextPeek.x][nextPeek.y] = graph[peek.x][peek.y] + 1;
						queue.add(new Pair(nextPeek.x, nextPeek.y));
					}
				}
			}

		}

	}

}
