
//2133¹ø ¹®Á¦
import java.util.Scanner;
public class Q2133{
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int[] dp = new int[31];
      dp[0]=1;
      dp[1]=0;
      dp[2]=3;
      
      if(num%2==0){
      	for(int i=4; i<=num; i++) {
              dp[i] = dp[i-2]*3;
              for(int j=4; i-j>=0; j+=2) {
                  dp[i] +=dp[i-j]*2;
              }
          }	
      }          
      System.out.println(dp[num]);
  }
}
