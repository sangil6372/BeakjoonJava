package graph.b24444;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	static int N;
	static int[] visited;
	static ArrayList<ArrayList<Integer>> graph;
	static int[] vertexOrder;
	static int count = 1;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());

		graph = new ArrayList<>();
		visited = new int[N+1];
		vertexOrder = new int[N+1];
		
		for (int i = 0; i <= N; i++) {
			graph.add(new ArrayList<>());
		}

		while (M-- > 0) {
			st = new StringTokenizer(br.readLine());
			int v1 = Integer.parseInt(st.nextToken());
			int v2 = Integer.parseInt(st.nextToken());

			graph.get(v1).add(v2);
			graph.get(v2).add(v1);
		}
		
		for (int i = 1; i <= N; i++) {
			Collections.sort(graph.get(i), new Comparator<Integer>() {

				@Override
				public int compare(Integer o1, Integer o2) {
					return o2-o1;
				}
			});
		}
		
		bfs(R);
		

		for (int i = 1; i <= N; i++) {
			System.out.println(vertexOrder[i]);
		}
		
		
	}
	
	public static void bfs(int v) {
		
		Queue<Integer> queue = new LinkedList<>();
		queue.add(v);
		visited[v] = 1;
		
		while (!queue.isEmpty()) {
			
			int peek = queue.poll();
			vertexOrder[peek] = count++;
			
			for(int vertex : graph.get(peek)) {
				if (visited[vertex]==0) {
					queue.add(vertex);
					visited[vertex] = 1;
				}
			}
			
			
			
			
		}
		
		
		
		
		
	}

}
