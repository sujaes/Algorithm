
//9495¹ø ¹®Á¦
import java.util.Scanner;
public class Q9495{
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int casenum = sc.nextInt();
      int res[] = new int[casenum];
      
      
      for(int s = 0 ; s <casenum;s++){
      	int n=sc.nextInt();
  		int arr[][] = new int[n+1][2];
  		int dp[][] = new int[n+1][2];
      	for(int i = 0 ; i<2;i++){
      		for(int j = 1 ; j<=n;j++){
      			arr[j][i] = sc.nextInt();
      		}
      	}
      	dp[1][0] = arr[1][0];
      	dp[1][1] = arr[1][1];

      	for( int k=2;k<=n;k++){
      		dp[k][0]=Math.max(dp[k-1][1],dp[k-2][1])+arr[k][0];
      		dp[k][1]=Math.max(dp[k-1][0],dp[k-2][0])+arr[k][1];
      	}	
      	System.out.println(Math.max(dp[n][0],dp[n][1]));
      }       
  }
}
