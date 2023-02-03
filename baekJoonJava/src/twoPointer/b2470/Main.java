package twoPointer.b2470;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		int[] arr = new int[N];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr);
	
		
		
		int start = 0;
		int end = N-1;
		int mid;
		int prevMid = Math.abs(arr[0] + arr[N-1]);
		
		int ans1 = 0;
		int ans2 = N-1;
		
		while(start<end) {
			mid = arr[start] + arr[end];
			
			// 더 가까워졌는지 먼저 체크 
			if (prevMid > Math.abs(mid)) {
				ans1 = start;
				ans2 = end;
				prevMid = Math.abs(mid);
			}
			
			if (mid == 0) {
				break;
			}
			if (mid > 0) {
				end--;
			}
			if (mid < 0) {
				start++;
			}
			
		}
		System.out.println(arr[ans1] + " " + arr[ans2]);
		
		
		
	}

}
