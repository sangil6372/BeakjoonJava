package easy.b5596;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a,b,c,d,e,f;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		e=sc.nextInt();
		f=sc.nextInt();
		int g=sc.nextInt();
		int h=sc.nextInt();

		int result = (a+b+c+d)>(e+f+g+h)?a+b+c+d:e+f+g+h;
		System.out.println(result);
	}

}
