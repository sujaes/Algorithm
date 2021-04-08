

import java.util.Scanner;

class Q2156{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int dp[] = new int[10001];
		int arr[] = new int [10001]; 
		for(int i =1; i <= a; i++){
			arr[i] = sc.nextInt();
		}

		dp[1] = arr[1];
		dp[2] = dp[1]+arr[2];
		
		for(int i = 3;i<=a;i++){
			dp[i] = Math.max(dp[i-1],Math.max(dp[i-2]+arr[i],dp[i-3]+arr[i-1]+arr[i]));
		}
		
		System.out.println(dp[a]);
		
	}	
}