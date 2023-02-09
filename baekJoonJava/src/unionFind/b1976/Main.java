package unionFind.b1976;

import java.util.Scanner;

public class Main {

	static int[] destinationParent; 
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 도시 수 
		destinationParent = new int[N+1];
		
		int M = sc.nextInt(); // 여행 계획 도시 수
		
		for (int i=1;i<=N;i++) {
			destinationParent[i] = i;
		}
		
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=N;j++) {
				int n = sc.nextInt();
				if (n==1) {
					union(i,j);
				}
			}
		}
		
		int temp = 0;
		for (int i =1 ;i<=M;i++) {   // n개 도시 연결 여부 판단
			int n = sc.nextInt();  // 다음 도시
			int nParent = findParent(n);
			
			if (i==1) {
				temp = nParent;
				continue;}
			
			if (nParent!= temp){
				System.out.println("NO");
				break;
			}
			temp = nParent;
			if (i==M) System.out.println("YES");
		}
		
		sc.close();
	}
	static int findParent(int destination) {
		if (destination != destinationParent[destination]) {
			destination = findParent(destinationParent[destination]);
		}
		return destination;
	}
	
	static void union(int a, int b) {
		a = findParent(a);
		b = findParent(b);
		
		if(a<b) {
			destinationParent[b] = a;
		}
	}

}
