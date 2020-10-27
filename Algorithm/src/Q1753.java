//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.PriorityQueue;
//import java.util.Scanner;
//
//class Q1753 {
//    static int v,e,k;
//    static ArrayList<Node> list[];
//    static boolean visited[];
//    static int dist[];
//    public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       v = sc.nextInt();
//       e = sc.nextInt();
//       k = sc.nextInt();
//       dist = new int[v+1];
//       list =  new ArrayList[v+1];
//       visited = new boolean[v+1];
//       for(int i =1 ; i <=v;i++) {
//    	   list[i] = new ArrayList<>();
//       }
//       Arrays.fill(dist,Integer.MAX_VALUE);
//       dist[k] = 0;
//       
//       
//       for( int i = 0 ; i < e; i++) {
//    	   int s = sc.nextInt();
//    	   int e = sc.nextInt();
//    	   int w = sc.nextInt();
//    	   list[s].add(new Node(e,w));
//       }
//       
//       bfs();
//       for(int i = 1; i <=v;i++) {
//    	   if(dist[i] ==Integer.MAX_VALUE) {
//    		   System.out.println("INF");
//    	   }else {
//    		   System.out.println(dist[i]);
//    	   }
//       }
//       
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
//    
//}
//class Node implements Comparable<Node>{
//	int e,w;
//	public Node(int e,int w) {
//		
//		this.e=e;
//		this.w=w;
//	}
//	public int compareTo(Node o) {
//		return this.w - o.w;
//	}
//}