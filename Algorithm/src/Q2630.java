//import java.util.*;
//public class Q2630 {
//	static int n;
//	static int arr[][];
//	static int zero = 0;
//	static int one = 0;
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		n = sc.nextInt();
//		arr= new int[n][n];
//		for(int i = 0; i < n ; i++) {
//			for(int j = 0; j< n ;j++) {
//				arr[i][j] = sc.nextInt();
//			}
//		}
//		recur(n,0,0);
//		System.out.println(zero);		
//		System.out.println(one);
//		
//	}
//	public static void recur(int n , int x, int y) {
//		if(check(n,x,y)) {
//			int temp = arr[x][y];
//			if(temp == 0) {
//				zero++;
//			}else {
//				one++;
//			}
//		}else {
//			int temp = n/2;
//			for(int i = 0 ; i <2; i++) {
//				for(int j = 0 ; j < 2; j++) {
//					recur(temp, x + temp*i ,y + temp*j);
//				}
//			}
//		}
//	}
//	public static boolean check(int n , int x, int y) {
//		int temp = arr[x][y];
//		for(int i = x; i < x+n ; i++) {
//			for(int j = y; j < y+n; j++) {
//				if(temp != arr[i][j]) {
//					return false;
//				}
//			}
//		}
//		return true;
//	}
//}
