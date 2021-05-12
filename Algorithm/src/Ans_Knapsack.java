
import java.util.*; 
public class Ans_Knapsack {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();	//아이템 갯수
        int k = sc.nextInt();	//최대무게
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