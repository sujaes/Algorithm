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


import java.util.*;
public class Q1535 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int energy[] = new int[n];
		int happiness[] = new int[n];
		for(int i=0; i<n; i++) {
			energy[i] = s.nextInt();
		}
		for(int i=0; i<n; i++) {
			happiness[i] = s.nextInt();
		}
		int[] dp = new int[100];
		int max = 0;
		for(int i=0; i<n; i++) {
			for(int j=99; j>=0; j--) {
				int index = energy[i]+j;
				if(index<100) {
					dp[index] = Math.max(happiness[i]+dp[j], dp[index]);
				}
			}
		}
		for(int i=0; i<100; i++) {
			if(max<dp[i])
				max = dp[i];
		}
		System.out.println(max);
	}
}
