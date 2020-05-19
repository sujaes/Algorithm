import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1987 {

	static int R, C;
	static int[][] map;
	static boolean[] visit = new boolean[26];
	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };
	static int ans = 0;

	public static void dfs(int x, int y, int count) {
		if (visit[map[x][y]]) { // 0,0�� ����� ���ĺ��� �̹� �ѹ� �湮�� ���ĺ��̶��,
			ans = Math.max(ans, count); // ������ �������ش�.
			return; // ���ǿ� �����ϹǷ� ����.
		} else {
			visit[map[x][y]] = true;
			for (int i = 0; i < 4; i++) {
				int cx = x + dx[i];
				int cy = y + dy[i];

				if (cx >= 0 && cy >= 0 && cx < R && cy < C) {
					dfs(cx, cy, count + 1);
				}

			}

			visit[map[x][y]] = false;

		}
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		map = new int[R][C];
		for (int i = 0; i < R; i++) {
			String str = br.readLine();
			for (int j = 0; j < C; j++) {
				map[i][j] = str.charAt(j) - 'A';
			}
		}

		dfs(0, 0, 0);
		// (0,0)���� �����ϸ�, ���� �̵��� ��ġ�� 0ȸ

		System.out.println(ans);
	}
}