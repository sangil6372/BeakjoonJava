package b5597;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] list = new int[31];
		int input;
		
		for (int i =0;i<28;i++) {
			input = sc.nextInt();
			list[input] = 1;
		}
		for (int i =1;i<list.length;i++) {
			if (list[i]== 0) System.out.println(i);
		}
		
		sc.close();
	}
}
