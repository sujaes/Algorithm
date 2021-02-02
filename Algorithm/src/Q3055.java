//import java.util.*;
//public class Q3055 {
//	static int r;
//	static int c;
//	static int sx;
//	static int sy;
//	static int ex;
//	static int ey;
//	static char arr[][];
//	static boolean visited[][];
//	static int count[][];
//	static Queue<Node> q;
//	static int dx[] = {0,0,1,-1};
//	static int dy[] = {1,-1,0,0};
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		r = sc.nextInt();	//줄
//		c = sc.nextInt();	//열
//		arr = new char[r][c];
//		visited = new boolean[r][c];
//		count = new int[r][c];
//		q = new LinkedList<Node>();
//		
//		for(int j = 0 ; j < r; j++) {		
//			String temp = sc.next();
//			for(int i = 0; i<c;i++) {
//				arr[j][i] = temp.charAt(i);
//				if(arr[j][i] == 'S') {
//					sx = j;
//					sy = i;
//				}else if(arr[j][i]=='D') {
//					ex = j;
//					ey = i;
//				}
//				count[j][i] = r*c+1;
//			}
//		}
//		count[sx][sy] = 0;
//		
//		Node node = new Node(sx,sy);
//		visited[sx][sy] = true;
//		q.add(node);
//		bfs();
//		
//		if(count[ex][ey] == r*c+1) {
//			System.out.println("KAKTUS");
//		}else {
//			System.out.println(count[ex][ey]);
//		}
//	}
//	public static void bfs() {
//		while(!q.isEmpty()) {
////			System.out.println("QUEUE 돌아가는중 ");
////			System.out.println("x = " + q.peek().x);
////			System.out.println("y = " + q.peek().y);
//			Node node = q.poll();
//			int x = node.x;
//			int y = node.y;
//			for(int i = 0 ; i <4; i++) {
//				int nx = x + dx[i];
//				int ny = y + dy[i];
//				if(nx <0 || ny <0 || nx>=r || ny >=c) {
//					continue;
//				}
//				if(!visited[nx][ny] && arr[nx][ny] == '.' || arr[nx][ny] == 'S') {
//					q.add(new Node(nx,ny));
//					visited[nx][ny] = true;
//					count[nx][ny] = Math.min(count[nx][ny],count[x][y]+1);
//					System.out.println(count[nx][ny]);
//					if(arr[nx][ny] == 'D') {
////						System.out.println("비버집 도착");
//						return;
//					}
//				}
//			}
//		
//		}	
//	}
//	
//	public static class Node{
//		int x;
//		int y;
//		public Node(int x,  int y) {
//			this.x = x;
//			this.y = y;
//		}
//	}
//}
//
//
//
//
import java.util.*;

public class Q3055 {
	static char[][] map;
	static int r, c;
	static int[] dx = { -1, 0, 1, 0 };
	static int[] dy = { 0, -1, 0, 1 };
	static Queue<Point> water = new LinkedList<>();
	static Queue<Point> hedgehog = new LinkedList<>();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		solve();
	}
	private static void solve() {
		// http://mygumi.tistory.com/232
		r = sc.nextInt();
		c = sc.nextInt();
		map = new char[r][c];

		for (int i = 0; i < r; i++) {
			char[] input = sc.next().toCharArray();
			for (int j = 0; j < c; j++) {
				map[i][j] = input[j];

				if (input[j] == '*') {
					water.add(new Point(i, j));
				}

				if (input[j] == 'S') {
					hedgehog.add(new Point(i, j));
				}
			}
		}

		int ans = 0;
		while (true) {
			++ans;
			if (hedgehog.size() == 0) {
				System.out.println("KAKTUS");
				return;
			}

			extendWater();
			if (extendHedgehog()) {
				System.out.println(ans);
				return;
			}
		}
	}

	public static void extendWater() {
		int size = water.size();

		for (int i = 0; i < size; i++) {
			Point p = water.poll();

			for (int j = 0; j < 4; j++) {
				int nx = dx[j] + p.x;
				int ny = dy[j] + p.y;

				if (0 <= nx && nx < c && 0 <= ny && ny < r) {
					if (map[ny][nx] == '.') {
						map[ny][nx] = '*';
						water.add(new Point(ny, nx));
					}
				}
			}
		}
	}

	public static boolean extendHedgehog() {
		int size = hedgehog.size();

		for (int i = 0; i < size; i++) {
			Point p = hedgehog.poll();

			for (int j = 0; j < 4; j++) {
				int nx = dx[j] + p.x;
				int ny = dy[j] + p.y;

				if (0 <= nx && nx < c && 0 <= ny && ny < r) {
					if (map[ny][nx] == 'D') {
						hedgehog.add(new Point(ny, nx));
						return true;
					}
					if (map[ny][nx] == '.') {
						map[ny][nx] = 'S';
						hedgehog.add(new Point(ny, nx));
					}
				}
			}
		}
		return false;
	}

	static class Point {
		int x;
		int y;

		Point(int y, int x) {
			this.x = x;
			this.y = y;
		}
	}
}
