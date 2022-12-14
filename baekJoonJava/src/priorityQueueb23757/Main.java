package priorityQueueb23757;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		PriorityQueue<Integer> pQueueBox = new PriorityQueue<>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		while (N-- > 0) {
			pQueueBox.add(Integer.parseInt(st.nextToken()));
		}
		st = new StringTokenizer(br.readLine());
		while (M-->0) {
			int child = Integer.parseInt(st.nextToken());
			if (pQueueBox.peek() >= child) {
				pQueueBox.add(pQueueBox.poll() - child);
			}
			else {
				System.out.println(0);
				System.exit(0);
			}

		}
		System.out.println(1);
	
	}

}
