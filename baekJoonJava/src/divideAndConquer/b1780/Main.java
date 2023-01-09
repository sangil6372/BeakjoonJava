package divideAndConquer.b1780;

import java.util.Scanner;

public class Main {
	
	static int count0 = 0;
	static int count1 = 0;
	static int countMinus = 0;
	static int[][] arr;
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		arr = new int[N+1][N+1];
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		countFold(0, 0, N);
		
		System.out.println(countMinus + "\n" +count0 +"\n" + count1);
		
		sc.close();
	}
	public static boolean checkColor(int row, int col, int length) {
		int color = arr[row][col];
		
		for (int i=row;i<length+row;i++) {
			for (int j=col;j<length+col;j++) {
				if (arr[i][j]!=color) {
					return false;
				}
			}
		}
		return true;
	}
	
	
	public static void countFold(int row, int col, int length) {
		
		
		if (checkColor(row,col,length)) {
			if(arr[row][col]==0) count0++;
			else if (arr[row][col]==1) count1++;
			else countMinus++;
			return;
		}
		else {
			length /= 3; 
			
			countFold(row,col,length);
			countFold(row,col+length,length);
			countFold(row,col+2*length,length);
			
			countFold(row+length,col,length);
			countFold(row+length,col+length,length);
			countFold(row+length,col+2*length,length);

			countFold(row+2*length,col,length);
			countFold(row+2*length,col+length,length);
			countFold(row+2*length,col+2*length,length);


		}
		
		
	}
	
}

