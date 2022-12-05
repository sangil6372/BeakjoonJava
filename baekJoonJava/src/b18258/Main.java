package b18258;

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
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());
		Deque<Integer> queue = new LinkedList<>();

		while (N-- > 0) {
			st = new StringTokenizer(br.readLine());
			String order = st.nextToken();
			
			switch (order) {
			case "push":
				queue.add(Integer.parseInt(st.nextToken()));
				break;
			case "pop":
				if (queue.isEmpty()) {
					sb.append(-1 + "\n");
				}else {
				sb.append(queue.poll() + "\n");
				}
				break;
			case "size":
				sb.append(queue.size() + "\n");
				break;
			case "empty":
				if (queue.isEmpty()) {
					sb.append(1 + "\n");
				}else {
					sb.append(0 + "\n");
				}
				break;
			case "front":
				if (queue.isEmpty()) {
					sb.append(-1 + "\n");
				} else {
					sb.append(queue.peekFirst() + "\n");
				}
				break;

			case "back":
				if (queue.isEmpty()) {
					sb.append(-1 + "\n");
				} else {
					sb.append(queue.peekLast() + "\n");
				}
				break;
			default:
				break;
			}
		}
		System.out.println(sb);
	}
}
