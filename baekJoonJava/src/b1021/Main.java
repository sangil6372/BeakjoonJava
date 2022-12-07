package b1021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		LinkedList<Integer> deque = new LinkedList<>();

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		for (int i = 1; i <= N; i++) {
			deque.add(i);
		}

		int halfIndex;
		int cnt = 0;
		st = new StringTokenizer(br.readLine());
		for (int i = 0;i<M;i++) {
			
			if (N%2==0) {
				halfIndex = N/2;
			}else {
				halfIndex = N/2 +1;
			}
			
			
			int num = Integer.parseInt(st.nextToken());
			
			int findIndex = deque.indexOf(num) + 1;
			
			
			while (deque.peekFirst()!=num) {
				
				if (findIndex<=halfIndex){
					cnt++;
					deque.addLast(deque.pollFirst());
				}
				else {
					cnt++;
					deque.addFirst(deque.pollLast());
				}
			}
			
			deque.removeFirst();
			N -= 1;
			
			
		
			
		}
		System.out.println(cnt);
	}
}
