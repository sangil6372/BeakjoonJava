package graph.b1012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int N;
	static int[][] visited;
	static int[][] graph;
	static int count = 0;
	static int[] nx = { -1, 1, 0, 0 };
	static int[] ny = { 0, 0, -1, 1 };
	static int maxX;
	static int maxY;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());

		graph = new int[50][50];
		visited = new int[50][50];
		
		while (N-- > 0) {
			count = 0;
			
			st = new StringTokenizer(br.readLine());
			maxX = Integer.parseInt(st.nextToken());
			maxY = Integer.parseInt(st.nextToken());
			int rep = Integer.parseInt(st.nextToken());
			
			
			//초기화
			for (int i = 0; i < maxX; i++) {
				for (int j = 0; j < maxY; j++) {
					graph[i][j] = 0;
					visited[i][j] = 0;
				}

			}

			while(rep-->0) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				graph[x][y] = 1;
			}
			
			for (int i = 0; i < maxX; i++) {
				for (int j = 0; j < maxY; j++) {
					if (graph[i][j] == 1&&visited[i][j]==0) {
						dfs(i,j);
						count++;
					}
				}

			}
			
			
			
			System.out.println(count);

		}
	}

	public static void dfs(int x, int y) {
		visited[x][y] = 1;
		// 4번 반복 상하좌우
		int dx, dy;

		for (int i = 0; i < 4; i++) {
			dx = nx[i] + x;
			dy = ny[i] + y;
			if (dx >= 0 && dy >= 0 && dx < maxX && dy < maxY) {
				if (graph[dx][dy] == 1 && visited[dx][dy] == 0) {
					dfs(dx, dy);
				}
			}
		}

	}

}
