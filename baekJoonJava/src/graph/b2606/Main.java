package graph.b2606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	static int N;
	static int[] visited;
	static ArrayList<ArrayList<Integer>> graph;
	
	static int count = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		

		N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		
		int R = 1;
		
		graph = new ArrayList<>();
		visited = new int[N+1];
		
		for (int i = 0; i <= N; i++) {
			graph.add(new ArrayList<>());
		}
		StringTokenizer st;
		while (M-- > 0) {
			st = new StringTokenizer(br.readLine());
			int v1 = Integer.parseInt(st.nextToken());
			int v2 = Integer.parseInt(st.nextToken());

			graph.get(v1).add(v2);
			graph.get(v2).add(v1);
		}
		
		for (int i = 1; i <= N; i++) {
			Collections.sort(graph.get(i));

			
		}
		
		bfs(R);
		

		
		System.out.println(count);
		
	}
	
	public static void bfs(int v) {
		
		Queue<Integer> queue = new LinkedList<>();
		queue.add(v);
		visited[v] = 1;
		
		while (!queue.isEmpty()) {
			
			int peek = queue.poll();
			
			
			for(int vertex : graph.get(peek)) {
				if (visited[vertex]==0) {
					queue.add(vertex);
					visited[vertex] = 1;
					count++;
				}
			}
			
			
			
			
		}
		
		
		
		
		
	}

}
