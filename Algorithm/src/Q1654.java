import java.util.Arrays;
import java.util.Scanner;

public class Q1654 {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int arr[] = new int[k];
        
        
        for(int i = 0 ; i < k ; i++) {
        	arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        
        long min = 1;
        long max = arr[k-1];
        long middle = 0;
        
        while(min <= max) {
        	long count = 0;
        	middle = (min+max)/2;
        	for(int i = 0 ; i < k ; i++) {
            	count += arr[i]/middle;
            }
        	if(count >= n ) {
        		min = middle+1;
        	}else if(count < n ) {
        		max = middle-1;
        	}
        }
        System.out.println(max);
	}
}
