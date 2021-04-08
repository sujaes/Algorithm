import java.util.PriorityQueue;
import java.util.Scanner;
/*
 * Date 2021.04.09
 * author �����
 * ũ�罺Į �ּҺ�����Ʈ�� ���Ͽ����ε� �˰��� �ڵ�����
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
		// �������� �������� �ֻ��� ��带 ã�Ƽ� ��ġ�� ����Ŭ�� ����� ���̹Ƿ� continue�� �Ѵ�.
		// �ƴϸ� union�� ���� �����ϰ� v �� �����ش�.
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

	// ũ�罺Į�� �⺻ union find!! �ܿ��δ°� ���ϴ�.
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

	// ���� class
	// �켱���� ť�� ����ϱ� ���ؼ� Comparable�� ���� ���� �켱������ ���ߴ�. (V ����)
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
