//import java.io.*;
//
//
//public class Q1535 {
//    public static void main(String[] args) throws IOException{
//        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine()); 
//        int[] DP = new int[100];
//        int[] L = new int[n];
//        int[] J = new int[n];
//        String[] inputs;
//        inputs = br.readLine().split(" ");
//        for(int i=0; i<n ; i++) {            
//            L[i] = Integer.parseInt(inputs[i]);
//        }
//        inputs = br.readLine().split(" ");
//        for(int i=0; i<n ; i++) {            
//            J[i] = Integer.parseInt(inputs[i]);
//        }
//        int max = -1;
//        
//        for(int i=0 ; i<n; i++) {
//            for(int j = 99; j>=L[i] ; j--) {
//
//                DP[j] = Math.max(DP[j], DP[j-L[i]] + J[i]);                                
//                // max = Math.max(max, DP[i]);
//                
//            }
//        }
//        System.out.println(DP[99]);
//    }
//}

//import java.util.*;
//public class Q1535 {
//	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		int n = s.nextInt();
//		int energy[] = new int[n];
//		int happiness[] = new int[n];
//		for(int i=0; i<n; i++) {
//			energy[i] = s.nextInt();
//		}
//		for(int i=0; i<n; i++) {
//			happiness[i] = s.nextInt();
//		}
//		int[] dp = new int[100];
//		int max = 0;
//		for(int i=0; i<n; i++) {
//			for(int j=99; j>=0; j--) {
//				int index = energy[i]+j;
//				if(index<100) {
//					dp[index] = Math.max(happiness[i]+dp[j], dp[index]);
//				}
//			}
//		}
//		for(int i=0; i<100; i++) {
//			if(max<dp[i])
//				max = dp[i];
//		}
//		System.out.println(max);
//	}
//}

import java.util.*;
public class Q1535 {
 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] L = new int[N+1];
		int[] J = new int[N+1];
		int[][]dp =new int [21][101];
		int max=0;
		for(int i = 1 ; i<=N;i++) {
			L[i]=sc.nextInt();
		}
		for(int i = 1 ; i<=N;i++) {
			J[i]=sc.nextInt();
		}
		//i 번째 물건을 배낭에 넣을 수 없다.
		//-> i-1 개의 물건들을 갖고 구한 전 단계의 값을 그대로 가져온다.
		//i 번째 물건을 배낭에 넣을 수 있다.
		//-> max(i-1 개의 물건들을 갖고 구한 전 단계의 값, i번째 물건만큼의 무게를 비웠을 때의 값 + i 번째 물건)
		for(int i = 1 ; i<=N;i++) {
			for(int j=1; j<100;j++) {
				if(L[i] <=j && (dp[i-1][j-L[i]] + J[i] > dp[i][j])) {
					dp[i][j] = Math.max(J[i] + dp[i-1][j - L[i]], dp[i-1][j]);
				}
				else
					dp[i][j] = dp[i-1][j];
				max = Math.max(dp[i][j], max);
			}
		}
		System.out.println(max);
	}
 }



