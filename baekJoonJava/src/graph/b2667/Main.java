package graph.b2667;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	static int N;
	static int[][] visited;
	static ArrayList<ArrayList<Integer>> graph;
	static int count = 0;
	static int[] nx = { -1, 1, 0, 0 };
	static int[] ny = { 0, 0, -1, 1 };
	static int[] aparts = new int[25 * 25];

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());

		graph = new ArrayList<>();
		visited = new int[N][N];

		for (int i = 0; i <= N; i++) {
			graph.add(new ArrayList<>());
		}

		for (int i = 0; i < N; i++) {
			String[] str = br.readLine().split("");
			for (int j = 0; j < N; j++) {
				int num = Integer.parseInt(str[j]);
				graph.get(i).add(num);
			}
		}
// 그래프 입력 완료
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (visited[i][j]==0&&graph.get(i).get(j)==1) {
					count++; // 아파트 넘버 증가 
					dfs(i,j);
				}
			}
		}
	
		Arrays.sort(aparts);
		
		System.out.println(count);
		
		for (int i = 0;i<aparts.length;i++) {
			if (aparts[i]>0) System.out.println(aparts[i]);
		}

	}

	public static void dfs(int x, int y) {
		visited[x][y] = 1;
		aparts[count]++;
		// 4번 반복 상하좌우
		int dx, dy;
		
		for (int i = 0; i < 4; i++) {
			dx = nx[i]  +x;
			dy = ny[i] + y;
			if (dx >= 0 && dy >= 0 && dx < N && dy < N) {
				if (graph.get(dx).get(dy) == 1 && visited[dx][dy] == 0) {
					dfs(dx, dy);
				}
			}
		}

	}

}
