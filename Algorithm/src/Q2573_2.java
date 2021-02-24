import java.util.*;
public class Q2573_2 {
	static int arr[][];
	static boolean visited[][];
	static int melt[][];
	static int n,m;
	static int[] dx = {0,0,1,-1};
	static int[] dy = {1,-1,0,0};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		arr = new int[n][m];
		visited = new boolean[n][m];
		melt = new int[n][m];
		int year = 0;
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < m ; j++) {
				arr[i][j] =sc.nextInt();
			}
		}
		
		while(true) {
			int count = 0 ;
			
			for(int i = 0 ; i < n; i++) {
				for(int j = 0; j< m; j++) {
					if(arr[i][j]!=0 && !visited[i][j]) {
						dfs(i,j);
						count++;
					}
				}
			}
			if(count == 0) {
                System.out.println(0);
                break;
            } else if(count >= 2) {
                System.out.println(year);
                break;
            }
            melt();
            year++;
		}
	}
	
	public static void melt() {
		for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                arr[i][j] -= melt[i][j];
 
                if(arr[i][j] < 0)
                    arr[i][j] = 0;
                                    
                visited[i][j] = false;
                melt[i][j] = 0;
            }
        }
	}
	
	public static void dfs(int x, int y) {
		visited[x][y] = true;
		for(int i = 0 ; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(nx < 0 || ny < 0 || nx >= n || ny >= m) {
				continue;
			}
			if(arr[nx][ny] == 0)
                melt[x][y]++;			
			
			if(arr[nx][ny] != 0 && !visited[nx][ny]) {
				dfs(nx,ny);
			}
		}
	}
	
	
}
