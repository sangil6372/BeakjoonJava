package stackExample.b10773;

import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>();
		
		
		int N = sc.nextInt();
		
		while (N-->0) {
			int m = sc.nextInt();
			if (m!=0) {
				stack.push(m);
			}
			else {
				stack.pop();
			}
		}
		int sum = 0;
		for (int i : stack) {
			sum+=i;
		}
		
		System.out.println(sum);
		
	}

}
