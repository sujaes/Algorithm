import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
/*
 * Date 2021.04.09
 * author 장수제
 * 프림 최소비용신장트리 알고리즘 코드정리
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
		for (int i = 0; i < m; i++) { // 연결된 모든 edge를 노드별로 추가해줌
			int s = sc.nextInt();
			int e = sc.nextInt();
			int w = sc.nextInt();
			list[s].add(new Edge(e, w));
			list[e].add(new Edge(s, w));
		}

		q.add(1); // 시작노드
		while (!q.isEmpty()) {
			int node = q.poll();
			visited[node] = true; // 노드 방문처리
			for (int i = 0; i < list[node].size(); i++) { // 노드와 연결된모든 edge방문
				Edge temp = list[node].get(i);
				if (!visited[temp.e]) { // 연결된 node가 방문한적이 없으면
					pq.add(new Edge(temp.e, temp.v)); // 우선순위큐에 넣기
				}
			}
			while (!pq.isEmpty()) { // 우선순위큐 전부 방문
				Edge temp = pq.poll();
				if (!visited[temp.e]) { // 방문한적없으면
					visited[temp.e] = true; // 방문
					q.add(temp.e); // 큐에 삽입
					answer += temp.v;

				}
			}
		}
		System.out.println(answer);

	}

	// 간선 class
	// 우선순위 큐를 사용하기 위해서 Comparable을 통해 정렬 우선순위를 정했다. (V 기준)
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
