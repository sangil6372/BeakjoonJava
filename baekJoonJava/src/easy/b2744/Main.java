package easy.b2744;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		String str = sc.next();
		
		for (int i = 0; i<str.length();i++) {
			char c = str.charAt(i);
			if ('a'<=c&&c<='z')
				sb.append((char)(c-'a'+'A'));
			else if ('A'<=c&&c<='Z')
				sb.append((char)(c-'A'+'a'));
		}
		System.out.println(sb);
		
		sc.close();
	}
}
