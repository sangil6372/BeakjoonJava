package b2738;

import java.util.Scanner;

public class Main {
	
	
	public static void sumList(int[][] listA, int[][] listB, int N, int M) {
		
		for (int i=0;i<N;i++) {
			for (int j=0;j<M;j++) {
				 System.out.print(listA[i][j]+listB[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int N,M;
		N = sc.nextInt();
		M = sc.nextInt();
		
		int[][] listA = new int[100][100];
		int[][] listB = new int[100][100];

		for (int i=0;i<N;i++) {
			for (int j=0;j<M;j++) {
				listA[i][j] = sc.nextInt();
			}
		}
		for (int i=0;i<N;i++) {
			for (int j=0;j<M;j++) {
				listB[i][j] = sc.nextInt();
			}
		}
		
		Main.sumList(listA, listB, N, M);
		
		sc.close();
	}

}
