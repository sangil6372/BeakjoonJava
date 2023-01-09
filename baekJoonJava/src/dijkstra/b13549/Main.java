package dijkstra.b13549;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	static int[] visited;
	static int[] arr;
	static int K;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		K = sc.nextInt();

		arr = new int[100001];
		visited = new int[100001];

		if (N == K) {
			System.out.println("0");
		} else {

			bfs(N);
			System.out.println(arr[K]);
		}
		sc.close();
	}

	public static void bfs(int start) {

		Deque<Integer> queue = new LinkedList<>();
		visited[start] = 0;
		queue.addFirst(start);

		while (!queue.isEmpty()) {

			int cur = queue.pollFirst();

			if (arr[K] != 0)
				return;

			if (cur * 2 >= 0 && cur * 2 <= 100000) {
				if (visited[2 * cur] == 0) {
					visited[2 * cur]++;
					arr[2 * cur] = arr[cur] ;
					queue.addFirst(2 * cur);
				}
			}
			
			if (cur - 1 >= 0 && cur - 1 <= 100000) {
				if (visited[cur - 1] == 0) {
					visited[cur - 1]++;
					arr[cur - 1] = arr[cur] + 1;
					queue.addLast(cur - 1);
				}
			}

			if (cur + 1 >= 0 && cur + 1 <= 100000) {
				if (visited[cur + 1] == 0) {
					visited[cur + 1]++;
					arr[cur + 1] = arr[cur] + 1;
					queue.addLast(cur + 1);
				}
			}

		}

	}

}
