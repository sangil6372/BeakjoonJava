package b1932;

import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		//일단 배열 생성
		int[][] arr = new int[n+1][n+1];
		
		for (int i=1;i<=n;i++) {
			for (int j=1;j<=i;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		//배열 축소 
		for (int i=n-1;i>=1;i--) {
			for (int j=1;j<=i;j++) {
				arr[i][j] += +Math.max(arr[i+1][j], arr[i+1][j+1]);
			}
		}
		
		System.out.println(arr[1][1]);
		
		sc.close();
	}

}
