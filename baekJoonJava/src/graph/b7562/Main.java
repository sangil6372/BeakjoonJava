package graph.b7562;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static int[][] visited;
	static int[] dx = {2,2,-2,-2,1,1,-1,-1};
	static int[] dy = {1,-1,1,-1,2,-2,2,-2};
	static int N,x2,y2;
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int rep = sc.nextInt();
		visited = new int[300][300];
		
	
		while(rep-->0) {
			
			N = sc.nextInt();
			
			for(int i = 0;i<N;i++) {
				for (int j = 0;j<N;j++) {
					visited[i][j] = 0;
				}
			}
			
			
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
	
			x2 = sc.nextInt();
			y2 = sc.nextInt();

			if (x1==x2&&y1==y2) {
				System.out.println("0");
				continue;
			}
			bfs(x1,y1);
			
			
		}
	}
	public static class Pair {
		int x, y;
		
		Pair(int x, int y){
			this.x = x;
			this.y = y;
		}
		
	}
	
	
	public static void bfs (int x, int y) {
	
		visited[x][y] = 1;
		Queue<Pair> queue = new LinkedList<>();
		queue.add(new Pair(x,y));
		
		
		
		while (!queue.isEmpty()) {
			
			Pair peek = queue.poll();
			
			for (int i =0;i<8;i++) {
				Pair nextPeek = new Pair(peek.x+dx[i],peek.y+dy[i]);
				
				if (nextPeek.x==x2&&nextPeek.y==y2) {
					System.out.println(visited[peek.x][peek.y]);
					return;
				}
				
				if (nextPeek.x>=0&&nextPeek.y>=0&&nextPeek.x<N&&nextPeek.y<N) {
					if (visited[nextPeek.x][nextPeek.y]==0) {
						queue.add(nextPeek);
						visited[nextPeek.x][nextPeek.y] = visited[peek.x][peek.y] +1;
					}
				}
				
			}
			
			
			
		}
		
	}
	
	
	
}
