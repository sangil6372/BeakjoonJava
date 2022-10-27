package b2566;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] list = new int[10][10];
		int max = 0;
		int maxI = 1, maxJ = 1;
		
		for (int i =1;i<10;i++) {
			for (int j =1;j<10;j++) {
				list[i][j] = sc.nextInt();
				if (list[i][j]>max) {
					maxI = i;
					maxJ = j;
					max = list[i][j];
				}
			}
		}
		System.out.println(max);
		System.out.println(maxI + " " + maxJ);
	
		sc.close();
	}
}

