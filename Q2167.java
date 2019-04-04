package git;

import java.util.Scanner;
class Q2167{
	static int n,m ; 
	static int arr [][] ;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		//배열 초기화
		arr = new int[n+1][m+1];
		for(int i = 1 ; i <= n;i++){
			for(int j = 1; j <=m;j++){
				arr[i][j] = sc.nextInt();
			}
		}
		int tc = sc.nextInt();
		for(int i = 0; i <tc;i++){
			int sx = sc.nextInt();
			int sy = sc.nextInt();
			int ex = sc.nextInt();
			int ey = sc.nextInt();
			int sum = 0;
			for(int k = sx;k<=ex;k++){
				for(int l = sy;l<=ey;l++){
					sum+= arr[k][l];
				}
			}
			System.out.println(sum);			
		}
	}
}