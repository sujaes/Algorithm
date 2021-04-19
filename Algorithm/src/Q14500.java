import java.util.*;
public class Q14500 {
	static int n,m;
	static int arr[][];
	static boolean visited[][];
	static int dx[] = {-1,0,1,0};
	static int dy[] = {0,-1,0,1};
	static int max = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		arr = new int[n][m];
		visited = new boolean[n][m];
		for(int i=0; i < n ; i++) {
			for(int j = 0 ; j < m ; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i < n ; i++) {
			for(int j = 0 ; j < m ; j++) {
				dfs(i,j,0,0);
				other(i,j);
			}
		}
		System.out.println(max);
		
	}
	
	public static void dfs(int x,int y, int w,int count) {
		if(count == 4) {
			max = Math.max(max, w);
			return;
		}

		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			if (nx < 0 || ny < 0 || nx >= n || ny >= m) {
				continue;
			}
			if (visited[nx][ny]) {
				continue;
			}
			visited[nx][ny] = true;
			dfs(nx, ny, w + arr[nx][ny],count+1);
			visited[nx][ny] = false;

		}
	}
	
	public static void other(int x,int y) {
		int wing = 4;    // 가운데에서의 상하좌우 날개
        int min = Integer.MAX_VALUE;
        int sum = arr[x][y];
		for(int i = 0 ; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(wing <=2 ){	//양쪽으로 간게 2개이상 없으면 종료
				return;
			}
			if(nx < 0 || ny < 0 || nx >= n || ny >= m) {
				wing--;
				continue;
			}
			min = Math.min(min, arr[nx][ny]);
			sum = sum + arr[nx][ny];
		}
		if(wing ==4) {
			sum = sum - min;
		}
		max = Math.max(max, sum);
	}
}