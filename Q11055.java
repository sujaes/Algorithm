package git;

//11055¹ø ¹®Á¦
import java.util.*;
class Q11055{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n =  sc.nextInt();
		int dp[] = new int[n+1];
		int a[] =new int[n+1];
		int max= 0;
		for( int i = 1 ;i<=n;i++){
			a[i]=sc.nextInt();
		}
		dp[1]= a[1];
		
		for(int i = 1 ; i <=n;i++){
			dp[i]=a[i];
			for(int j =1;j<i;j++){
				if(a[j]<a[i]&&dp[i]<dp[j]+a[i]){
					dp[i]=dp[j]+a[i];
				}
			}
		}
		for( int i = 1; i<=n;i++){
			if(max<dp[i]){
				max=dp[i];
			}
		}
		
		System.out.println(max);
	}	
}
