package git;

import java.util.Scanner;

class Q1932{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int dp[][] = new int[a+1][a+1];
		int max = 0;
		for(int i =1; i <= a; i++){
//			System.out.println(" i = "+ i + "max = "+max);

			for( int j = 1;j<=i;j++){
				dp[i][j] = sc.nextInt();
				
				//인덱스가 같으면 바로 더해주기 arr배열 안만들고 한번에
				if(j==1){
					dp[i][j] =dp[i-1][j]+dp[i][j];
				}else if(j==i){
					dp[i][j] = dp[i-1][j-1]+dp[i][j];
				}else{
					dp[i][j] = Math.max(dp[i-1][j-1],dp[i-1][j])+dp[i][j];
				}
				if(max < dp[i][j]){
					max = dp[i][j];
				}
			}
		}
		System.out.println(max);
	}		
}
