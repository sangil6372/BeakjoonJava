package divideAndConquer.b1992;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	
	static int[][] arr;
	static StringBuilder sb;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		sb = new StringBuilder();
		
		
		int N = Integer.parseInt(st.nextToken());
		arr = new int[N+1][N+1];
		
		for (int i = 0; i < N; i++) {
			String[] str = br.readLine().split("");
			for (int j = 0; j < N; j++) {
				arr[i][j] = Integer.parseInt(str[j]);
			}
		}
		
		countFold(0, 0, N);
		
		System.out.println(sb);
		
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
			if(arr[row][col]==0) sb.append("0");
			else sb.append("1");
			return;
		}
		else {
			sb.append("(");
			countFold(row,col,length/2);
			countFold(row, col+ length/2,length/2);
			countFold(row+length/2,col,length/2);
			countFold(row + length/2,col+ length/2,length/2);
			sb.append(")");
		}
		
		
	}
	
}

