import java.util.*;

public class Q11660 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1 = 0, x2 = 0, y1 = 0, y2 = 0;
		int N = sc.nextInt();
		int M = sc.nextInt();
		int  arr[][] = new int[N + 1][N + 1];
		int dp[][] = new int[N + 1][N + 1];
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				dp[i][j] = dp[i - 1][j] + dp[i][j - 1] - dp[i - 1][j - 1] + arr[i][j];	//가로전 +  세로전 - 대각선전 + 현재값
			}
		}

		for (int k = 0; k < M; k++) {

			x1 = sc.nextInt();
			y1 = sc.nextInt();
			x2 = sc.nextInt();
			y2 = sc.nextInt();

			System.out.println(dp[x2][y2] - dp[x2][y1 - 1] - dp[x1 - 1][y2] + dp[x1 - 1][y1 - 1]);

		}

	}
}
