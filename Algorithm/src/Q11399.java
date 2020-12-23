import java.util.Arrays;
import java.util.Scanner;
class Q11399 {
	static int n,m;
	static boolean visited[];
	static int arr[];
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	arr = new int[n];
    	int sum =0 ;
    	for(int i = 0 ; i < n ; i++) {
    		arr[i] = sc.nextInt();
    	}
    	Arrays.sort(arr);
    	
    	int temp =0;
    	for(int i = 0 ; i <n ;i++) {
    		temp += arr[i];
    		sum += temp;
    	}
    	System.out.println(sum);
    }
}
