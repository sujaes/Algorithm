//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.Scanner;
// 
//public class Q11724 {
//    static int n;
//    static int m;
//    static int[][] map;
//    static boolean[] visited;
//    static int result = 0;
//    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        
//        n = sc.nextInt();
//        m = sc.nextInt();
//        
//        map = new int[n][n];
//        visited = new boolean[n];
//        
//        for(int i=0; i<m; i++) {
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//            
//            map[a-1][b-1] = 1;
//            map[b-1][a-1] = 1;
//        }
//        
//        for(int i=0; i<n; i++) {
//            if(!visited[i]) {
//                bfs(i);
//                result++;
//            }
//        }
//        
//        System.out.println(result);
//        
//    }
//    
//    public static void bfs(int start) {
//        Queue<Integer> q = new LinkedList<Integer>();
//        q.add(start);
//        visited[start] = true;
//        
//        while(!q.isEmpty()) {
//            int v = q.poll();
//            
//            for(int i=0; i<n; i++) {
//                if(map[v][i] == 1 && !visited[i]) {
//                    q.add(i);
//                    visited[i] = true;
//                }
//            }
//        }
//    }
//}


//import java.util.ArrayList;
//import java.util.Scanner;
//import java.util.Stack;
//
//public class Main {
//	static boolean visited[];
//	static ArrayList<Integer>[] arr;
//	static Stack<Integer> stack;
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		int node = sc.nextInt();
//		int edge = sc.nextInt();
//		
//		int count = 0;
//		stack = new Stack<Integer>();
//		arr = new ArrayList[node];
//		visited = new boolean[node];
//		
//		for(int i = 0 ; i < node; i++) {
//			arr[i] = new ArrayList<Integer>();
//		}
//		
//		
//		for(int j = 0; j < edge; j++) {
//			int s = sc.nextInt();
//			int e = sc.nextInt();
//			arr[s-1].add(e-1);
//			arr[e-1].add(s-1);
//		}	
//		
//		for (int i = 0; i < node; i++) {
//			if (!visited[i]) {
//				visited[i] = true;
//				stack.add(i);
//				count++;
//				dfs();
//			}
//		}
//		System.out.println(count);
//		
//		
//	}
//	public static void dfs() {
//		while(!stack.isEmpty()) {
//			int n = stack.pop();
//			for(int i = 0 ; i < arr[n].size(); i++) {
//				if(!visited[arr[n].get(i)]) {
//					visited[arr[n].get(i)] = true;
//					stack.add(arr[n].get(i));
//				}
//			}
//		}
//	}
//}
