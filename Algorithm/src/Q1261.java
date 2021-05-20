import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Q1261 {
	static int n,m;
	static char[][] map;
	static int[] dx = { 0, 1, 0, -1 };
	static int[] dy = { 1, 0, -1, 0 };
	static int[][] brokens;

	static class Point implements Comparable<Point> {
		int y;
		int x;
		int broken;

		public Point(int y, int x, int broken) {
			this.y = y;
			this.x = x;
			this.broken = broken;
		}

		@Override
		public int compareTo(Point o) {
			return Integer.compare(this.broken, o.broken);
		}

	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		map = new char[n][m];
		brokens = new int[n][m];

		for (int i = 0; i < n; i++) {
			map[i] = br.readLine().toCharArray();
			Arrays.fill(brokens[i], Integer.MAX_VALUE);
		}

		bfs();
		System.out.println(brokens[n - 1][m - 1]);
	}

	private static void bfs() {
		PriorityQueue<Point> pq = new PriorityQueue<Point>();
		pq.offer(new Point(0, 0, map[0][0] - '0'));
		brokens[0][0] = map[0][0] - '0';

		while (!pq.isEmpty()) {

			Point cur = pq.poll();
			int y = cur.y;
			int x = cur.x;
			int cost = cur.broken;

			if (brokens[y][x] < cost)
				continue;

			for (int d = 0; d < 4; d++) {
				int ny = y + dy[d];
				int nx = x + dx[d];
				if (ny < 0 || nx < 0 || ny >= n || nx >= m)
					continue;
				if (brokens[ny][nx] > brokens[y][x] + (map[ny][nx] - '0')) {
					brokens[ny][nx] = brokens[y][x] + (map[ny][nx] - '0');
					pq.offer(new Point(ny, nx, brokens[ny][nx]));
				}
			}

		}

	}

}