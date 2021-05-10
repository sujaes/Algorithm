//import java.util.*;
//public class Q1328 {
//	static int n,l,r;
//	static long answer;
//	static boolean visited[];
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		n = sc.nextInt();
//		l = sc.nextInt();
//		r = sc.nextInt();
//		answer = 0;
//		
//		
//		LinkedList<Integer> list = new LinkedList<Integer>();
//		visited = new boolean[n];
//		perm(list,visited);
//		
//		System.out.println(answer%1000000007);
//	}
//	public static void perm(LinkedList list, boolean visited[]) {
//		if(list.size()==n) {
////			for(int i =0 ; i < n; i++) {
////				System.out.print(list.get(i) + " " );
////			}
////			System.out.println();
//			if(check(list)) {
//				answer++;
//			}
//			return;
//		}
//		for(int i = 0 ; i < n; i++) {
//			if(!visited[i]) {
//				visited[i] = true;
//				list.add(i);
//				perm(list,visited);
//				visited[i] = false;
//				list.removeLast();
//			}
//		}
//	}
//	
//	public static boolean check(LinkedList<Integer> list) {
//		int leng = list.size();
//		long ans = 0;
//		long max = 0;
//		for(int i = 0 ; i < leng;i++) {
//			if(list.get(i) >= max) {
//				max = list.get(i);
//				ans++;
//			}
//		}
//		if( ans != l) {
//			return false;
//		}
//		
//		ans = 0;
//		max = 0;
//		for(int i =leng-1 ; i >= 0;i--) {
//			if(list.get(i) >= max) {
//				max = list.get(i);
//				ans++;
//			}
//		}
//		if( ans != r) {
//			return false;
//		}
//		
//		
//		return true;
//	}
//	
//	
//	
//	
//	
//}




import java.util.*;
public class Q1328 {
	static int n,l,r;
	static long dp[][][];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		l = sc.nextInt();
		r = sc.nextInt();
		dp = new long[101][101][101];
		dp[1][1][1] = 1;
		for(int i = 2 ; i <= n ;i++) {
			for(int j = 1; j<=l ;j++) {
				for(int k =1; k<=r ;k++) {
					dp[i][j][k] = dp[i-1][j][k]*(i-2) + dp[i-1][j-1][k] + dp[i-1][j][k-1];		//啊款单 //哭率//坷弗率
					dp[i][j][k] %= 1000000007;
				}
			}
		}
		System.out.println(dp[n][l][r]);		
	}
}