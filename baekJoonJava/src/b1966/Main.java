package b1966;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		while (t-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();

			Queue<int[] > queue = new LinkedList<>();
			PriorityQueue<Integer> pQueue = new PriorityQueue<>((o1, o2) -> o2 - o1);


			for (int i = 0; i < n; i++) {
				int num = sc.nextInt();
				int [] arr = { i, num };

				queue.add(arr);
				pQueue.add(num);
			}
			int cnt = 1;
			while (cnt>0) {
				
				// 큐의 첫번째가 가장 큰 값이 아니면 뒤로 보내기 
				if (queue.peek()[1] != pQueue.peek()) {
					queue.add(queue.poll());
					
				}
				// 첫번째가 가장큰 값이면
				else {
					// 그 값이 원하던 값인지 확인하고 제거해 가면서 순서 새기
					if (queue.peek()[0] == m) {
						System.out.println(cnt);
						cnt = 0;
					}
					else {
						pQueue.remove();
						queue.remove();
						cnt++;
					}
				}

			}
		}
		sc.close();
	}

}
