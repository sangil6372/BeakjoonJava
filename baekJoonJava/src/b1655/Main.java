package b1655;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		PriorityQueue<Integer> minQueue = new PriorityQueue<>((o1, o2) -> o1 - o2);
		PriorityQueue<Integer> maxQueue = new PriorityQueue<>((o1, o2) -> o2 - o1); // 람다식 이용해서 new Comparator 정의

		int N = Integer.parseInt(bReader.readLine());

		while (N-- > 0) {
			int m = Integer.parseInt(bReader.readLine());

			if (maxQueue.size() == minQueue.size()) {
				maxQueue.offer(m);

			} else {
				minQueue.offer(m);

			}
			if (!minQueue.isEmpty()&&!maxQueue.isEmpty()) {
				if (minQueue.peek()<maxQueue.peek()) {
					int tmp;
					tmp = minQueue.poll();
					minQueue.offer(maxQueue.poll());
					maxQueue.offer(tmp);
				}
			}
			sb.append(maxQueue.peek()+ "\n");
		}
		System.out.println(sb);

	}
}
