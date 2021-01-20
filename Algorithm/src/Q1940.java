import java.util.*;
public class Q1940 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr[] = new int[n];
		int s = 0;
		int e = n-1;
		int sum = 0;
		int answer = 0;
		
		for(int i = 0 ; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		sum = arr[s] + arr[e];
		while(s<e) {
			if(sum == m) {
				answer++;
			}
			
			if(sum >= m) {
				sum = sum -arr[e];
				e--;
				sum = sum + arr[e];
			}else if(sum <m) {
				sum = sum - arr[s];
				s++;
				sum = sum + arr[s];
			}
			
			
		}
		
		System.out.println(answer);
		
	}
}
