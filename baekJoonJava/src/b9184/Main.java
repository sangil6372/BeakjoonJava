package b9184;

import java.util.Scanner;

public class Main {
	
	static int[][][] dp = new int[51][51][51];
	
	public static int w_recurse(int a, int b, int c) {
		
		
		if(a<=0||b<=0||c<=0) {
			return 1;
		}
		if (dp[a][b][c]!=0) return dp[a][b][c];
		
		else if (a>20||b>20||c>20) {
			dp[a][b][c] = w_recurse(20, 20, 20);
		}
		else if (a<b&&b<c) {
			dp[a][b][c] = w_recurse(a, b, c-1) + w_recurse(a, b-1, c-1) - w_recurse(a, b-1, c);
		}
		else dp[a][b][c] =  w_recurse(a-1, b, c) + w_recurse(a-1, b-1, c) + w_recurse(a-1, b, c-1) - w_recurse(a-1, b-1, c-1);
		return dp[a][b][c];
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		
		dp[0][0][0] = 1;
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		while (a!=-1||b!=-1||c!=-1) {
			System.out.print("w(" + a + ", " + b + ", " + c + ") = ");
			System.out.println(w_recurse(a, b, c));
			
			
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
		}
		

	}

}
