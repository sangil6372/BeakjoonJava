package stackExample.b9012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		

		String[] arr = br.readLine().split("");

		while (arr.length != 1 || !arr[0].equals(".")) {
			sb.append(solve(arr));
			arr = br.readLine().split("");
		}
		System.out.println(sb);

	}
	
	public static String solve (String arr[]) {
		Stack<Character> stack = new Stack<>();
		
		
		
		for (int i = 0; i < arr.length; i++) {
			char c = arr[i].charAt(0);

			if (c == '(' || c == '[')
				stack.push(c);

			else if (c == ')') {
				if (stack.isEmpty() || stack.peek() != '(') {
					return "no\n";
				} else
					stack.pop();
			} else if (c == ']') {
				if (stack.isEmpty() || stack.peek() != '[') {
					return "no\n";
					
				} else
					stack.pop();
			}

		}
		if (stack.isEmpty()) return "yes\n";
		else return "no\n";
			
	}
	
}
