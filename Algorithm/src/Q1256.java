//import java.util.*;
//public class Q1256 {
//	static String str;
//	static ArrayList<String> res = new ArrayList<String>();
//	static int n,m,k;
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		str = "";
//		n = sc.nextInt();
//		m = sc.nextInt();
//		k = sc.nextInt();		
//		for(int i = 0 ; i < n ;i++) {
//			str +="a";
//		}
//		for(int i = 0 ; i < m ;i++) {
//			str +="z";
//		}		
//		int check[] = new int[n+m];
//		LinkedList<Character> list = new LinkedList<Character>();
//		per(n+m,n+m,list,check);
//		System.out.println(res.get(k-1));
//	}
//	
//	public static void per(int n, int r, LinkedList<Character> list, int check[]) {
//		if(list.size()==r) {
//			String temp = "";
//			for(int i = 0 ; i < list.size();i++) {
//				temp += list.get(i)+"";
//			}
//			if(!res.contains(temp)) {
//				res.add(temp);
//			}
//			return;
//		}
//		
//		for(int i = 0 ; i < n ;i++) {
//			if(check[i] == 0) {
//				list.add(str.charAt(i));
//				check[i] =1;
//				per(n, r, list, check);
//				check[i] =0;
//				list.removeLast();
//			}
//		}
//	}
//}


import java.io.*;
import java.util.StringTokenizer;

public class Q1256 {

    static double[][] dp;
    static BufferedWriter answer = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int N,M,K;
	    N = Integer.parseInt(st.nextToken());
	    M = Integer.parseInt(st.nextToken());
	    K = Integer.parseInt(st.nextToken());
        dp = new double[N + 1][M + 1];


        if(K>numWord(N,M)) {
            System.out.println("-1");
        }else {
            getWord(N,M,K-1);
        }
        answer.write("\n");
    answer.close();
    }
    static double numWord(int A, int Z){
        if(A==0||Z==0)
            return 1;
        if(dp[A][Z]!=0)
            return dp[A][Z];
        return dp[A][Z]= Double.min(numWord(A-1,Z)+numWord(A,Z-1), 1000000001);
    }

    static void getWord(int A, int Z, double before) throws IOException {
        if(A==0) {
            for (int i = 0; i < Z; i++)
                answer.write("z");
            return;
        }
        if(Z==0){
            for (int i = 0; i < A; i++) 
                answer.write("a");
            return;
            
        }
        double tmp = numWord(A-1, Z);

        if(before < tmp){
            answer.write("a");
            getWord(A-1,Z,before);
        }else {
            answer.write("z");
            getWord(A,Z-1,before-tmp);
        }
    }
}
