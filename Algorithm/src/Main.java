import java.util.*;
public class Main{
	static int n;
	static int max = 0;
	static int arr[][];
	static int temp[][];
	static int count = 0;
	static boolean visited[][];
	static int dx[] = {1,-1,0,0};
	static int dy[] = {0,0,1,-1};
	static List<Integer> list = new ArrayList<Integer>();
	
	public static void rain(int r) {
		count = 0;
		for(int i = 0 ; i < n ;i++) {
			for(int j = 0 ; j < n ; j++) {
				if(temp[i][j]<=r) {
					temp[i][j] = 0;
				}else {
					temp[i][j] = 1;
				}
			}
		}
		
		for(int i = 0 ; i <n;i++) {
			for(int j = 0 ; j< n;j++) {
				if(temp[i][j] ==1 && !visited[i][j]) {
					dfs(i,j);
					count++;
				}
			}
		}
		list.add(count);
		
	}
	
	public static void copy() {
		temp = new int[n][n];
		for(int i = 0 ; i < n ;i++) {
			for(int j = 0 ; j < n ; j++) {
				temp[i][j] = arr[i][j];
			}
		}
	}
	
	public static boolean check(int x,int y) {
		if(x<0 || y<0 || x>n-1 || y>n-1) {
			return false;
		}else {
			return true;
		}
	}
	
	public static void dfs(int x, int y) {
		visited[x][y] = true;
		for(int i = 0 ; i <4; i++) {
			int nx = x+dx[i];
			int ny = y+dy[i];
			if(check(nx,ny) && temp[nx][ny] ==1 && !visited[nx][ny]) {
				dfs(nx,ny);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		arr= new int[n][n];
		
		for(int i = 0 ; i < n ;i++) {
			for(int j = 0 ; j < n ; j++) {
				arr[i][j] = sc.nextInt();
				if(arr[i][j] > max) {
					max = arr[i][j];
				}
			}
		}
		
		for(int i = 0 ; i < max; i++) {
			visited = new boolean[n][n];
			copy();
			rain(i);
		}
		
		Collections.sort(list);
		Collections.reverse(list);
		System.out.println(list.get(0));		
	}
}