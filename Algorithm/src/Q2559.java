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
		
		
		for(int i = 0 ; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0 ; i < N - K ; i++) {
			int sum = 0;
			for(int j = i ; j <i+K;j++) {
				sum = sum + arr[j];
			}
			max = Math.max(sum,max);	
		}
		System.out.println(max);
		
	}
}
