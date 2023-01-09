package divideAndConquer.b1629;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		

		int[][] arr = new int[a][b];
		int[][] arr2 = new int[c][d];
		
		
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				arr[i][j] =sc.nextInt();
			}
		}
		
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		for (int i = 0; i < c; i++) {
			for (int j = 0; j < d; j++) {
				arr2[i][j] =sc.nextInt();
			}
		}
		
		
		

		sc.close();
	}

}
