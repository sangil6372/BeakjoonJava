package b18870;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Map<Integer,Integer> rankingMap = new HashMap<>();
		
		int N = sc.nextInt();
		int[] list = new int [N];
		int[] sorted = new int [N];
		
		for(int i = 0;i<N;i++) {
			sorted[i] = list [i] = sc.nextInt();
		}
		
		Arrays.sort(sorted);
		
		int rank = 0;
		for (int s : sorted) {
			if (!rankingMap.containsKey(s)) {
				rankingMap.put(s, rank);
				rank++;
			}
		}
		StringBuilder sb = new StringBuilder();
		
		for (int l : list) {
			sb.append(rankingMap.get(l)+ " ");
		}
		System.out.println(sb);
		sc.close();
	}

}
