package git;

//1463¹ø ¹®Á¦
import java.util.*;
class Q1463{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int res = sc.nextInt();
		int dp[] = new int[res+1];
      dp[0]=dp[1]=0;
		for(int i = 2 ; i<=res;i++){
          dp[i] = dp[i-1]+1;
          if(i%2==0){
              dp[i] = Math.min(dp[i],dp[i/2]+1);
          }
          if(i%3==0){
              dp[i] =Math.min(dp[i],dp[i/3]+1);
          }
      }
		System.out.println(dp[res]);
	}		
}
