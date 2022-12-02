package b11286;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		PriorityQueue<Integer> pQueue = new PriorityQueue<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				if (Math.abs(o1)==Math.abs(o2)) {
					if (o1==o2) return 0;
					else if (o1<o2) return -1;
					else return 1;
				}
				else if (Math.abs(o1)<Math.abs(o2)) return -1;
				else return 1;
		
			}
		
		});
		
		int N = Integer.parseInt(bReader.readLine());
		
		while (N-- > 0) {
			int token = Integer.parseInt(bReader.readLine());
			if (token == 0) {
				if (pQueue.size()==0) {
					sb.append(0 + "\n");
				}else {
					sb.append(pQueue.poll() + " \n");
				}
			}else {
				pQueue.add(token);
			}
		}
		System.out.println(sb);

	}

}
