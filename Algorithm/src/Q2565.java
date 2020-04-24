import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Q2565 {
	static int n;
	
	static int dp[], cost[][];
	
	
	public static void main(String[] args)   {
		Scanner sc = new Scanner(System.in);
		
		n=sc.nextInt();
		dp = new int[n+1];
		cost = new int[n+1][2]; // A, B 전봇대 배열
		
		
		for(int i=1;i<=n;i++) {
			for(int j=0;j<2;j++) {
				cost[i][j] = sc.nextInt();
			}
		}
		
		Arrays.sort(cost,new Comparator<int[]>() { //A를 기준으로 오름차순 정렬

			@Override
			public int compare(int[] a, int[] b) {
				if(a[0]<b[0]) return -1;
				else if(a[0]>b[0]) return 1;
				return 0;
			}
			
		});
		
		dp[1] = 1;
		
		for(int i=2;i<=n;i++) { // LIS를 구하는 과정
			dp[i] =1;
			for(int j=1;j<i;j++) {
				if(cost[i][1]>cost[j][1]) {
					dp[i] = Math.max(dp[i], dp[j]+1);
				}
			}
		}
		int max =Integer.MIN_VALUE; // 최댓값이 설치할 수 있는 전긴줄의 최대 개수
		for(int j=1;j<=n;j++) {
			if(dp[j]>max)
				max = dp[j];
		}
		
		System.out.println(n-max); // 최대 개수만큼 설치하면 동시에 최소 개수를 자르는 것이므로 N-MAX를 수행
		
		
	}
	
}