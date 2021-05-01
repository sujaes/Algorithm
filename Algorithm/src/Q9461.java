import java.util.*;
public class Q9461 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        long dp[] = new long[101];
        dp[1] = 1; dp[2] = 1; dp[3]= 1; dp[4] = 2; dp[5]=2;
        int k=0;
 
        for(int i =1; i<= T; i++)
        {
            k = sc.nextInt();
            if(k>5)
            {
                for(int j =6; j<=k; j++)
                    dp[j]= dp[j-1]+dp[j-5];
            }
            System.out.println(dp[k]);
        }
    }
}