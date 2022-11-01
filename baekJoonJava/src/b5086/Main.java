package b5086;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1,n2;
		
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		while(n1!=0&&n2!=0) {
			if (n1 % n2 == 0) System.out.println("multiple"); 
			else if (n2 % n1 == 0) System.out.println("factor"); 
			else System.out.println("neither");
			
			n1 = sc.nextInt();
			n2 = sc.nextInt();
		}
	}
}
