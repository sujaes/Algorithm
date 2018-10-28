package git;

//1912¹ø ¹®Á¦
import java.util.Scanner; 
public class Q1912{
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int a[]=new int[num];
      int dp[] = new int [num];
      int max;
      for(int i=0;i<num;i++){
      	a[i]=sc.nextInt();
      }
      dp[0]=a[0];
      max=a[0];
      for(int i = 1;i<num;i++){
      	dp[i]= Math.max(dp[i-1]+a[i], a[i]);
      	max = Math.max(max,dp[i]);
      }
      System.out.println(max);
      
  }
}
