package b11051;

import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] tr = new int[n+1][n+1];
		
		for (int i =0;i<n+1;i++) {
			for (int j =0;j<=i;j++) {
				if (i==j||j==0) tr[i][j] = 1;
				else tr[i][j] = tr[i-1][j-1]+tr[i-1][j];
			}
		}
		System.out.println(tr[n][m]%10007);
		
		
	}
}
