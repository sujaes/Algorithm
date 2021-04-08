
//11052¹ø ¹®Á¦
import java.util.*; 
public class Q11052{

  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int price[]=new int[n+1];
      int dp[] = new int[n+1];
      
      for(int i = 1 ; i<=n;i++){
      	price[i]=sc.nextInt();
      }
      dp[0]=0;
      dp[1]=price[1];
      for(int i = 2 ; i<=n;i++){
      	dp[i]=price[i];
      	for(int j = 0 ; j <=i;j++){
          	dp[i]= Math.max(dp[i],dp[i-j]+dp[j]);
      	}
      }
      System.out.println(dp[n]);
  }
}
