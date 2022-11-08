package b2004;

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
	
	
	public static long check5(long n) {
		int count = 0;
		
		while(n>0) {
			count += n/5;
			n/=5;
		}
		
		return count;		
	}
	public static long check2(long n) {
		int count = 0;
		
		while(n>0) {
			count += n/2;
			n/=2;
		}
		
		return count;		
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		long n = sc.nextLong();
		long m = sc.nextLong();
		
		long count2 = check2(n) - check2(m) - check2(n-m);
		long count5 = check5(n) - check5(m) - check5(n-m);
		
		
		
		
		System.out.println(Math.min(count2, count5));
		
		sc.close();
	}

}

