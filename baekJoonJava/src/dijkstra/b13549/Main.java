package dijkstra.b13549;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static int[] dist;
	final static int INF = 200000000;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		dist = new int[100001];
		Arrays.fill(dist, INF);
		
		dist[N] = 0;
		
		sc.close();
	}

	public static void dijkstra() {
		
		
		
		
	}
	
}
