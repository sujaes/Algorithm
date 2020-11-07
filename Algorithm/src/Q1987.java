//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//public class Q1987 {
//
//	static int R, C;
//	static int[][] map;
//	static boolean[] visit = new boolean[26];
//	static int[] dx = { -1, 1, 0, 0 };
//	static int[] dy = { 0, 0, -1, 1 };
//	static int ans = 0;
//
//	public static void dfs(int x, int y, int count) {
//		if (visit[map[x][y]]) { // 0,0에 저장된 알파벳이 이미 한번 방문한 알파벳이라면,
//			ans = Math.max(ans, count); // 정답을 갱신해준다.
//			return; // 조건에 만족하므로 리턴.
//		} else {
//			visit[map[x][y]] = true;
//			for (int i = 0; i < 4; i++) {
//				int cx = x + dx[i];
//				int cy = y + dy[i];
//
//				if (cx >= 0 && cy >= 0 && cx < R && cy < C) {
//					dfs(cx, cy, count + 1);
//				}
//
//			}
//
//			visit[map[x][y]] = false;
//
//		}
//	}
//
//	public static void main(String[] args) throws IOException {
//
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
//
//		R = Integer.parseInt(st.nextToken());
//		C = Integer.parseInt(st.nextToken());
//		map = new int[R][C];
//		for (int i = 0; i < R; i++) {
//			String str = br.readLine();
//			for (int j = 0; j < C; j++) {
//				map[i][j] = str.charAt(j) - 'A';
//			}
//		}
//
//		dfs(0, 0, 0);
//		// (0,0)부터 시작하며, 현재 이동한 위치는 0회
//
//		System.out.println(ans);
//	}
//}


import java.util.Scanner;
 
public class Q1987 {
    static int r;
    static int c;
    static int[][] arr;
    static int[] check;
    static int[][] arr_check;
    static int dx[] = {-1, 1, 0, 0};
    static int dy[] = {0, 0, -1, 1};
    static int cnt = 0;
    static int max = 0;
    public static void dfs (int m, int n, int cnt) {
    
        if(max<cnt) max = cnt;
        
        for(int i=0;i<4;i++) {
            int nx = m + dx[i];
            int ny = n + dy[i];
            
            if(nx>=0 && nx<r && ny>=0 && ny<c) {
                int k = arr[nx][ny];
                if(check[k]==0) {
                    check[k]++;
                    dfs(nx,ny,cnt+1);
                    check[k]--; // 다른 경로도 탐색 가능하도록 다시 빼준다.
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        r = scan.nextInt();
        c = scan.nextInt();
        scan.nextLine();
        arr = new int[r][c];
        check = new int['Z'-'A'+1];
        for(int i=0;i<r;i++) {
            char[] tmp = scan.nextLine().toCharArray();
            for(int j=0;j<c;j++) {
                char apb = tmp[j];
                arr[i][j] = (int)apb-'A';
            }
        }
        max = 0;
        check[arr[0][0]]++;
        dfs(0,0,1);
        System.out.println(max);
    }
 
}
