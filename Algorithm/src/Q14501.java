//
//import java.util.Scanner;
//public class Q14501 {
//	static int day[];
//	static int pay[];
//	static int d[];
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		day = new int[n+1];
//		pay = new int[n+1];
//		d = new int[n+2];
//		for(int i = 1 ; i <=n;i++){
//			day[i] = sc.nextInt();
//			pay[i] = sc.nextInt();
//		}
//		d[1]=0;
//		for(int i=2;i<=n+1;i++){
//			for(int j =1;j<i;j++){
//				if(day[j]+j <=i){
//					d[i]= Math.max(d[i],d[j]+pay[j]);
//				}
//			}
//		}
//		System.out.println(d[n+1]);
//	}
//}


import java.util.Scanner;
public class Q14501 {
	static int day[];
	static int weight[];
	static int sum[];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int now = 0;
		day = new int[n+1];
		weight = new int[n+1];
		sum = new int[n+2];
		
		for(int i = 1 ; i <=n ;i++ ) {
			day[i] = sc.nextInt();
			weight[i] = sc.nextInt();
		}
		sum[1] = 0;							// 처음 이익 = 0
		
		for(int i=2;i<=n+1;i++){			//첫날은 얻을수 있는게 없으니 2부터 시작
			for(int j =1;j<i;j++){			//제시한 이익
				if(day[j]+j <=i){			//j일 걸리는 일 + 시작하는 j일 <= 현재 일
					sum[i]= Math.max(sum[i],sum[j]+weight[j]);	//i일의합과 j일합 + j일에 받은 이익중 큰것을 선택
				}
			}
		}
		System.out.println(sum[n+1]);
	}
}