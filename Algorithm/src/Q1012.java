//import java.util.Scanner;
//import java.util.Stack;
// 
//public class Q1012 {
//    static int dx[] = {0,0,1,-1};
//    static int dy[] = {1,-1,0,0};
//    static int n;
//    static int arr[][];
//    static boolean visited[][];
//    static Stack<Pair> st;
//    static int x,y;
//    
//    public static void dfs(Pair p) {
//    	st.add(p);
//    	visited[p.x][p.y] = true;
//
//		boolean flag = true;
//
//    	while(!st.isEmpty()) {
//    		Pair pp = st.peek();
//    		
//    		for(int i =0; i <4; i++) {
//    			int nx = pp.x +dx[i];
//    			int ny = pp.y +dy[i];
//    			if(nx<0||nx>=x||ny<0||ny>=y) {
//    				continue;
//    			}
//    			if(arr[nx][ny]==1 && !visited[nx][ny]) {
//    				dfs(new Pair(nx,ny));
//    				flag = false;
//    			}
//    		}
//    		if(flag) {
//    			st.pop();
//    		}
//    	}
//    }
//    
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
//        
//        for(int i = 0 ; i < n; i++) {
//        	int count = 0;
//        	x = sc.nextInt();
//        	y = sc.nextInt();
//        	arr = new int[x][y];
//        	visited = new boolean[x][y];
//        	int z = sc.nextInt();
//        	for(int j = 0 ; j<z;j++) {
//        		arr[sc.nextInt()][sc.nextInt()] =1;
//        	}
//        	
//        	for(int j = 0 ; j<x; j++) {
//        		for(int k = 0;k<y;k++) {
//        			if(arr[j][k]==1 && !visited[j][k]) {
//        				st = new Stack<Pair>();
//        				Pair  p = new Pair(j,k);
//        				count++;
//        				dfs(p);
//        			}
//        		}
//        	}
//        	
//        	
//            System.out.println(count);        	
//        }
//    }  
//    
//    public static class Pair{
//    	int x;
//    	int y;
//    	public Pair(int x, int y) {
//    		this.x = x;
//    		this.y = y;
//    	}
//    }
//}


//import java.util.Scanner;
//import java.util.Stack;
//
//public class Main {
//	static int m,n,k;
//	static int arr[][];
//	static boolean visited[][];
//	static int count;
//	static int dx[] = {0,0,1,-1};
//	static int dy[] = {1,-1,0,0};
//	static Stack<Node> stack;
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int T = sc.nextInt();
//		for(int i = 0 ; i < T; i++) {
//			m = sc.nextInt();
//			n = sc.nextInt();
//			k = sc.nextInt();
//			arr = new int[m][n];
//			visited = new boolean[m][n];
//			count = 0;
//			stack = new Stack<Node>();
//			for(int j = 0 ; j < k ; j++) {
//				int s = sc.nextInt();
//				int e = sc.nextInt();
//				arr[s][e] = 1;
//			}
//			
//			for(int q = 0 ; q < m; q++) {
//				for(int j = 0 ; j < n; j++) {
//					if(arr[q][j] == 1 && !visited[q][j]) {
//						count++;
//						visited[q][j] =true;
//						stack.add(new Node(q,j));
//						dfs();	
//					}
//				}
//
//
//			}
//			System.out.println(count);
//		}
//		
//	}
//	public static void dfs() {
//		while(!stack.isEmpty()) {
//			Node node = stack.pop();
//			int x = node.x;
//			int y = node.y;
//			for(int i = 0 ; i < 4; i++) {
//				int nx = x + dx[i];
//				int ny = y + dy[i];
//				if(nx<0 || ny< 0 || nx>=m || ny >=n) {
//					continue;
//				}
//				if(arr[nx][ny] ==1 && !visited[nx][ny]) {
//					visited[nx][ny] = true;
//					stack.add(new Node(nx,ny));
//				}
//			}
//		}
//	}
//	
//}
//class Node{
//	int x;
//	int y;
//	public Node(int x, int y) {
//		this.x = x;
//		this.y = y;
//	}
//}