import java.util.*;
public class P1647 {
	static int n,edge;
	static int parents[];
	static int answer = 0;
	static int max =0;
	static PriorityQueue<Edge> pq = new PriorityQueue<Edge>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		edge = sc.nextInt();
		parents = new int[n+1];
		for(int i = 1; i < n+1; i++) {
			parents[i] = i;
		}
		for(int i = 0 ; i < edge; i++) {
			int s = sc.nextInt();
			int e = sc.nextInt();
			int w = sc.nextInt();
			pq.add(new Edge(s,e,w));
		}
		for(int i = 0 ; i < edge; i++) {
			Edge eg = pq.poll();
			int a = find(eg.s);
			int b = find(eg.e);
			if(a==b) {
				continue;
			}
			union(a,b);
			answer += eg.w;
			if( max< eg.w) {
				max = eg.w;
			}
		}
		answer = answer - max;
		System.out.println(answer);
		
	}
	
	public static int find(int a) {
		if(parents[a]==a) {
			return a;
		}else {
			parents[a] = find(parents[a]);
			return parents[a];
		}
		
	}
	
	public static void union(int a ,int b) {
		int roota = find(a);
		int rootb = find(b);
		if(roota != rootb) {
			parents[roota] = b;
		}
	}
	public static class Edge implements Comparable<Edge>{
		int s;
		int e;
		int w;
		public Edge(int s, int e,int w) {
			this.s = s;
			this.e = e;
			this.w = w;
		}
		public int compareTo(Edge o) {
			return this.w - o.w;
		}
	}
}
