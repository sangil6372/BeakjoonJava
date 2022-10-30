package b2609;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int a1 = (n>m?n:m);
		int a2 = (n>m?m:n);
		
		
		for (int i =a2 ;i>0;i--){
			if (n%i==0&&m%i==0) {
				System.out.println(i);
				break;
			}
		}
		for (int i = a1; i<=n*m;i++) {
			if (i%n==0&&i%m==0) {
				System.out.println(i);
				break;
			}
		}
		
		sc.close();
	}

}
