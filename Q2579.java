package git;

//2579¹ø ¹®Á¦
import java.util.Scanner;
public class Q2579{
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int max = 0 ;
      int st[]=new int[num];
      int dp[]=new int[num];
      for(int i = 0 ; i <num;i++){
      	st[i] =sc.nextInt();
      }
      dp[0]=st[0];
      dp[1]=dp[0]+st[1];
      dp[2] = Math.max(st[1]+st[2],st[0]+st[2]);
      
      for(int i = 3 ;i<num;i++){
      	dp[i]=Math.max(dp[i-3] + st[i-1], dp[i-2])+ st[i];        	
      }
      System.out.println(dp[num-1]);
  }
}
