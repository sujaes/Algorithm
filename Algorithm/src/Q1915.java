import java.util.Scanner;

public class Q1915{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		String[] num = new String[1001];
		int dp[][] = new int[1001][1001];
		int map[][] = new int[1001][1001];
		for(int i=1; i<=n; i++) {
			num[i] = sc.next();
			for(int j=1; j<=m; j++) {
				map[i][j] = num[i].charAt(j-1)-'0';
			}
		}
		int answer=0;
		for(int i=1; i<=n; i++){
			for(int j=1; j<=m; j++){
				if(map[i][j] != 0){
					int imsi = Math.min(dp[i-1][j], dp[i-1][j-1]);
					dp[i][j] = Math.min(dp[i][j-1], imsi) + 1;
					answer = Math.max(answer, dp[i][j]);
				}
			}
		}
		System.out.println(answer*answer);
	}
	
}