import java.util.Scanner;
public class Q11047{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int arr[] = new int[n];
		int answer = 0;
		
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = n-1 ; i >= 0 ; i--) {
			while(k/arr[i] > 0) {
				k = k - arr[i];
				answer++;
			}
		}
		
		System.out.println(answer);
		
		
    }    
}
