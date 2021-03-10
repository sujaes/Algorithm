import java.util.*;

public class Q1865 {
	static int n,m,w;
	static boolean visited[];
	static int dist[];
	static ArrayList<Node>[] list;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Tc = sc.nextInt();
		
		while(Tc-- >0) {
			n = sc.nextInt();
			m = sc.nextInt();
			w = sc.nextInt();
			
			visited = new boolean[n+1];
			dist = new int[n+1];
			list = new ArrayList[n+1];
			Arrays.fill(dist,987654321);
			dist[1] = 0;
			for(int i =1; i < n+1;i++) {
				list[i] = new ArrayList<Node>();
			}
			
			for(int i = 0 ;i < m; i++) {
				int start = sc.nextInt();
				int end = sc.nextInt();
				int weight = sc.nextInt();
				list[start].add(new Node(end,weight));
				list[end].add(new Node(start,weight));
			}
			for(int i = 0 ;i < w; i++) {
				int start = sc.nextInt();
				int end = sc.nextInt();
				int weight = sc.nextInt();
				list[start].add(new Node(end,(-1) * weight));
			}
			belmanford();
			
		}
	}
	
	public static void belmanford() {
		boolean update = false;
		a:for(int i = 1; i <n+1;i++) {
			update = false;
			for(int j = 0 ; j < list[i].size();j++) {
				Node node = list[i].get(j);
				if(dist[node.end] > dist[i] + node.weight) {
					dist[node.end] = dist[i] + node.weight;
					update = true;
					
					if( i == n ) {
						update = true;
						break a;
					}
				}
			}
			if(!update) {
				break;
			}
		}
		if(update) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
	
	public static class Node implements Comparable<Node>{
		int end;
		int weight;
		public Node(int end, int weight) {
			this.end = end;
			this.weight = weight;
		}
		public int compareTo(Node o) {
			return this.weight - o.weight;
		}
	}

}
