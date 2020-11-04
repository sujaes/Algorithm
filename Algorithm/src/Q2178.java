import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
 
public class Q2178 {
    static int n;
    static int[][] arr;
    static boolean[][] visited;
    static int result = 0;
    static Queue<Pair> q;
    static int dx[] = {1,-1,0,0};
    static int dy[] = {0,0,1,-1};
    static int count ;
    static int level = 0;
    static List<Integer> list;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();	
        arr = new int[n][n];
        visited = new boolean[n][n];
        list = new ArrayList<Integer>();
        
        for(int i = 0 ; i < n ; i++) {
        	String temp  = sc.next();
        	for(int j = 0 ; j < n ; j++) {
        		arr[i][j] = Integer.parseInt(temp.charAt(j)+"");
        	}
        }  
        
        
        for(int i = 0 ; i < n; i++) {
        	for(int j = 0 ; j < n ; j++) {
        		if(arr[i][j] == 1 && !visited[i][j]) {
        	        q = new LinkedList<Pair>();
        			level++;
        			count = 1;
        			bfs(new Pair(i,j));
        		}
        	}
        }
        Collections.sort(list);
      
        System.out.println(level);
        for(int i = 0 ; i < list.size();i++) {
        	System.out.println(list.get(i));
        }
    }
    
    public static void bfs(Pair p) {
    	q.add(p);
    	visited[p.a][p.b]=true;
    	while(!q.isEmpty()) {
    		Pair pp = q.poll();
    		for(int i = 0 ; i<4; i++) {
    			int nx = pp.a+ dx[i];
    			int ny = pp.b+ dy[i];
    			
    			if(nx < 0 || nx >= n || ny < 0 || ny >= n) {
    				continue;
    			}
    			if(arr[nx][ny]==1 && !visited[nx][ny]) {
    				visited[nx][ny] =true;
    				count++;
    				q.add(new Pair(nx,ny));
    			}
    			
    		}
    	}
    	list.add(count);
    }
    
    
    public static class Pair{
    	int a;
    	int b;
    	public Pair(int a ,int b) {
    		this.a = a;
    		this.b = b;
    	}
    }
}

//2020.11.03
//import java.util.*;
//
//public class Main {
//	static int n,m;
//	static int arr[][];
//	static boolean visited[][];
//	static Queue<Node> q;
//	static int dx[] = {0,0,1,-1};
//	static int dy[] = {1,-1,0,0};
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		n = sc.nextInt();
//		m = sc.nextInt();
//		arr = new int[n][m];
//		visited = new boolean[n][m];
//		q = new LinkedList<Node>();
//		
//		
//		for(int i = 0; i <n ; i++) {
//			String s = sc.next();
//			for(int j = 0 ; j < m ; j++) {
//				arr[i][j] = Integer.parseInt(s.charAt(j)+"");
//			}
//		}
//		q.add(new Node(0,0));
//		visited[0][0] = true;
//		bfs();
//		System.out.println(arr[n-1][m-1]);
//		
//	}
//	public static void bfs() {
//		while(!q.isEmpty()) {
//			Node node = q.poll();
//			for(int i = 0 ; i < 4; i++) {
//				int nx = node.x + dx[i];
//				int ny = node.y + dy[i];
//				if(nx < 0 || ny <0 || nx>=n || ny>=m) {
//					continue;
//				}
//				if(arr[nx][ny]!=0 && !visited[nx][ny]) {
//					q.add(new Node(nx,ny));
//					arr[nx][ny] = arr[node.x][node.y] +1;
//					visited[nx][ny] = true;
//				}
//			}
//		}
//	}
//}
//class Node{
//	int x;
//	int y;
//	public Node(int x, int y) {
//		this.x = x;
//		this.y = y;
//	}
//	
//}
