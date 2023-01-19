package tree.b1167;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	static ArrayList<ArrayList<Node>> nodes;
	static int[] visited;
	static int INF = 9999999;
	static int max =0;
	static int N;
	static int maxNode;
	
	
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		N = Integer.parseInt(br.readLine());
		
		// 노드와 
		nodes = new ArrayList<>();

		// 노드와
		for (int i = 0; i <= N; i++) {
			nodes.add(new ArrayList<>());
		}
		
		// N줄에 걸쳐서 입력 받음 
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			// 첫 숫자 버리기
			int start = Integer.parseInt(st.nextToken());
			while (true) {
				int end = Integer.parseInt(st.nextToken());
				if (end == -1)
					break;
				int weight = Integer.parseInt(st.nextToken());

				nodes.get(start).add(new Node(end, weight));   
			}
		}
		// 그래프 채워넣음
	
		
		
		
		visited = new int[N+1];
		dfs(1,0);
		
		visited = new int[N+1];
		dfs(maxNode,0);
		
		System.out.println(max);
		
		
	}
	
	// 다음 노드의 숫자가 값을 가지고 있는 노드 클래스 
	public static class Node {
		int end;
		int weight;

		public Node(int end, int weight) {
			this.end = end;
			this.weight = weight;
		}

	}

	public static void dfs(int v, int len) {
		visited[v] = 1;
		
		if (len>max) {
			max = len;
			maxNode = v;
		}
		
			
		for (Node n : nodes.get(v)) {
			
			if (visited[n.end]==0) {
				len += n.weight;
				
				dfs(n.end, len);
				
				len-=n.weight;
			}
			
			
		}
		return ;
	}

}
