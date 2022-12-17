package b1259;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		String str = br.readLine();
		
		while(!str.equals("0")) {
			palindrome(str);
			str = br.readLine();
		}
		
		
		
	}

	public static void palindrome(String str) {
		
		char[] ch = str.toCharArray();
		int size = ch.length;
		
		for (int i = 0;i<size/2;i++) {
			if (ch[i]!=ch[size-1-i]) {
				System.out.println("no");
				return;
			}
		}
		System.out.println("yes");
		
	}
}
