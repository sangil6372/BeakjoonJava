package b3053;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double Euclid = n*n*Math.PI;
		double taxi = n*n*2;
		
		System.out.println(String.format("%.6f", Euclid));
		System.out.println(String.format("%.6f", taxi));
		
	}
}
