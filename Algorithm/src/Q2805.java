import java.util.Arrays;
import java.util.Scanner;

public class Q2805 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i = 0 ; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		
		int minlength = 0;
		int maxlength = arr[n-1];
		
		while(maxlength >= minlength) {
			int middle = minlength + maxlength;
			int cutlength = 0;
			long sum = 0;
			
			for(int i= 0 ;i < n;i++) {
				cutlength = arr[i] - middle;
				if(cutlength < 0) {
					cutlength = 0 ;
				}
				sum += cutlength;
			}
			if(sum >= m) {
				minlength = middle +1;
			}else if(sum <m){
				maxlength = middle -1;
			}
			
		}
		
		System.out.println(maxlength);
		
		
	}
	
}
