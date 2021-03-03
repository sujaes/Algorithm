//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.PriorityQueue;
//import java.util.Scanner;
//
//class Q1916 {
//    static int v,e,k,k1;
//    static ArrayList<Node> list[];
//    static boolean visited[];
//    static int dist[];
//    public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       v = sc.nextInt();
//       e = sc.nextInt();
//       dist = new int[v+1];
//       list =  new ArrayList[v+1];
//       visited = new boolean[v+1];
//       for(int i =1 ; i <=v;i++) {
//    	   list[i] = new ArrayList<>();
//       }
//       Arrays.fill(dist,Integer.MAX_VALUE);     
//       
//       for( int i = 0 ; i < e; i++) {
//    	   int s = sc.nextInt();
//    	   int e = sc.nextInt();
//    	   int w = sc.nextInt();
//    	   list[s].add(new Node(e,w));
//       }
//       k = sc.nextInt();
//       k1 = sc.nextInt();
//       
//       dist[k] =0;
//       bfs();
//       System.out.println(dist[k1]);     
//       
//    }
//    public static void bfs() {
//    	PriorityQueue<Node> q = new PriorityQueue<Node>();
//    	q.add(new Node(k,0));
//    	while(!q.isEmpty()) {
//        	Node node = q.poll();
//        	if(visited[node.e]) {
//        		continue;
//        	}
//        	visited[node.e] = true;
//        	for(Node o : list[node.e]) {
//                if(dist[o.e] > dist[node.e]+o.w) {
//                	dist[o.e] = dist[node.e]+o.w;
//                	q.add(new Node(o.e,dist[o.e]));
//                }
//            }   
//        }
//        	
//    	
//    }
//    public static class Node implements Comparable<Node>{
//    	int e,w;
//    	public Node(int e,int w) {		
//    		this.e=e;
//    		this.w=w;
//    	}
//    	public int compareTo(Node o) {
//    		return this.w - o.w;
//    	}
//    }
//
//}


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

class Q1916 {
	static int e,v,k,k1;
    static boolean visited[];
    static int dist[];
    static ArrayList<Node> list[];
	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       v = sc.nextInt();
       e = sc.nextInt();
       visited = new boolean[v+1];
       dist = new int[v+1];
       list = new ArrayList[v+1];
       
       for(int i = 1; i <= v; i++) {
    	   list[i] = new ArrayList<Node>();
       }
       Arrays.fill(dist,Integer.MAX_VALUE);
       
       for(int i = 1 ;i <= e; i++) {
    	   int u = sc.nextInt();
    	   int v = sc.nextInt();
    	   int w = sc.nextInt();
    	   list[u].add(new Node(v,w));
       }
       k = sc.nextInt();
       k1 = sc.nextInt();
       dist[k] =0;

       bfs();
       
       System.out.println(dist[k1]);
       
    }
	public static void bfs() {
		PriorityQueue<Node> pq = new PriorityQueue<Node>();
    	pq.add(new Node(k,0));
		while(!pq.isEmpty()) {
			Node node = pq.poll();
			
			if(visited[node.end]) {
				continue;
			}
			visited[node.end]= true;
			
			for(int i = 0 ; i < list[node.end].size();i++) {
				Node o = list[node.end].get(i);
				if(dist[o.end] > dist[node.end] + o.weight) {
					dist[o.end]  = dist[node.end] + o.weight;
                	pq.add(new Node(o.end,dist[o.end]));
				}
			}
		}
	}
    
    
    
    
    
    
    public static class Node implements Comparable<Node>{
    	int end,weight;
    	public Node(int end,int weight){
    		this.end = end;
    		this.weight = weight;
    	}
    	public int compareTo(Node o) {
    		return this.weight-o.weight;
    	}

    }
}



