import java.util.Scanner;
import java.util.Stack;
 
public class Q1012 {
    static int dx[] = {0,0,1,-1};
    static int dy[] = {1,-1,0,0};
    static int n;
    static int arr[][];
    static boolean visited[][];
    static Stack<Pair> st;
    static int x,y;
    
    public static void dfs(Pair p) {
    	st.add(p);
    	visited[p.x][p.y] = true;

		boolean flag = true;

    	while(!st.isEmpty()) {
    		Pair pp = st.peek();
    		
    		for(int i =0; i <4; i++) {
    			int nx = pp.x +dx[i];
    			int ny = pp.y +dy[i];
    			if(nx<0||nx>=x||ny<0||ny>=y) {
    				continue;
    			}
    			if(arr[nx][ny]==1 && !visited[nx][ny]) {
    				dfs(new Pair(nx,ny));
    				flag = false;
    			}
    		}
    		if(flag) {
    			st.pop();
    		}
    	}
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        for(int i = 0 ; i < n; i++) {
        	int count = 0;
        	x = sc.nextInt();
        	y = sc.nextInt();
        	arr = new int[x][y];
        	visited = new boolean[x][y];
        	int z = sc.nextInt();
        	for(int j = 0 ; j<z;j++) {
        		arr[sc.nextInt()][sc.nextInt()] =1;
        	}
        	
        	for(int j = 0 ; j<x; j++) {
        		for(int k = 0;k<y;k++) {
        			if(arr[j][k]==1 && !visited[j][k]) {
        				st = new Stack<Pair>();
        				Pair  p = new Pair(j,k);
        				count++;
        				dfs(p);
        			}
        		}
        	}
        	
        	
            System.out.println(count);        	
        }
    }  
    
    public static class Pair{
    	int x;
    	int y;
    	public Pair(int x, int y) {
    		this.x = x;
    		this.y = y;
    	}
    }
}


