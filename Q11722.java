package git;

//11722¹ø ¹®Á¦
import java.util.Scanner;
public class Q11722{
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int a[]=new int[num];
      int dp[] = new int [num];
      int max=0;
      for(int i=0;i<num;i++){
      	a[i]=sc.nextInt();
      }
      for(int i = 0;i<num;i++){
      	dp[i]=1;
      	for(int j=0;j<i;j++){
      		if(a[i]<a[j]&&dp[i]<dp[j]+1){
      			dp[i]=dp[j]+1;
      		}
      	}
      }
      for(int i=0;i<num;i++){
      	if(dp[i]>max){
      		max= dp[i];
      	}
      }
      System.out.println(max);
  }
}
