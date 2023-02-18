package easy.b1284;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		while(!s.equals("0")) {
			char[] charArr = s.toCharArray();
			
			int result = 2 + (charArr.length-1);
			
			for (char c : charArr) {
				if (c=='1') {
					result+=2;
				}else if(c=='0'){
					result+=4;
				}else {
					result+=3;
				}
			}
			
			System.out.println(result);
			s = sc.next();
		}
		
		sc.close();
	}

}
