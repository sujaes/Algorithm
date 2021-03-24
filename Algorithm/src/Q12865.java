//import java.util.Scanner;
//
//public class Q12865 {
//	static int n,k;
//	static int dp[][],w[],v[]; // dp배열과 무게, 가치배열
//	public static void main(String[] args)   {
//		Scanner sc = new Scanner(System.in);
//		n = sc.nextInt();
//		k = sc.nextInt();			//무게최대
//		dp = new int[n+1][k+1]; //무게가 i일 때 j번째 물건까지 넣었을 때의 최대 가치이다.
//		w =new int[n+1];
//		v = new int[n+1];
//		
//		for(int i=1;i<=n;i++) {			
//			w[i] = sc.nextInt();
//			v[i]= sc.nextInt();
//		}
//		for(int i=1;i<=n;i++) {			//물건
//			for(int j=1;j<=k;j++) {		//감당가능한 무게
//				dp[i][j] = dp[i-1][j]; // 기본적으로 이전 아이템의 가치를 저장한다.
//				if(j - w[i]>=0) { // 무게에서 자신의 무게를 뺐을 때 남는 무게가 존재하면,
//					dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-w[i]]+v[i]); // 이전 아이템에서 구한 가치와 남은 무게의 가치 + 자신의 가치 중 큰 값
//				}
//			}
//		}
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=k;j++) {
//				System.out.println(dp[i][j] + " ");
//			}System.out.println();	
//		}
//		System.out.println(dp[n][k]);
//	}
//}
//

import java.util.*; 
public class Q12865 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] w = new int[n+1]; //무게
        int[] value = new int[n+1]; //가치
        int[] dp = new int[k+1];	//무게가 i일 때 최대 가치
 
        for(int i=1; i<=n; i++) {
            w[i] = sc.nextInt();
            value[i] = sc.nextInt();
        }
 
        for(int i=1; i<=n; i++) {			//i번째 물건을 기준으로 j를 k값으로 두고 j-w[i]가 가능하면 계속해서 j를 -1해주면서 최대 값을 찾는다.
            for(int j=k; j-w[i]>=0;j--) {
                dp[j]=Math.max(dp[j],dp[j-w[i]]+value[i]);
            }
        }
        System.out.println(dp[k]);
    }
}