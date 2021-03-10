import java.util.*;
public class Q1238 {
	static int n,m,x;
	static boolean visited[];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		x = sc.nextInt();
		int dist[] = new int[n+1];
		int rdist[] = new int[n+1];
		ArrayList<Node>[] list = new ArrayList[n+1];
		ArrayList<Node>[] rlist = new ArrayList[n+1];
		int MAX = Integer.MAX_VALUE;
		
		
		for(int i = 1; i < n+1;i++) {
			list[i] = new ArrayList<Node>();
			rlist[i] = new ArrayList<Node>();
		}
		
		Arrays.fill(dist,MAX);
		Arrays.fill(rdist,MAX);
		
		
		for(int i = 0 ; i < m ;i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			int weight = sc.nextInt();
			list[start].add(new Node(end,weight));
			rlist[end].add(new Node(start,weight));
		}
		
		bfs(list,dist);
		bfs(rlist,rdist);		
		
		int temp = 0;
		for(int i = 1; i < n+1; i++) {
			if(temp < dist[i] + rdist[i]) {
				temp = dist[i] + rdist[i];
			}
		}
		System.out.println(temp);
	}
	
	public static void bfs(ArrayList<Node>[] list, int dist[]) {
		visited = new boolean[n+1];
		dist[x] = 0;
		PriorityQueue<Node> pq = new PriorityQueue<Node>();
		pq.add(new Node(x,0));
		while(!pq.isEmpty()) {
			Node node = pq.poll();
			
			if(visited[node.end]) {
				continue;
			}
			visited[node.end]= true;
			
			for(int i = 0; i < list[node.end].size();i++) {
				Node no = list[node.end].get(i);
				if(dist[no.end] > dist[node.end] + no.weight) {
					dist[no.end] = dist[node.end] + no.weight;
					pq.add(new Node(no.end,dist[no.end]));
				}
			}
			
		}
	}
	
	public static class Node implements Comparable<Node>{
		int end;
		int weight;
		public Node(int end,int weight) {
			this.end = end;
			this.weight = weight;
		}
		public int compareTo(Node o) {
			return this.weight - o.weight;
		}
	}
}
