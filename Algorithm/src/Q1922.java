import java.util.*;
public class Q1922 {
	static int n,m,answer;
	static int parent[];
	static PriorityQueue<Edge> pq = new PriorityQueue<Edge>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		parent = new int[n+1];
		answer =0;
		
		for(int i = 0 ; i < m ;i++) {
			int s = sc.nextInt();
			int e = sc.nextInt();
			int w = sc.nextInt();
			pq.add(new Edge(s,e,w));
		}
		
		for(int i =1; i <=n ;i++) {
			parent[i] = i;				//자기본인이 부모로 초기화
		}
		
		for(int i = 0; i < m ; i++) {
			Edge ed = pq.poll();		//가장 작은 간선부터 뽑아서 
			int a = find(ed.s);			//출발점의 부모 
			int b = find(ed.e);			//도착점의 부모
			if(a == b) {				//같으면 사이클
				continue;
			}
			union(ed.s,ed.e);			//다르면 둘이 연결
			answer += ed.w;				//간선가중치 추가
		}
		System.out.println(answer);
		
	}
	public static void union(int a,int b) {
		int aroot = find(a);
		int broot = find(b);
		if(aroot==broot) {
			return;
		}
		parent[aroot] = b;
	}
	public static int find(int a) {
		if(a == parent[a]) {		//본인이 부모 최상위
			return a;
		}
		parent[a] = find(parent[a]);
		return parent[a];
	}
	
	
	public static class Edge implements Comparable<Edge>{
		int s;
		int e; 
		int w;
		public Edge(int s,int e, int w) {
			this.s = s;
			this.e = e;
			this.w = w;
		}
		public int compareTo(Edge o) {
			return this.w - o.w;
		}
	}
}
