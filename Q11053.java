package git;

//11053¹ø ¹®Á¦
import java.util.*;
class Q11053{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n =  sc.nextInt();
		int dp[] = new int[n+1];
		int a[] =new int[n+1];
		int max= 0;
		for( int i = 1 ; i <=n;i++){
			a[i]=sc.nextInt();
		}
		for(int i =1;i<=n;i++){
			dp[i]=1;
			for(int j =1; j<i;j++){
				if(a[j]<a[i]&&dp[i]<dp[j]+1){
					dp[i]=dp[j]+1;
				}
			}
		}
		for(int i =1;i<=n;i++){
			if(dp[i]>max){
				max = dp[i];
			}
		}
		
	System.out.println(max);
	}	
}
