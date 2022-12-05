package b11478;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		String arr = sc.next();
		
		HashSet<String> set = new HashSet<>(); //중복 제거를 위한 set
		
		for (int i = 0;i<arr.length();i++) {
			String name = "";
			for(int j = i ; j<arr.length();j++) {
				name += arr.substring(j,j+1);
				set.add(name);
			}
			
		}
		System.out.println(set.size());
		
		sc.close();
	}
}
