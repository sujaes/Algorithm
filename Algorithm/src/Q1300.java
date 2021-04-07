import java.util.Arrays;
import java.util.Scanner;

public class Q1300 {
	static long result = 0 ;
	static int n = 0;
	static int k = 0;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		k = sc.nextInt();
	
		long left = 1;
		long right = k;
		
		System.out.println(bSearch(left, right));
	}
    public static long bSearch(long left, long right) {
        int cnt = 0;
        long mid = (left + right) / 2;
        if(left > right) {
        	return result;
        }
        for(int i = 1; i <= n; i++) {
            cnt += Math.min(mid/i, n);
        }
        
        if(k <= cnt) {
            result = mid;
            return bSearch(left, mid -1);
        }else{
            return bSearch(mid + 1, right);
        }
    }
}