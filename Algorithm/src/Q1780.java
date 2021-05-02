import java.util.*;
public class Q1780 {
	static int n;
	static int arr[][];
	static int zero = 0;
	static int one = 0;
	static int minus =0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		arr= new int[n][n];
		for(int i = 0; i < n ; i++) {
			for(int j = 0; j< n ;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		recur(n,0,0);
		System.out.println(minus);
		System.out.println(zero);		
		System.out.println(one);
		
	}
	public static void recur(int n , int x, int y) {
		if(check(n,x,y)) {
			int temp = arr[x][y];
			if(temp == 0) {
				zero++;
			}else if(temp == -1) {
				minus++;
			}else {
				one++;
			}
		}else {
			int temp = n/3;
			for(int i = 0 ; i <3; i++) {
				for(int j = 0 ; j < 3; j++) {
					recur(temp, x + temp*i ,y + temp*j);
				}
			}
		}
	}
	public static boolean check(int n , int x, int y) {
		int temp = arr[x][y];
		for(int i = x; i < x+n ; i++) {
			for(int j = y; j < y+n; j++) {
				if(temp != arr[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
}
