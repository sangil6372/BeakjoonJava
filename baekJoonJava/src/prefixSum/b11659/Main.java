package prefixSum.b11659;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] arr = new int[N+1];
		
		for (int i =1;i<=N;i++) {
			arr[i] = sc.nextInt() + arr[i-1];
		}
		
		while(M-->0) {
			int s = sc.nextInt();
			int e = sc.nextInt();
			
			System.out.println(arr[e]-arr[s-1]);
			
		}
		
	}

}
