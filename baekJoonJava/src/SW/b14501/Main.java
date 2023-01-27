package SW.b14501;

import java.util.Scanner;

public class Main {

	static Node[] consulting;
	static int N, maxPay = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();

		consulting = new Node[N + 1];

		// 1일차 ~ N일차 time, cost 배열에 입력
		for (int i = 1; i <= N; i++) {
			int T = sc.nextInt();
			int P = sc.nextInt();
			consulting[i] = new Node(T, P);
		}

		findMaxPay(1, 0);

		System.out.println(maxPay);
		
		sc.close();
	}

	public static class Node {
		int day;
		int payment;

		public Node(int day, int payment) {
			this.day = day;
			this.payment = payment;
		}

	}

// pay = 누적된 페이

	// pay를 파라미터로 추가해 말아  -> 누적된 pay 
	public static void findMaxPay(int startV, int pay) {
		
		
		if (pay>maxPay) {
			maxPay = Math.max(maxPay, pay);
		}
		
		for (int i = startV; i <= N; i++) {

			// jump startV -> startV + Nodes[startV].day - 1
			int jump = i + consulting[i].day ;
			
			if (jump >= 1 && jump <= N + 1) {
				findMaxPay(jump, pay + consulting[i].payment); // jump
			}

		}

	}

}