import java.util.*;
public class Q11051{
	public static int dp[][]= new int[1001][1001];
	
	public static int d(int n, int k){
		if(n==k||k==0){
			return 1;
		}
		
		if(dp[n][k]>0){
			return dp[n][k];
		}
		
		dp[n][k] = d(n-1,k-1) + d(n-1,k);
		
		return dp[n][k]%10007;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		System.out.println(d(n,k));
	}

}