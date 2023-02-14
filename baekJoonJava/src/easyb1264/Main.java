package easyb1264;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		while(!s.equals("#")) {
			s = s.toLowerCase();
			char[] charArr = s.toCharArray();
			int count = 0;
			for (char c : charArr) {
				if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
					count++;
				}
				
			}
			System.out.println(count);
			s = sc.nextLine();
		}
		
		sc.close();
	}

}
