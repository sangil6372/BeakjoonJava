package dijkstra.b1504;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	static ArrayList<ArrayList<Node>> graph;
	static int N;
	static int[] dist; // dist 계쏙해서 갱신할 것임
	final static int INF = 200000000;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		graph = new ArrayList<>();

		N = Integer.parseInt(st.nextToken());
		int E = Integer.parseInt(st.nextToken());
		
		dist = new int[N+1];
		
		for (int i =0;i<N+1;i++) {
			graph.add(new ArrayList<>());
		}
		
		while (E-- > 0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			graph.get(a).add(new Node(b,c));    // a<->b 가중치 c 방향성 없으
			graph.get(b).add(new Node(a,c));
		}
		
		st = new StringTokenizer(br.readLine());
		int v1 = Integer.parseInt(st.nextToken());
		int v2 = Integer.parseInt(st.nextToken());
		
		int way1 = INF;
		int way2 = INF;
		
		Arrays.fill(dist, INF);
		dijkstra(1);
		way1=dist[v1];		// 1->v1  == 3
		way2=dist[v2];		// 1->v2  == 5
		
		
		
		Arrays.fill(dist, INF);
		dijkstra(v1);
		way1+=dist[v2];		// 1->v1->v2 == 6
		way2+=dist[N]; 		// 1->v2 ==5   v1->4  ==4


		
		Arrays.fill(dist, INF);
		dijkstra(v2);
		way1+= dist[N];		//1->v1->v2->4
		way2+= dist[v1];	//1->v2->v1->4

		
		
		if (way1>=INF&&way2>=INF) System.out.println("-1");
		else System.out.println(Math.min(way1,way2));
		
		
		
		

	}

	public static class Node {
		int end, weight;

		public Node(int end, int weight) {
			this.end = end;
			this.weight = weight;
		}
	}

	public static void dijkstra(int start) {
		PriorityQueue<Node> queue = new PriorityQueue<>(new Comparator<Node>() {

			@Override
			public int compare(Node o1, Node o2) {
				return o1.weight - o2.weight;
			}
		});
		
		dist[start] = 0;
		queue.add(new Node(start, 0));
		
		while (!queue.isEmpty()) {
			Node curNode = queue.poll();

			if (curNode.weight>dist[curNode.end]) continue;

			
			for (Node n : graph.get(curNode.end)) {
				if (dist[n.end] > curNode.weight + n.weight) {
					dist[n.end] = curNode.weight + n.weight;
					queue.add(new Node(n.end, dist[n.end]));
				}
			}

		}

	}

}
