package SW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class b15686 {

	static int[][] city;
	static int N;
	static int[][] dist; // 각 집에서 거리 측정
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		// 첫째 줄에 N(2 ≤ N ≤ 50)과 M(1 ≤ M ≤ 13)이 주어진다.
		N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		city = new int[N + 1][N + 1];

		// 둘째 줄부터 N개의 줄에는 도시의 정보가 주어진다.
		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			// 도시의 정보는 0, 1, 2로 이루어져 있고, 0은 빈 칸, 1은 집, 2는 치킨집을 의미한다.
			for (int j = 1; j <= N; j++) {
				city[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		// 집의 개수는 2N개를 넘지 않으며, 적어도 1개는 존재한다. 치킨집의 개수는 M보다 크거나 같고, 13보다 작거나 같다.

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {

				// 각 치킨집 마다 치킨거리 계산 -> 우선 순위 큐에 저장해서 M개를 빼고 더할까?
				if (city[i][j] == 1) {
				}
			}
		}

		int sum = 0;
		while (M-- > 0) {
			sum += pQueue.poll();
		}
		System.out.println(sum);

	}

}
