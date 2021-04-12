import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
/*
 * Date 2021.04.09
 * author �����
 * ���� �ּҺ�����Ʈ�� �˰��� �ڵ�����
 */
public class Ans_Prim {
	static int n, m;
	static Queue<Integer> q = new LinkedList<Integer>();
	static PriorityQueue<Edge> pq = new PriorityQueue<Edge>();
	static List<Edge> list[];
	static boolean visited[];
	static int answer = 0;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		list = new LinkedList[n + 1];
		visited = new boolean[n + 1];

		for (int i = 1; i <= n; i++) {
			list[i] = new LinkedList<Edge>();
		}
		for (int i = 0; i < m; i++) { // ����� ��� edge�� ��庰�� �߰�����
			int s = sc.nextInt();
			int e = sc.nextInt();
			int w = sc.nextInt();
			list[s].add(new Edge(e, w));
			list[e].add(new Edge(s, w));
		}

		q.add(1); // ���۳��
		while (!q.isEmpty()) {
			int node = q.poll();
			visited[node] = true; // ��� �湮ó��
			for (int i = 0; i < list[node].size(); i++) { // ���� ����ȸ�� edge�湮
				Edge temp = list[node].get(i);
				if (!visited[temp.e]) { // ����� node�� �湮������ ������
					pq.add(new Edge(temp.e, temp.v)); // �켱����ť�� �ֱ�
				}
			}
			while (!pq.isEmpty()) { // �켱����ť ���� �湮
				Edge temp = pq.poll();
				if (!visited[temp.e]) { // �湮����������
					visited[temp.e] = true; // �湮
					q.add(temp.e); // ť�� ����
					answer += temp.v;

				}
			}
		}
		System.out.println(answer);

	}

	// ���� class
	// �켱���� ť�� ����ϱ� ���ؼ� Comparable�� ���� ���� �켱������ ���ߴ�. (V ����)
	public static class Edge implements Comparable<Edge> {
		int e;
		int v;

		public Edge(int e, int v) {
			this.e = e;
			this.v = v;
		}

		@Override
		public int compareTo(Edge o) {
			// TODO Auto-generated method stub
			return this.v - o.v;
		}
	}
}
