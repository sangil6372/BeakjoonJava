package bst.b10816;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());

		HashMap<Integer, Integer> map = new HashMap<>();

		StringTokenizer st = new StringTokenizer(br.readLine());

		while (N-- > 0) {
			int num = Integer.parseInt(st.nextToken());
			map.put(num, map.getOrDefault(num, 0) + 1); // 있으면 원래 있는 개수 불러와서 1 추가 없으면 0에 1추가
		}

		int M = Integer.parseInt(br.readLine());

		st = new StringTokenizer(br.readLine());

		Set<Integer> set = map.keySet();
		Iterator<Integer> iterator = set.iterator();

		int[] arr = new int[set.size()];
		
		
		for (int i = 0; i < set.size(); i++) {
			arr[i] = iterator.next();
		}
		
		Arrays.sort(arr);
		
		
		while (M-- > 0) {
			int findNum = Integer.parseInt(st.nextToken());
			if (binarySearch(arr, findNum)) {
				sb.append(map.get(findNum) + " ");
			}
			else {
				sb.append("0 ");
			}
			
			
		}		
		System.out.println(sb);
	}

	public static boolean binarySearch(int[] arr, int key) {

		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {

			int mid = (end + start) / 2;

			if (key < arr[mid]) {
				end = mid - 1;
			} else if (key > arr[mid]) {
				start = mid + 1;

			} else
				return true;

		}
		return false;

	}
}
