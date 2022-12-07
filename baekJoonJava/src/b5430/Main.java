package b5430;

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

		LinkedList<Integer> queue = new LinkedList<>();

		int N = Integer.parseInt(st.nextToken());

		while (N-- > 0) {

			String[] code = br.readLine().split(""); // 입력후 잘라서 배열로 저장

			int M = Integer.parseInt(br.readLine()); // 필요 없는 듯
			st = new StringTokenizer(br.readLine(), "[],");

			for (int i = 0; i < M; i++) {
				queue.add(Integer.parseInt(st.nextToken()));
			}

			boolean reverse = false;

			int flag = 0;
			Loop1: for (String s : code) {
				switch (s) {
				case "R":
					reverse = !reverse;
					break;

				case "D":
					if (queue.size() == 0) {
						sb.append("error\n");
						flag++;
						break Loop1;
					}
					if (reverse) {
						queue.removeLast();
					} else {
						queue.remove();
					}
					break;
				default:
					break;
				}
			}
			if (flag != 0)
				continue;
			sb.append("[");
			if (!queue.isEmpty()) {
				if (reverse) {
					sb.append(queue.pollLast());
				} else
					sb.append(queue.poll());
				while (queue.size() > 0) {
					if (reverse) {
						sb.append("," + queue.pollLast());
					} else {
						sb.append("," + queue.poll());
					}
				}
			}
			sb.append("]\n");

		}
		System.out.println(sb);
	}

}