//import java.util.Scanner;
//
//public class Q12865 {
//	static int n,k;
//	static int dp[][],w[],v[]; // dp�迭�� ����, ��ġ�迭
//	public static void main(String[] args)   {
//		Scanner sc = new Scanner(System.in);
//		n = sc.nextInt();
//		k = sc.nextInt();			//�����ִ�
//		dp = new int[n+1][k+1]; //���԰� i�� �� j��° ���Ǳ��� �־��� ���� �ִ� ��ġ�̴�.
//		w =new int[n+1];
//		v = new int[n+1];
//		
//		for(int i=1;i<=n;i++) {			
//			w[i] = sc.nextInt();
//			v[i]= sc.nextInt();
//		}
//		for(int i=1;i<=n;i++) {			//����
//			for(int j=1;j<=k;j++) {		//���簡���� ����
//				dp[i][j] = dp[i-1][j]; // �⺻������ ���� �������� ��ġ�� �����Ѵ�.
//				if(j - w[i]>=0) { // ���Կ��� �ڽ��� ���Ը� ���� �� ���� ���԰� �����ϸ�,
//					dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-w[i]]+v[i]); // ���� �����ۿ��� ���� ��ġ�� ���� ������ ��ġ + �ڽ��� ��ġ �� ū ��
//				}
//			}
//		}
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=k;j++) {
//				System.out.println(dp[i][j] + " ");
//			}System.out.println();	
//		}
//		System.out.println(dp[n][k]);
//	}
//}
//

import java.util.*; 
public class Q12865 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] w = new int[n+1]; //����
        int[] value = new int[n+1]; //��ġ
        int[] dp = new int[k+1];	//���԰� i�� �� �ִ� ��ġ
 
        for(int i=1; i<=n; i++) {
            w[i] = sc.nextInt();
            value[i] = sc.nextInt();
        }
 
        for(int i=1; i<=n; i++) {			//i��° ������ �������� j�� k������ �ΰ� j-w[i]�� �����ϸ� ����ؼ� j�� -1���ָ鼭 �ִ� ���� ã�´�.
            for(int j=k; j-w[i]>=0;j--) {
                dp[j]=Math.max(dp[j],dp[j-w[i]]+value[i]);
            }
        }
        System.out.println(dp[k]);
    }
}