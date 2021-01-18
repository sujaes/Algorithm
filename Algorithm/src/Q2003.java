import java.util.*;
public class Q2003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int res = sc.nextInt();
		int arr[] = new int[size+1];
		
		for(int i = 0 ; i <size; i++) {
			arr[i] = sc.nextInt();
		}
		int answer = 0;
		int s = 0;
		int e = 0;
		int sum = 0;
		
		while(e <= size) {
			if(sum < res) {
				sum = sum + arr[e];
				e++;
			}else if(sum >= res) {
				sum = sum - arr[s];
				s++;
			}
			if(sum == res) {
				answer++;
			}
			
//			System.out.println("s = " +s + " e = " + e  +" sum = " + sum + " answer = " + answer);
			
		}
		System.out.println(answer);
		
	}
}
