package SW.b14503;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static boolean[][] visited;
	static int[][] area;
	static int r, c; // 현재 위치
	static int[] dx = { -1, 0, 1, 0 };
	static int[] dy = { 0, 1, 0, -1 };

	static int cnt = 0;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// N x M
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		visited = new boolean[N][M];
		area = new int[N][M];

		

		// (r,c) direction
		st = new StringTokenizer(br.readLine());
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		
		//
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				int n = Integer.parseInt(st.nextToken());
				if (n == 1)
					visited[i][j] = true;
				area[i][j] = n; // 벽은 1 공간은 0
			}
		}
		// area 입력 받음
		clean(d);
		
		
		System.out.println(cnt);
		
	}

	// 1
	public static void clean(int d) {
		cnt++;
		visited[r][c] = true;
		move(d);
	}

	// 2
	public static void move(int d) {

		// 현재 방향에서 왼쪽 방향
		int left = d == 0 ? 3 : d - 1; // 왼쪽 방향

		// 왼쪽방향으로 전진한 좌표
		int nextX = r + dx[left];
		int nextY = c + dy[left];

		// 왼쪽 방향에 아직 청소하지 않은 공간이 존재한다면, 그 방향으로 회전한 다음 한 칸을 전진하고 1번부터 진행한다.
		if (visited[nextX][nextY] == false) {
			r = nextX;
			c = nextY;
			clean(left);
		}

		// 왼쪽 방향에 청소할 공간이 없다면, 그 방향으로 회전하고... 2번으로 돌아간다.
		else {
			int flag = 0; // 4방향이 청소 되어있는지 확인
			for (int i = 0; i < 4; i++) {
				if (visited[r + dx[i]][c + dy[i]] == false) {
					flag++;
				}
			}
			// 4방향 모드 클린
			if (flag == 0) {
				// 뒤가 벽인지 확인 현재 방향 dx[d-2] dy[d-2]
				int backD = d-2;
				
				if (backD<0) {
					if (d-2 == -1) backD = 3;
					if (d-2 == -2) backD = 2;
				}
				
				if (area[r+dx[backD]][c+dy[backD]] == 1) {
					// 작동 끝
					return;
				}
				else {
					r += dx[backD];
					c += dy[backD];
					move(d);
				}
				
			} else {
				move(left);
			}
		}

	}

}
