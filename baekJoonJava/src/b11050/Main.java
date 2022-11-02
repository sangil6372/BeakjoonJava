package b11050;

import java.util.Scanner;

public class Main {
	 
	public static int factorial(int n) {
		int result = 1;
		while(n>1) {
			result*=n;
			n-=1;
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in );
		
		int n = sc.nextInt();
		int m = sc. nextInt();
		
		System.out.println(factorial(n)/(factorial(n-m)*factorial(m)));
		
		sc.close();
	}

}
