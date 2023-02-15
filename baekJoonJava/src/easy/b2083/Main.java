package easy.b2083;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name = sc.next();
		int age = sc.nextInt();
		int weight = sc.nextInt();
		
		while(!name.equals("#")||age!=0||weight!=0) {
			System.out.print(name+ " ");
			if (age>17||weight>=80) {
				System.out.println("Senior");
			}else {
				System.out.println("Junior");
			}
			name =sc.next();
			age = sc.nextInt();
			weight = sc.nextInt();
		}
		sc.close();
	}
}
