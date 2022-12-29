package graph.b1697;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static int N, K;
	public static int[] visited;
	public static int[] nextPeek = new int[3];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		visited = new int[100001];

		N = sc.nextInt();
		K = sc.nextInt();

		if (N == K)
			System.out.println("0");
		else {
			bfs(N);
		}
		sc.close();
	}

	public static void bfs(int v) {
		visited[v] = 1;

		Queue<Integer> queue = new LinkedList<>();
		queue.add(v);

		while (!queue.isEmpty()) {

			int peek = queue.poll();

			nextPeek[0] = peek - 1;
			nextPeek[1] = peek + 1;
			nextPeek[2] = peek * 2;

			for (int i = 0; i < 3; i++) {
				if (nextPeek[i] == K) {
					System.out.println(visited[peek]);
					return;
				}

				if (nextPeek[i] >= 0 && nextPeek[i] <= 100000) {
					if (visited[nextPeek[i]] == 0) {
						queue.add(nextPeek[i]);
						visited[nextPeek[i]] = visited[peek] + 1;
					}
				}
			}

		}

	}

}
