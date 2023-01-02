package backTracking.b9563;

import java.util.Scanner;

public class Main {

	static int[] graph,arr;
	static int N;
	static int count = 0;

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		graph = new int[N];
		
		backTracking(0);
		
		System.out.println(count);

		
		
		sc.close();
	}

	public static void backTracking(int depth) {
		
		if (depth == N) {
			count++;
			return;
		}
	
		
		for (int i = 0; i < N; i++) {
			
			graph[depth] = i; 
			
			if (possibility(depth)) {
				backTracking(depth+1);
			}
		}

	}
	
	public static boolean possibility(int col) {
		
		for (int i = 0;i<col;i++) {
			if (graph[i] == graph[col]) return false;
			
			else if (Math.abs(i-col)== Math.abs(graph[i]- graph[col])) return false;
		}
		return true;
		
	}

}
