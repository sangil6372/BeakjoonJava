package twoPointer.b1644;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	static ArrayList<Integer> decimalArr;
	
	static boolean[] visited;
	static int N;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

// 첫째 줄에 자연수 N이 주어진다. (1 ≤ N ≤ 4,000,000)
		N = sc.nextInt();

		decimalArr = new ArrayList<>();
		
		visited = new boolean[N + 1];

		fillDecimalNumArr();
		Collections.sort(decimalArr);
		
		if (N <= 1) {
			System.out.println("0");
		} else {
			System.out.println(countDecimalSum());
		}

// 첫째 줄에 자연수 N을 "연속된 소수의 합"으로 나타낼 수 있는 경우의 수를 출력한다.
// start , end 
		sc.close();
	}

	// 에라토스테네스의 체
	static void fillDecimalNumArr() {

		for (int i = 2; i <= N; i++) {
			if (visited[i] == false) {
				decimalArr.add(i);
				for (int j = 1; i * j <= N; j++) {
					visited[i * j] = true;
				}
			}
		}

	}

	static int countDecimalSum() {
		int start = 0;
		int end = 0;

		int sum = 2;
		int cnt = 0;

		while (start <= end) {
			if (sum == N) {
				cnt++;
			}
			if (sum<N) {
				end++;
				if (end >= decimalArr.size())break;
				sum += decimalArr.get(end);
			}
			else {
				sum-= decimalArr.get(start);
				start++;
			}
			
			
		}

		return cnt;
	}

}
