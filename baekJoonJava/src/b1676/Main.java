package b1676;

import java.util.Scanner;

public class Main {
	
//	public static int factorial (int n) {
//		int result=1;
//		while(n>0) {
//			result *=n;
//			n-=1;
//		}
//		return result;
//	}
	
	
	
	public static int checkZero (int n) {
		int count = 0;
		
		while(n>0) {
			count += n/5;
			n/=5;
		}
		
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		
		System.out.println(checkZero(n));
		
		sc.close();
	}

}
