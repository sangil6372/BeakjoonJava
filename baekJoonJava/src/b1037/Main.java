package b1037;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i =0;i<n;i++) {
			list.add(sc.nextInt());
		}
		
		Collections.sort(list);

		
		System.out.println(
				list.get(0)*list.get(n-1));
	}

}
