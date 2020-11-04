//import java.util.Scanner;
//
//public class Q4963 {
//    static int n,m;
//    static int arr[][];
//    static boolean visited[][];
//    static int dx[] = {0,0,1,1,1,-1,-1,-1};
//    static int dy[] = {1,-1,1,0,-1,0,1,-1};
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        while(true) {
//            int count =0;
//        	n = sc.nextInt();
//            m = sc.nextInt();
//        	if(n == 0 && m == 0) {
//        		break;
//        	}
//        	//√ ±‚»≠
//        	arr = new int[m][n];
//        	visited = new boolean[m][n];
//        	for(int i = 0 ; i < m; i++) {
//        		for(int j = 0 ; j < n ; j++) {
//        			arr[i][j] = sc.nextInt();
//        		}
//        	}
//     
//        	for(int i = 0 ; i < m; i++) {
//        		for(int j = 0 ; j < n ; j++) {
//        			if(arr[i][j] == 1 && !visited[i][j]) {
//        				dfs(i,j);
//        				count++;
//        			}
//        		}
//        	}
//        	System.out.println(count);
//        	
//        }
//    }
// 
//    
//    public static void dfs(int x,int y) {
//    	visited[x][y] = true;
//		for (int i = 0; i < 8; i++) {
//			int nx = x + dx[i];
//			int ny = y + dy[i];
//			if (nx < 0 || ny < 0 || nx >= m || ny >= n) {
//				continue;
//			}
//			if (arr[nx][ny] == 1 && !visited[nx][ny]) {
//				dfs(nx, ny);
//			}
//		}
//    }
//}
//
//class Node{
//	int x;
//	int y;
//	public Node(int x, int y) {
//		this.x = x;
//		this.y = y;
//	}
//}