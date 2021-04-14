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
		sum[1] = 0;							// ó�� ���� = 0
		
		for(int i=2;i<=n+1;i++){			//ù���� ������ �ִ°� ������ 2���� ����
			for(int j =1;j<i;j++){			//������ ����
				if(day[j]+j <=i){			//j�� �ɸ��� �� + �����ϴ� j�� <= ���� ��
					sum[i]= Math.max(sum[i],sum[j]+weight[j]);	//i�����հ� j���� + j�Ͽ� ���� ������ ū���� ����
				}
			}
		}
		System.out.println(sum[n+1]);
	}
}