package graph.b12851;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static int[] visited;
	static int[] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();

		arr = new int[100001];
		visited = new int[100001];

		if (N == K) {
			System.out.println("0\n1");
		} else {

			bfs(N);

			System.out.println(arr[K]);
			System.out.println(visited[K]);
		}
		sc.close();
	}

	public static void bfs(int start) {

		Queue<Integer> queue = new LinkedList<>();
		visited[start] = 0;
		queue.add(start);

		while (!queue.isEmpty()) {

			int cur = queue.poll();

			if (cur - 1 >= 0 && cur - 1 <= 100000) {
				if (visited[cur - 1] == 0 || arr[cur - 1] == arr[cur] + 1) {
					visited[cur - 1]++;
					arr[cur - 1] = arr[cur] + 1;
					queue.add(cur - 1);
				}
			}

			if (cur + 1 >= 0 && cur + 1 <= 100000) {
				if (visited[cur + 1] == 0||arr[cur + 1] == arr[cur] + 1) {
					visited[cur + 1]++;
					arr[cur + 1] = arr[cur] + 1;
					queue.add(cur + 1);
				} 
			}

			if (cur * 2 >= 0 && cur * 2 <= 100000) {
				if (visited[2 * cur] == 0||arr[2*cur] == arr[cur] + 1) {
					visited[2 * cur]++;
					arr[2 * cur] = arr[cur] + 1;
					queue.add(2 * cur);
				} 
			}
		}

	}

}
