package b1010;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int rep = sc.nextInt();
		int n,m;
		int[][] tr = new int[31][31];
		
		for (int i =0;i<31;i++) {
			for (int j =0;j<=i;j++) {
				if (i==j||j==0) tr[i][j] = 1;
				else tr[i][j] = tr[i-1][j-1]+tr[i-1][j];
			}
		}
		
		for (int i =0;i<rep;i++) {
			n = sc.nextInt();
			m = sc.nextInt();
		
			System.out.println(tr[m][n]);
		}
			
		sc.close();
	}
}
