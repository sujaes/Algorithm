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
			parent[i] = i;				//�ڱ⺻���� �θ�� �ʱ�ȭ
		}
		
		for(int i = 0; i < m ; i++) {
			Edge ed = pq.poll();		//���� ���� �������� �̾Ƽ� 
			int a = find(ed.s);			//������� �θ� 
			int b = find(ed.e);			//�������� �θ�
			if(a == b) {				//������ ����Ŭ
				continue;
			}
			union(ed.s,ed.e);			//�ٸ��� ���� ����
			answer += ed.w;				//��������ġ �߰�
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
		if(a == parent[a]) {		//������ �θ� �ֻ���
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
