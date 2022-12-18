package b10845;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Deque<Integer> queue = new LinkedList<>();
		
		
		
		int n = Integer.parseInt(st.nextToken());
		
		while(n-->0) {
			st = new StringTokenizer(br.readLine());
			
			String order = st.nextToken();
			
			if (order.equals("push")) {
				queue.add(Integer.parseInt(st.nextToken()));
				
			}
			else if (order.equals("pop")) {
				if (queue.isEmpty()) {
					System.out.println("-1");
				}
				else System.out.println(queue.poll());
			}
			else if (order.equals("size")) {
				System.out.println(queue.size());
			}
			else if (order.equals("empty")) {
				if (queue.isEmpty()) {
					System.out.println("1");
				}else {
					System.out.println("0");
				}
			}
			else if (order.equals("front")) {
				if (queue.isEmpty()) {
					System.out.println("-1");
				}
				else System.out.println(queue.peek());
			}
			else if (order.equals("back")) {
				if (queue.isEmpty()) {
					System.out.println("-1");
				}
				else System.out.println(queue.peekLast());
			}
			
			
			
		}
		

	}

}
