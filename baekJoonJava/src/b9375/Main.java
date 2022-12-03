package b9375;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	
		
		
		Map<String, Integer> fashionMap = new HashMap<>();
		int n = Integer.parseInt(br.readLine());
		while(n-->0) {
			int m = Integer.parseInt(br.readLine());
			int result = 1;
			fashionMap.clear();
			while(m-->0) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				String clothes = st.nextToken();
				String kindOf = st.nextToken();
				fashionMap.put(kindOf, fashionMap.getOrDefault(kindOf, 0) + 1);
	
			}
			
			for (int i : fashionMap.values()) {
				result *=(i+1);
			}
			result-=1;
			System.out.println(result);
		}
	}

}
