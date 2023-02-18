package easy.b2530;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hours = sc.nextInt();
		int min = sc.nextInt();
		int sec = sc.nextInt();
		
		int n= sc.nextInt();
		
		hours += n/3600;
		n%=3600;
		
		min += n/60;
		
		n%=60;
		
		sec+=n;
		if (sec>=60) {
			min+=1;
			sec-=60;
		}
		while(min>=60) {
			hours+=1;
			min-=60;
		}
		while (hours>=24) hours-=24;
		
		System.out.println(hours+" "+min+" "+sec);
		
		sc.close();
	}

}
