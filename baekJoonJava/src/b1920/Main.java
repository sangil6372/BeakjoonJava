package b1920;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int arr[] = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		int M = sc.nextInt();
		
		while (M-->0) {
			int key = sc.nextInt();
			
			if (binarySearch(arr, key)) System.out.println("1");
			else System.out.println("0");
			
			
			
			
		}

		
		
		sc.close();
	}

	public static boolean binarySearch(int[] arr, int key) {
		
		int start = 0;
		int end = arr.length-1;
		
		while(start<=end) {
			
			int mid = (end+start)/2;
			
			if (key<arr[mid]) {
				end = mid-1;
			}
			else if (key>arr[mid]) {
				start = mid+1;
				
			}
			else return true;
			
			
		}
		return false;
		
		

		
	}
	
	
}
