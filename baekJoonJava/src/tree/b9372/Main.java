package tree.b9372;

import java.util.Scanner;

public class Main {
	
	static int[][] plane;
	static boolean[] visited;
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 첫 번째 줄에는 테스트 케이스의 수 T(T ≤ 100)가 주어지고,
		int T = sc.nextInt();
		
		while (T-->0) {
			// 첫 번째 줄에는 국가의 수 N(2 ≤ N ≤ 1 000)과 비행기의 종류 M(1 ≤ M ≤ 10 000) 가 주어진다.
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			plane = new int[N+1][N+1];
			visited = new boolean[N+1];
			
			// 이후 M개의 줄에 a와 b 쌍들이 입력된다.
			while (M-->0) {
				int a = sc.nextInt();
				int b = sc.nextInt(); //  (1 ≤ a, b ≤ n; a ≠ b) 
				
				// a - b 양방향 연결 그래프 필요 array? 
				plane[a][b] = 1;
				plane[b][a] = 1;
				
			
				// 주어지는 비행 스케줄은 항상 연결 그래프를 이룬다.
			}
			
			// 상근이가 모든 국가를 여행하기 위해 타야 하는 비행기 종류의 최소 개수를 출력한다.
			System.out.println(N-1);
		}
		
	}

}
