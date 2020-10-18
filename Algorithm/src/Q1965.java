import java.util.Scanner;

public class Q1965 {
	static int arr[];
	static int dp[];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        arr =new int[n+1];
        dp = new int[n+1];
        for(int i = 1 ; i < n+1 ; i++) {
        	arr[i] = sc.nextInt();
        } 
        dp[1] = 1;

        for(int i =2; i < n+1; i++) {
            dp[i] = 1;
            for(int j = 1; j<i ; j++) {
            	if(arr[j] <arr[i] && dp[i] < dp[j]+1) {
            		dp[i] = dp[j]+1;
            	}
            }
            if(max <dp[i]) {
            	max = dp[i];
            }
        }
        System.out.println(max);
    }
    
}