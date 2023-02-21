package easy.b5532;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int result = sc.nextInt();

		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		int b1 = sc.nextInt();
		int b2 = sc.nextInt();

		 result -= Math.max((a1%b1>0)?a1/b1+1:a1/b1,(a2%b2>0)?a2/b2+1:a2/b2);		
		
		System.out.println(result);
		
		sc.close();
	}
}
