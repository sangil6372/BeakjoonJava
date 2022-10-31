package b1934;

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int reps = sc.nextInt();
		int n,m;
		int tmp;
		int x;
		int result;
		
		for( int i =0;i<reps;i++) {
			n = sc.nextInt();
			m = sc.nextInt();
			result = n*m;
			
			if (m>n) {
				tmp  = n;
				n = m;
				m = tmp;
			}
			
			x = n%m;
			while(x>0) {
				n = m;
				m = x;
				x = n%m;
			}
			
			System.out.println(result/m);
		}
		
	}

}
