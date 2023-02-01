package SW.b14499;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int[][] map;
	static int[][] dice;
	static int bottom; // dice[1][0~3]
	static int x, y; // 주사위 위치
	static int N, M;; // 세로 N 가로 M

	public static void moveDice(int dir) {
		int temp = 0;
		switch (dir) {
		case 1:
			// 오른쪽
			temp = dice[1][3];
			dice[1][3] = dice[1][2];
			dice[1][2] = dice[1][1];
			dice[1][1] = dice[1][0];
			dice[1][0] = temp;

			dice[3][1] = dice[1][3];
			break;
		case 2:
			// 왼쪽
			temp = dice[1][0];
			dice[1][0] = dice[1][1];
			dice[1][1] = dice[1][2];
			dice[1][2] = dice[1][3];
			dice[1][3] = temp;

			dice[3][1] = dice[1][3];
			break;
		case 3:
			// 위
			temp = dice[0][1];
			dice[0][1] = dice[1][1];
			dice[1][1] = dice[2][1];
			dice[2][1] = dice[3][1];
			dice[3][1] = temp;

			dice[1][3] = dice[3][1];
			break;
		case 4:
			// 아래
			temp = dice[3][1];
			dice[3][1] = dice[2][1];
			dice[2][1] = dice[1][1];
			dice[1][1] = dice[0][1];
			dice[0][1] = temp;

			dice[1][3] = dice[3][1];
			break;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		// 세로 N 가로 M
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map = new int[N][M];

		// 주사위 현재 위치
		x = Integer.parseInt(st.nextToken());
		y = Integer.parseInt(st.nextToken());

		dice = new int[4][4];

		// K 번 이동
		int K = Integer.parseInt(st.nextToken());

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());

			}
		}

		if (map[x][y] > 0) {
			dice[1][3] = map[x][y]; // 주사위 밑 값 초기값
			dice[3][1] = map[x][y];
		}

		// -----------------------입력 끝 ----------------------------
		st = new StringTokenizer(br.readLine());
		while (K-- > 0) {
			int n = Integer.parseInt(st.nextToken());
			
			// 주사위 이동
			switch (n) {
			case 1:
				if (y + 1 >= M) {
					continue;
				}
				y++;
				break;
			case 2:
				if (y - 1 < 0) {
					continue;
				}
				y--;
				break;
			case 3:
				if (x - 1 < 0) {
					continue;
				}
				x--;
				break;
			case 4:
				if (x + 1 >= N) {
					continue;
				}
				x++;
				break;
			}
			moveDice(n);
			
			
			
			if (map[x][y] > 0) {
				dice[1][3] = map[x][y];
				dice[3][1] = dice[1][3];
				map[x][y] = 0;
			} else if (map[x][y] == 0) {
				map[x][y] = dice[1][3];
			}
		
			sb.append(dice[1][1]).append("\n");
			// 주사위 밑면 값 & 좌표 값 비교 0인 값

		}
		System.out.println(sb);
	}
}