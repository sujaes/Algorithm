import java.util.*;
public class Q9465 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tcase = sc.nextInt();
		for(int i = 0 ; i < tcase;i++) {
			int n = sc.nextInt();
			int arr[][] = new int[n+1][2];
			int dp[][] = new int[n+1][2];
			for(int j = 1 ; j <= n ; j++) {
				arr[j][0] = sc.nextInt();;
			}
			for(int j =1 ; j <= n ; j++) {
				arr[j][1] = sc.nextInt();;
			}
			dp[1][0] = arr[1][0];
			dp[1][1] = arr[1][1];
			
			for(int k = 2; k <= n; k++) {
//				System.out.println(dp[k-1][1] + " " +dp[k-2][1] + " " + arr[k][0] );
//				System.out.println(dp[k-1][0] + " " +dp[k-2][0] + " " + arr[k][1] );
//				dp[k][0] = Math.max(dp[k-1][1], dp[k-2][1]) + arr[k][0];
//				dp[k][1] = Math.max(dp[k-1][0], dp[k-2][0]) + arr[k][1];
//				dp[k][0] = Math.max(Math.max(dp[k-1][1], dp[k-2][0]),dp[k-2][1]) + arr[k][0];
//				dp[k][1] = Math.max(Math.max(dp[k-1][0], dp[k-2][1]),dp[k-2][0]) + arr[k][1];
			}
			System.out.println(Math.max(dp[n][0],dp[n][1]));
		}
	}
}
