package SW.b20057;

import java.util.Scanner;

public class Main {

	static int[] dr = { 0, -1, 0, 1 }; // 0 1 2 3 좌 하 우 상
	static int[] dc = { -1, 0, 1, 0 };
	static int[][] sandMap;
	static int N, outSand = 0;

	// 서 남 동 북 으로 이동시 모래가 흩날리는 방향 밑 비율

	static int[][] spreadX = {

	};
	static int[][] spreadY = {

	};

	static int[] percent = {
			
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 3 ≤ N ≤ 499 N은 홀수
		N = sc.nextInt();
		sandMap = new int[5][5];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				sandMap[i][j] = sc.nextInt();
			}
		}
		int r = N / 2;
		int c = N / 2;

		int dist = 0;
		while (r >= 0 && r < N && c >= 0 && c < N) {
			dist++;
			for (int i = 0; i < 4; i++) {
				if (i == 2)
					dist++;
				tornado(r, c, i, dist);
			}

		}

	}

	public static void tornado(int r, int c, int dir, int dist) {
		int x = r;
		int y = c;

		switch (dir) {

		case 0, 2:
		case 1, 3:

		}

		int d = dist;
		while (dist-- > 0) { // dist번 이동
			if (x < 0 || x >= N || y < 0 || y >= N) {
				outSand += 1;
			}
		}
	}

	public void sideEffect(int r, int c, int dir) {

		for (int i = 0; i < 9; i++) {
				
		}

	}

}
