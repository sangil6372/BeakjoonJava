package b2563;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] list = new int[100][100];
		int rep = sc.nextInt();
		int n,m;
		int maxN,maxM;
		int area = 0;
		
		maxN = maxM = 0;
		
		for (int i =0;i<rep;i++) {
			n = sc.nextInt();
			m = sc.nextInt();
			if (n>maxN) maxN = n;
			if (m>maxM) maxM = m;
			for (int j =0;j<10;j++) {
				for (int k =0;k<10;k++) {
					list[n+j][m+k]++;
				} 
			}			
		}
		for (int i =0 ;i<maxN+10;i++) {
			for (int j =0;j<maxM+10;j++) {
				if (list[i][j] > 0) {
					area++;
				}
				
			}
			
		}
		System.out.println(area);
		
	}

}
