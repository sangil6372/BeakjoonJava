package b1764;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		Map<String, Integer> map = new HashMap<>();
		List<String> list = new LinkedList<>();
		
		for (int i = 0; i < N; i++) {
			map.put(br.readLine(), 1);

		}
		int cnt = 0;
		
		for (int i = 0; i < M; i++) {
			String name = br.readLine();
			map.put(name, map.getOrDefault(name, 0) + 1);
			if (map.get(name)== 2) list.add(name);
			
		}
		Collections.sort(list);
		
		StringBuilder sb = new StringBuilder();
		for (String s : list) {
			sb.append(s + "\n");
		}
		System.out.println(cnt);
		System.out.println(sb);
		
	}

}
