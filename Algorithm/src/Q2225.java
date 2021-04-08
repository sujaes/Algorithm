
//2225¹ø ¹®Á¦
import java.util.Scanner;
public class Q2225{
  public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      
      int N = sc.nextInt();
      int K = sc.nextInt();
      int dp[][] = new int[201][201];
      
      for(int i=1;i<=K;i++) 
          dp[0][i] = 1;
      for(int i=1;i<=N;i++) {
          for(int j=1;j<=K;j++) {
              dp[i][j] = (dp[i][j-1]+ dp[i-1][j])%1000000000;
          }
      }
      System.out.println(dp[N][K]);
  }
}
