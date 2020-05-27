import java.util.Scanner;

public class Q1890 {
	static int arr[][]; 
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in); 
		int N = sc.nextInt(); 
		int[][] maps = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				maps[i][j] = sc.nextInt();
			}
		}
		sc.close(); // 값이 커질 수 있으므로 long 형으로 초기화
		long[][] dp = new long[N][N];
		dp[0][0] = 1;
		for (int x = 0; x < N; x++) {
			for (int y = 0; y < N; y++) {
				int move = maps[x][y];
				if (dp[x][y] == 0 || move == 0)
					continue;
				if (x + move < N) {
					dp[x + move][y] += dp[x][y];
				}
				if (y + move < N) {
					dp[x][y + move] += dp[x][y];
				}
			}
		}
		
		
		System.out.println(dp[N - 1][N - 1]);
	}
}
