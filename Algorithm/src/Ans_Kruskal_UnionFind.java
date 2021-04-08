import java.util.PriorityQueue;
import java.util.Scanner;
/*
 * Date 2021.04.09
 * author 장수제
 * 크루스칼 최소비용신장트리 유니온파인드 알고리즘 코드정리
 */
public class Ans_Kruskal_UnionFind {
	static int n, m;
	static int[] parent;
	static PriorityQueue<edge> pq = new PriorityQueue<edge>();
	static int result = 0;
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		parent = new int[n + 1];
		for (int i = 0; i < n + 1; i++) {
			parent[i] = i;
		}
		for (int i = 0; i < m; i++) {
			pq.add(new edge(sc.nextInt(), sc.nextInt(), sc.nextInt()));
		}
		// 시작점과 종료점의 최상위 노드를 찾아서 겹치면 사이클이 생기는 것이므로 continue를 한다.
		// 아니면 union을 통해 연결하고 v 를 더해준다.
		for (int i = 0; i < m; i++) {
			edge tmp = pq.poll();
			int a = find(tmp.s);
			int b = find(tmp.e);
			if (a == b)
				continue;
			union(a, b);
			result += tmp.v;
		}
		System.out.println(result);
	}

	// 크루스칼의 기본 union find!! 외워두는게 편하다.
	public static int find(int a) {
		if (a == parent[a])
			return a;
		parent[a] = find(parent[a]);
		return parent[a];
	}

	public static void union(int a, int b) {
		int aRoot = find(a);
		int bRoot = find(b);

		if (aRoot != bRoot) {
			parent[aRoot] = b;
		} else {
			return;
		}
	}

	// 간선 class
	// 우선순위 큐를 사용하기 위해서 Comparable을 통해 정렬 우선순위를 정했다. (V 기준)
	public static class edge implements Comparable<edge> {
		int s;
		int e;
		int v;

		public edge(int s, int e, int v) {
			this.s = s;
			this.e = e;
			this.v = v;
		}

		@Override
		public int compareTo(edge arg0) {
			// TODO Auto-generated method stub
			return this.v - arg0.v;
		}
	}

}
