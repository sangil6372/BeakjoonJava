package shortestPath.b9370;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	static int n, m, t;
	static int[] dist;
	static int INF = 9999999;
	static ArrayList<ArrayList<Node>> nodes;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int K = Integer.parseInt(st.nextToken());

		// test 개수 K개
		while (K-- > 0) {
			// n m t -> 노드 수 간선 수 목적지 수
			st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
			t = Integer.parseInt(st.nextToken());

			dist = new int[n + 1];

			nodes = new ArrayList<>();
			for (int i = 0; i <= n; i++) {
				nodes.add(new ArrayList<>());
			}

			// s g h s = 출발 지 g-h 지나가는 간선 -> 출발지 하나? = 다익스트라
			st = new StringTokenizer(br.readLine());

			int s = Integer.parseInt(st.nextToken()); // 출발지 dijkstra(s)
			int g = Integer.parseInt(st.nextToken());
			int h = Integer.parseInt(st.nextToken());

			// 간선 수 입력
			while (m-- > 0) {
				st = new StringTokenizer(br.readLine());

				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				int c = Integer.parseInt(st.nextToken());

				nodes.get(a).add(new Node(b, c)); // a->b = c
				nodes.get(b).add(new Node(a, c)); // b->a = c 양방향
			}
			dijkstra(s);
			
			int way1 = dist[h] + findWeight(h, g);
			int way2 = dist[g] + findWeight(g, h);

			// 도착 후보 - dist[t] 출력 INF 경우 출력 X
			ArrayList<Integer> caseT = new ArrayList<>();
			for (int i = 0; i < t; i++) {
				int x = Integer.parseInt(br.readLine());
				 
				
				dijkstra(g); // s-> h-g + g-> dist[x]
				int dist1 = dist[x];
				way1 += dist1;

				dijkstra(h); // s-> g-h + h-> dist[x]
				int dist2 = dist[x];
				way2 += dist2;
				
				if (way1 == INF && way2 == INF)
					continue;
				
				dijkstra(s);
				if(dist[x]== Math.min(way1,way2))
					caseT.add(x);
				way1 -= dist1;
				way2 -= dist2;
			}
			Collections.sort(caseT);
			for (int c : caseT) {
				System.out.print(c+" ");
			}
			System.out.println();
		}
	}

	public static int findWeight(int a, int b) {
		for (Node n : nodes.get(a)) {
			if (n.end == b) {
				return n.weight;
			}
		}
		return INF;
	}

	public static class Node {
		int end, weight;

		public Node(int end, int weight) {
			this.end = end;
			this.weight = weight;
		}

	}

	public static void dijkstra(int start) {
		Arrays.fill(dist, INF);
		dist[start] = 0;

		PriorityQueue<Node> pQueue = new PriorityQueue<>(new Comparator<Node>() {

			@Override
			public int compare(Node o1, Node o2) {
				return o1.weight - o2.weight;
			}
		});

		pQueue.add(new Node(start, 0));

		while (!pQueue.isEmpty()) {

			Node curNode = pQueue.poll();

			// 이 조건은 아직 이해 안됨 ..
//			if (curNode.weight>dist[curNode.end]) continue;

			for (Node n : nodes.get(curNode.end)) {
				if (dist[n.end] > curNode.weight + n.weight) {
					dist[n.end] = curNode.weight + n.weight;
					pQueue.add(new Node(n.end, dist[n.end]));
				}

			}

		}

	}

}
