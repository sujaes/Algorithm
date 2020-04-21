import java.util.Scanner;

public class Q2748 {

	public static void main(String[] args)   {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long dp[] = new long[n+1];
		dp[0] = 0;
		if(n>0) {
			dp[1] = 1;
		}
		if(n>=2) {
			for(int i = 2 ; i <=n;i++) {
				dp[i] = dp[i-2] +dp[i-1];
			}
		}
		
		System.out.println(dp[n]);
		
		
	}
	
}