package b11403;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int arr[][] = new int[N+1][N+1];
		
		for (int i = 1;i<N+1;i++) {
			for (int j = 1;j<N+1;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 1;i<N+1;i++) {
			for (int j = 1;j<N+1;j++) {
				for (int k = 1;k<N+1;k++) {
					if (arr[j][i]==1&&arr[i][k]==1) arr[j][k] = 1; 
				}
			}
		}
		
		for (int i = 1;i<N+1;i++) {
			for (int j = 1;j<N+1;j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
