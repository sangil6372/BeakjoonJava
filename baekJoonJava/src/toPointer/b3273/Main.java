package toPointer.b3273;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int[] list = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i =0;i<N;i++) {
			list[i] = Integer.parseInt(st.nextToken());
			
		}
		
		int sum = Integer.parseInt(br.readLine());
		
		
		Arrays.sort(list);
		
		
		
		int start = 0; // i 	(1 ≤ i < j ≤ n)을 만족
		int end = N-1; // j
		int cnt = 0;
		
		// (1 ≤ i < j ≤ n)을 만족
		while (start!=end) {
			int mid = list[start] + list[end]; 
			
			if ( mid == sum) {
				start++;
				end--;
				cnt++;
			}
			else if(mid < sum) {
				start++;
			}
			else {
				end--;
			}
		}
		
		System.out.println(cnt);
		
	}

}
