package easy.b2388;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		String a,b;
		a = sc.next();
		b = sc.next();
		
		BigInteger bigInteger1 = new BigInteger(a);
		BigInteger bigInteger2 = new BigInteger(b);
		

		
		System.out.println(bigInteger1.add(bigInteger2));
		System.out.println(bigInteger1.subtract(bigInteger2));
		System.out.println(bigInteger1.multiply(bigInteger2));
		
	
		sc.close();
	}

}
