package greedyExample.b11047;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		
		Stack<Integer> stack = new Stack<>();
		
		
		int N = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		while (N-->0) {
			stack.push(Integer.parseInt(br.readLine()));
		}
		int cnt = 0;
		while (k>0) {
			int num = stack.pop();
			if (k>=num) {
				cnt += k/num;
				k%=num;
			}
		}
		System.out.println(cnt);
		
	}

}
