package b3053;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double a1 = n*n*Math.PI;
		double a2 = n*n*2;
		
		sc.close();
		
		System.out.println(a1);
		System.out.println(a2);
		
	}

}
