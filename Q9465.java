package git;

import java.util.*;

class Q9465{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		for( int i = 0 ; i < a;i++){
			int s = sc.nextInt();
			int arr[][] = new int [3][s+1];
			int dp[][] = new int[3][s+1];
			
			for(int j = 1 ; j<=s;j++){
				dp[1][i] = sc.nextInt();
				dp[2][i] = sc.nextInt();
			}
			dp[1][1] = arr[1][1];
			dp[2][1] = arr[2][1];
			dp[1][2] = arr[2][1]+arr[1][2];
			dp[2][2] = arr[1][1]+arr[2][2];
			
			for(int j=3;j<=s;j++){
				dp[1][j] = Math.max(dp[2][j-1],dp[1][j-2])+arr[1][j];
				dp[2][j] = Math.max(dp[1][j-1],dp[2][j-2])+arr[2][j];				
			}
			
			System.out.println(Math.max(dp[1][s],dp[2][s]));
		}

	}		
}