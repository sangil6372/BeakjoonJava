package graph.b2178;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static int[][] arr;
	public static int[][] visited;
	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };
	static int N;
	static int M;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		arr = new int[N + 1][M + 1];
		visited = new int[N + 1][M + 1];

		for (int i = 1; i <= N; i++) {
			String[] str = br.readLine().split("");
			for (int j = 1; j <= M; j++) {
				arr[i][j] = Integer.parseInt(str[j-1]);
			}
		}
		// 처음 세팅 끝
		bfs(1,1);
		
		
		System.out.println(arr[N][M]);
	}

	public static class Pair {
		int x, y;

		Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}

	}

	public static void bfs(int x, int y) {

		Queue<Pair> queue = new LinkedList<>();
		queue.add(new Pair(x, y));
		visited[x][y] = 1;

		while (!queue.isEmpty()) {

			Pair peek = queue.poll();

			for (int i = 0; i < 4; i++) {
				Pair nextPeek = new Pair(peek.x+dx[i],peek.y+dy[i]); 	
				if (nextPeek.x>0&&nextPeek.y>0&&nextPeek.x<=N&&nextPeek.y<=M) {
					if (arr[nextPeek.x][nextPeek.y]==1) {
						if (visited[nextPeek.x][nextPeek.y]==0) {
							queue.add(new Pair(nextPeek.x,nextPeek.y));
							arr[nextPeek.x][nextPeek.y] = arr[peek.x][peek.y] + 1;
							visited[nextPeek.x][nextPeek.y] = 1;
						}
					}
				}
				
			}

		}

	}
}
