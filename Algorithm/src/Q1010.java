//import java.util.*;
//
//public class Q1010 {
//	static int answer;
//	static int arr[];
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int Tcase = sc.nextInt();
//		
//		for(int T = 0; T < Tcase; T++) {
//			answer =0;
//			int r = sc.nextInt();
//			int n = sc.nextInt();
//			arr = new int[r];
//			comb(n,r,arr,0,0);
//			System.out.println(answer);
//		}
//		
//		
//	}
//	public static void comb(int n, int r, int[] arr ,int index,int target) {
//		if(r == 0) {
//			if(check(arr)) {
//				answer++;
//			}
//			return;
//		}
//		if(target == n) {
//			return;
//		}
//		arr[index] = target;
//    	comb(n, r-1, arr, index+1, target+1); //»Ì´Â°æ¿ì
//    	comb(n, r  , arr, index  , target+1);//¾È»Ì´Â°æ¿ì
//	}
//	public static boolean check(int[] arr) {
//		for(int i = 0 ; i < arr.length-1;i++) {
//			if(arr[i] > arr[i+1]) {
//				return false;
//			}
//		}
//		return true;
//	}
//	
//	
//}



import java.util.*;
class Q1010{
	static int t,n,m;
	static int arr[][];
	static int d[][];
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++){
			int n = sc.nextInt();
			int m = sc.nextInt();
			d =new int[32][32];
			for (int j = 1; j <= m; j++) {
                d[1][j] = j;
            }
			for (int j = 2; j <= n; j++) {
				for (int k = j; k <= m; k++) {
	                for(int l=k;l>=j;l--){
	                	d[j][k]+=d[j-1][l-1];
	                }
	            }
            }
			System.out.println(d[n][m]);
		}
		
	}
}