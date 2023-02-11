package unionFind.b4195;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
	static int[] parent;
	static int[] cnt;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 첫째 줄에 테스트 케이스의 개수가 주어진다. 
		int N = sc.nextInt();
		
		
		
		while(N-->0) {
			Map<String,Integer> relation = new HashMap<>();
			
			//다음 F개의 줄에는 친구 관계가 생긴 순서대로 주어진다.
			int F = sc.nextInt();
			//각 테스트 케이스의 첫째 줄에는 친구 관계의 수 F가 주어지며, 이 값은 100,000을 넘지 않는다. 
			
			
			parent=new int[F*2]; // 부모 연결 배열
			cnt=new int[F*2]; // 부모간의 거리 저장 배열
			
			Arrays.fill(cnt, 1);
			
			
			int idx = 0;
			while(F-->0) {
				String friendA = sc.next();
				String friendB = sc.next();
				
				if (!relation.containsKey(friendA)) {
					parent[idx] = idx; // 초기화 과정
					relation.put(friendA, idx++); // 스스로의 idx를 가리키게
				}
				if (!relation.containsKey(friendB)) {
					parent[idx] = idx; // 초기화 과정
					relation.put(friendB, idx++);
				}
				
				union(relation.get(friendA), relation.get(friendB));
				System.out.println(cnt[find(relation.get(friendA))]);
				
				
			}
		}
		sc.close();
	}

	static int find(int a) {
		if (a!=parent[a]) {
			a = find(parent[a]);
		}
		return a;
	}

	static void union(int a, int b) {
		a = find(a);
		b = find(b);
		
		if (a == b) return; // 둘이 이미 연결
		
		if (a<b) {
			parent[b] = a;
			cnt[a] += cnt[b];
		}
		else {
			parent[a] = b;
			cnt[b] += cnt[a];
		}
		
	}
	
	
	
	
	
}
