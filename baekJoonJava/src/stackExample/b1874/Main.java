package stackExample.b1874;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb = new StringBuilder();

		Stack<Integer> stack = new Stack<>();
		Queue<Integer> queue = new LinkedList<>();

		int N = Integer.parseInt(br.readLine());

		
		for (int i = 0; i < N; i++) {
			queue.add(Integer.parseInt(br.readLine()));
		}

		int i = 0;
		while (N --> 0) {
			
			int value = queue.poll();
			
			
			if (value>i) {
				for (int j=i+1;j<=value;j++) {
					stack.push(j);
					sb.append("+\n");
				}
				i = value;
			}
			else if (stack.peek() != value) {
				System.out.println("NO");
				System.exit(0);
			}
			stack.pop();
			sb.append("-\n");
			
			
			
			
		}
		System.out.println(sb);
		
	}
}
