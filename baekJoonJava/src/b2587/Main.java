package b2587;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int[] list = new int[5];
		int sum = 0;
		
		for(int i =0;i<5;i++) {
			list[i] = sc.nextInt();
			sum+=list[i];
		}
		
		Arrays.sort(list);
		System.out.println(sum/5 + " " + list[2]);

		sc.close();
	}
}
