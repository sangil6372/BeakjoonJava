package easy.b9086;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		while (N-->0) {
			String[] s = sc.next().split("");
			System.out.println(s[0] + s[s.length-1]);
			
		}
		
		sc.close();
	}

}
