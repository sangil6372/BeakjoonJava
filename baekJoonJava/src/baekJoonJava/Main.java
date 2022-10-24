package baekJoonJava;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rep = sc.nextInt();
		int[] list = new int[100];
		
		for (int i =0;i<rep;i++) {
			list[i] = sc.nextInt();
		}
		int check = sc.nextInt();
		int sum = 0;
		
		for (int i =0;i<rep;i++) {
			if (list[i]==check) sum++;
		}
		System.out.println(sum);
		
		
		sc.close();
	}
}
