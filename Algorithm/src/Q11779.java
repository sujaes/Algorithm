import java.util.*;
public class Q11779 {
	static int n,m,x,y;
	static int dist[];
	static int plist[];
	static boolean visited[];
	static ArrayList<Node>[] list;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		int MAX = Integer.MAX_VALUE;
		dist = new int[n+1];
		plist = new int[n+1];
		visited = new boolean[n+1];
		list = new ArrayList[n+1];
		
		Arrays.fill(dist,MAX);
		for(int i = 1; i < n+1;i++) {
			list[i] = new ArrayList<Node>();
		}
		
		for(int i = 0 ; i < m ; i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			int weight = sc.nextInt();
			list[start].add(new Node(end,weight));
		}
		x = sc.nextInt();
		y = sc.nextInt();
		
		dks();
		
		
		int count = 2;

		
		System.out.println(dist[y]);
		System.out.println(count);
		
		Stack<Integer> stack = new Stack<>();
        while (true) {
            stack.push(y);
            y = plist[y];
            if (y == x) {
                stack.push(y);
                break;
            }
            count++;
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
		
		
	}
	
	public static void dks() {
		PriorityQueue<Node> pq = new PriorityQueue<Node>();
		dist[x] = 0;
		pq.add(new Node(x,0));
		while(!pq.isEmpty()) {
			Node o = pq.poll();
			
			if(visited[o.end]) {
				continue;
			}
			visited[o.end]= true;
			
			
			for(int i =0 ; i <list[o.end].size();i++) {
				Node node = list[o.end].get(i);
				
				if(dist[node.end] > dist[o.end] + node.weight) {
					dist[node.end] = dist[o.end] + node.weight;
					pq.add(new Node(node.end,dist[node.end]));
					plist[node.end] = o.end;
				}
			}
		}
		
	}

	public static class Node implements Comparable<Node>{
		int end;
		int weight;
		public Node(int end, int weight){
			this.end = end;
			this.weight = weight;
		}
		public int compareTo(Node o) {
			return this.weight - o.weight;
		}
	}
	
}
