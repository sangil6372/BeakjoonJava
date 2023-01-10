package graph.b11725;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static int V;
	static int[] parents;
	static ArrayList<ArrayList<Integer>> nodes;
	static int[] visited;

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		V = sc.nextInt();

		nodes = new ArrayList<>();
		parents = new int[V + 1]; // 1부터 V노드 까지 각자의 parent 저장
		visited = new int[V + 1];

		for (int i = 0; i < V + 1; i++) {
			nodes.add(new ArrayList<>());
			visited[i] = 0;
		}

		for (int i = 0; i < V - 1; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			// 양 방향 연결
			nodes.get(a).add(b);
			nodes.get(b).add(a);
		}

		findParent(1);

		for (int i = 2; i <= V; i++) {
			System.out.println(parents[i]);
		}

		sc.close();
	}

	// p = 1;
	public static void findParent(int p) {
		for (int n : nodes.get(p)) {
			if (visited[n] == 0) {
				visited[n]++;
				parents[n] = p;
				findParent(n);
			}
		}
		return;
	}

}
