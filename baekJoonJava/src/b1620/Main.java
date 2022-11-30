package b1620;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;



public class Main {


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		HashMap<String, Integer> nameMap = new HashMap<String, Integer>();
		String[] nameArr = new String[N + 1]; // 반대로 값으로 키를 찾는 법
		
		
		for (int i = 1; i < N+1; i++) {
			String name = br.readLine();
			nameMap.put(name, i);
			nameArr[i] = name;
		}

//		Set<Map.Entry<String, Integer>> nameSet = nameMap.entrySet();
//		Iterator<Entry<String, Integer>> nameIterator = nameSet.iterator();
//		
		for (int j = 0; j < M; j++) {
			String quiz = br.readLine();
			if (isStringNumber(quiz)) {
				System.out.println(nameArr[Integer.parseInt(quiz)]);
			}else {
				System.out.println(nameMap.get(quiz));	
			}
		}
		
	}
	
	public static boolean isStringNumber(String s) {
		   try {
		       Double.parseDouble(s);
		       return true;
		   }
		   catch (NumberFormatException e) {
		       return false;
		   }
		}
}
