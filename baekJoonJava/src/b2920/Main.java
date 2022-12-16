package b2920;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[8];

		for (int i = 0; i < 8; i++) {
			arr[i] = sc.nextInt();
		}
		int aCnt = 0;
		int dCnt = 0;

		for (int i = 0; i < 8; i++) {
			for (int j = i; j < 8; j++) {
				if (arr[j] > arr[i])
					aCnt++;
				else if (arr[j] < arr[i])
					dCnt++;
			}
		}
		if (aCnt!=0&&dCnt==0) {
			System.out.println("ascending");
		}
		else if (aCnt==0&&dCnt!=0) {
			System.out.println("descending");
		}
		else {
			System.out.println("mixed");
		}
		
		sc.close();
	}

}
