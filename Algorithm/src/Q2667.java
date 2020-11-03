import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
 
public class Q2667 {
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









//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Main {
//	static int n;
//	static int arr[][];
//	static boolean visited[][];
//	static int dx[] = {0,0,1,-1};
//	static int dy[] = {1,-1,0,0};
//	static int count ;
//	static int num;
//	static int answer[];
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		n = sc.nextInt();
//		arr = new int[n][n];
//		visited = new boolean[n][n];
//		answer = new int[n*n];
//		num = 1;
//		count = 2;
//		for(int i = 0 ; i < n ; i++) {
//			String s = sc.next();
//			for(int j = 0 ; j <n ; j++) {
//				arr[i][j] = Integer.parseInt(s.charAt(j)+"");
//			}
//		}
//		
//		for(int i = 0 ; i < n ; i++) {
//			for(int j = 0 ; j <n ; j++) {
//				if(arr[i][j] ==1 ) {
//					visited[i][j] = true;
//					dfs(new Node(i,j));
//					answer[count-2] = num;
//					num = 1;
//					count++;
//				}
//			}
//		}
//		int arrAnswer[] = new int[count-2];
//		for(int i = 0 ; i < count-2 ;i++) {
//			arrAnswer[i]=answer[i]; 
//		}
//		
//		System.out.println(count -2);
//		Arrays.sort(arrAnswer);
//		for(int i = 0 ; i < count -2; i++) {
//			System.out.println(arrAnswer[i]);
//		}
//		
//	}
//	
//	public static void dfs(Node node) {
//		int x = node.x;
//		int y = node.y;
//		for(int i =0; i < 4 ; i++) {
//			int nx = x + dx[i];
//			int ny = y + dy[i];
//			if(nx < 0 || ny< 0 || nx>=n|| ny>=n) {
//				continue;
//			}
//			if(arr[nx][ny]==1 && !visited[nx][ny]) {
//				arr[nx][ny] = count;
//				num++;
//				dfs(new Node(nx,ny));
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
//}