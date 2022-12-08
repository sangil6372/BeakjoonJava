package stackExample.b9012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		Stack<String> stack = new Stack<>();
		
		int N = Integer.parseInt(st.nextToken());
		
		while (N-->0) {
			
			
			String[] arr = br.readLine().split(""); 
			
			for (String s : arr) {
				stack.push(s);
			}
			
			int cnt = 0;
			
			while(!stack.isEmpty()) {
				
				String s = stack.pop();
				if (s.equals(")")) {
					cnt++;
					
				}
				else if (s.equals("(")) {
					cnt--;
					
					if (cnt<0) {
						break;
					}
				}
				
				
			}
			if (cnt==0) 
				sb.append("YES\n");
			else {
				sb.append("NO\n");
			}
			
			stack.clear();
		}
		System.out.println(sb);

	}

}
