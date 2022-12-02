package b11279;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(); 
		
		int N = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> pQueue = new PriorityQueue<>(new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				if (o1==o2) return 0;
				else if (o1 > o2) return -1;
				else return 1;
			}});
		
		while (N-- > 0) {
			int token = Integer.parseInt(br.readLine());
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