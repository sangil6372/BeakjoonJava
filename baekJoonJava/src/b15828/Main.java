package b15828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		Queue<Integer> queue = new LinkedList<>();
		
		while(true) {
			int buffer = Integer.parseInt(br.readLine());
			if (buffer == -1) break;
			else if (buffer > 0 ) {
				if (queue.size()<=N) {
					queue.add(buffer);
				} continue;
			}
			else if (buffer == 0) {
				queue.poll();
			}
		}
		for (int i : queue) {
			sb.append(i + " ");
		}
		System.out.println(sb);
		
		
	}

}
