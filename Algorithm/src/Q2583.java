import java.util.Arrays;
import java.util.Scanner;

public class Q2583 {
    static int n,m,k,num;
    static int arr[][];
    static boolean visited[][];
    static int temp[];
    static int dy[] = {1,-1,0,0};
    static int dx[] = {0,0,1,-1};
    static int count =0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        k = sc.nextInt();
        
        arr = new int[m][n];
        visited = new boolean[m][n];
        temp = new int[10001];
        for(int w = 0 ; w < k ; w++) {
        	int sx = sc.nextInt();
        	int sy = sc.nextInt();
        	int ex = sc.nextInt();
        	int ey = sc.nextInt();
        	for(int i = sy ; i < ey ; i++) {
            	for(int j = sx ; j < ex ; j++) {
            		arr[i][j] = 1;
            	}
            }
        }
        
        for(int i = 0 ; i < 10001 ; i++) {
        	temp[i] = 10001;
        }

        for(int i = 0 ; i < m ; i++) {
        	for(int j = 0 ; j < n ; j++) {
        		if(arr[i][j] == 0 && !visited[i][j]) {
        			num = 0;
        			dfs(i,j);
        			temp[count] = num;
        			count++;
        		}
        	}
        }
        System.out.println(count);
        Arrays.sort(temp);
        for(int i = 0 ; i < count; i++) {
        	System.out.print(temp[i]+ " ");
        }
    
    }   
    public static void dfs(int x, int y) {
    	num++;
    	visited[x][y] = true;
    	for(int i = 0 ; i < 4; i++) {
    		int nx = x + dx[i];
    		int ny = y + dy[i];
    		if(nx < 0 || ny < 0|| nx >= m || ny >=n) {
    			continue;
    		}
    		if(!visited[nx][ny] && arr[nx][ny]==0) {
    			dfs(nx,ny);
    		}
    	}
    }
    
}
