package SW.b14888;

import java.util.Scanner;

public class Main {

	static int N;
	static int[] numArr;
	static int[] operArr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		numArr = new int[N];
		operArr = new int[4];

		for (int i = 0; i < N; i++) {
			numArr[i] = sc.nextInt();
		}

		for (int i = 0; i < 4; i++) {
			operArr[i] = sc.nextInt();
		}

		backTracking(numArr[0], 1);
		System.out.println(max);
		System.out.println(min);
		
		sc.close();
	}

	static int max = -1000000001;
	static int min = 1000000001;

	static void backTracking(int value, int order) {

		if (order == N) {
			max = Math.max(max, value);
			min = Math.min(min, value);
			return;
		}

	

		for (int j = 0; j < 4; j++) {
			if (operArr[j] == 0)
				continue;
			operArr[j]--;
			backTracking(oper(j, value, numArr[order]), order + 1);			
			operArr[j]++;
		}

	}

	static int oper(int n, int a, int b) {
		switch (n) {
		case 0:
			return a + b;
		case 1:
			return a - b;
		case 2:
			return a * b;
		case 3:
			return a / b;
		}
		return 0;
	}

}
