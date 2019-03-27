package git;

import java.util.Scanner;
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