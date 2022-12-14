package greedyExample.b13305;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		long[] wayArr = new long[N - 1];
		long[] priceArr = new long[N];

		long price = 0;
		
		for (int i = 0; i < N - 1; i++) {
			wayArr[i] = sc.nextLong();
		}
		for (int i = 0; i < N; i++) {
			priceArr[i] = sc.nextLong();
		
		}
		for (int i = 1; i < N; i++) {
			if (priceArr[i]>priceArr[i-1]) priceArr[i] = priceArr[i-1];			
		}
		
		
		
		for (int i = 0; i < N-1; i++) {
			price += wayArr[i]*priceArr[i];
			
			
		}
		System.out.println(price);
		sc.close();
	}
}
