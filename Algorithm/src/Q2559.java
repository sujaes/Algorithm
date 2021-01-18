import java.util.*;

public class Q2559 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int arr[] = new int[N];
		int s = 0;
		int e = 0;
		int max = Integer.MIN_VALUE;
		int sum =0;
		
		for(int i = 0 ; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(;e < K;e++) {
			sum =  sum + arr[e];
		}
		max = Math.max(max,sum);
		
		for(;e < N;e++) {
			sum = sum - arr[s];
			s++;
			sum = sum + arr[e];
			max = Math.max(sum, max);
		}
		
		
		
		System.out.println(max);
		
	}
}
