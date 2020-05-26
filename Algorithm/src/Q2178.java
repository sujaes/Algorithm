import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
 
public class Q2178 {
    static int n;
    static int m;
    static int[][] arr;
    static boolean[][] visited;
    static int result = 0;
    static Queue<Pair> q;
    static int dx[] = {1,-1,0,0};
    static int dy[] = {0,0,1,-1};
    static int count = 0;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        m = sc.nextInt();
        
        arr = new int[n][m];
        q = new LinkedList<Pair>();
        
        for(int i = 0 ; i < n ; i++) {
    		String temp = sc.next();
        	for(int j= 0 ; j < m ; j++) {
        		arr[i][j] = Integer.parseInt(temp.charAt(j)+"");
        	}
        }
        
        visited = new boolean[n][m];
        
        bfs(new Pair(0,0));
      
    }
    
    public static void bfs(Pair p) {
    	q.add(p);
    	visited[p.a][p.b] = true;
    	while(!q.isEmpty()) {
    		count++;
    		Pair pp = q.poll();
    		for(int i =0; i < 4; i++) {
    			int nx = pp.a + dx[i];
    			int ny = pp.b + dy[i];
    			if(nx <0 || nx>= n || ny<0 || ny>=m) {
    				continue;
    			}
    			if(arr[nx][ny]==1 && !visited[nx][ny]) {
    				q.add(new Pair(nx,ny));
    				visited[nx][ny] = true;
    				arr[nx][ny] = arr[pp.a][pp.b]+1;
    			}
    		}
    	}
    	System.out.println(arr[n-1][m-1]);
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