import java.util.Scanner;
class Q2096{
	static int n;
	static int arr[][];
    static int dp[][];
    static int dp1[][];
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	dp= new int[n][3];
    	dp1 = new int[n][3];
    	arr = new int[n][3];
    	for(int i = 0 ; i < n ; i++) {
    		for(int j = 0 ; j <3; j++) {
    			arr[i][j] = sc.nextInt();
    		}
    	}
    	for(int i = 0 ; i < 3; i++) {
        	dp[0][i] = arr[0][i];
        	dp1[0][i] = arr[0][i];
    	}
    	for(int i = 1;  i < n ; i++) {
    		dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1]) + arr[i][0];
    		dp[i][2] = Math.max(dp[i-1][2],dp[i-1][1]) + arr[i][2];
    		dp[i][1] = Math.max(Math.max(dp[i-1][0],dp[i-1][1]),dp[i-1][2]) + arr[i][1];
    		
    		dp1[i][0] = Math.min(dp1[i-1][0],dp1[i-1][1]) + arr[i][0];
    		dp1[i][2] = Math.min(dp1[i-1][2],dp1[i-1][1]) + arr[i][2];
    		dp1[i][1] = Math.min(Math.min(dp1[i-1][0],dp1[i-1][1]),dp1[i-1][2]) + arr[i][1];
    	}    	
    	int max = Math.max(Math.max(dp[n-1][0], dp[n-1][1]),dp[n-1][2]);
    	int min = Math.min(Math.min(dp1[n-1][0], dp1[n-1][1]),dp1[n-1][2]);
    	System.out.println(max + " " + min);
    	
    }
}
