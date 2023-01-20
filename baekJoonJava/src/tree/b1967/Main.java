package tree.b1967;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class Main {

	static int N;
	static int[] visited;
	static int max = 0;
	static int maxNode;
	
	
	static ArrayList<ArrayList<Node>> nodes;

	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		N = Integer.parseInt(br.readLine());
		
		nodes = new ArrayList<>();
		for (int i =0;i<=N;i++) {
			nodes.add(new ArrayList<>());
		}
		
		for (int i = 0;i<N-1;i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int weight = Integer.parseInt(st.nextToken());
			
			nodes.get(start).add(new Node(end,weight));
			nodes.get(end).add(new Node(start,weight));
			
		}
		// 그래프 채워넣기
		
		visited = new int[N+1];
		dfs(1,0);
		
		visited = new int[N+1];
		dfs(maxNode,0);
		System.out.println(max);
		
		
		
	}
	public static class Node{
		int end;
		int weight;
		
		public Node(int end, int weight) {
			this.end = end;
			this.weight = weight;
		}
		
		
	}
	
	
	public static void dfs(int v, int len) {
		visited[v] = 1;
		
		if (max<len) {
			max = len;
			maxNode = v;
		}
		
		for (Node n : nodes.get(v)) {
			if (visited[n.end]==0) {
				dfs(n.end, len+n.weight);
			}
		}
		
		
		
		return;
	}

}
