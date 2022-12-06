package b11866;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int N = sc.nextInt();
		int K = sc.nextInt();

		Queue<Integer> queue = new LinkedList<>();
		
		//초기 값 세팅
		for (int i = 1; i<=N;i++) {
			queue.add(i);
		}
		
		sb.append("<");
		while(queue.size()>1) {
			for (int i = 0;i<K-1;i++) {
				queue.add(queue.poll());
			}
			sb.append(queue.poll() + ", ");
		}
		sb.append(queue.poll() + ">");
		
		System.out.println(sb);
	}

}
