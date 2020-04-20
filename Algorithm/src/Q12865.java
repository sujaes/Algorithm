import java.util.Scanner;

public class Q12865 {
	static int n,k;
	static int dp[][],w[],v[]; // dp�迭�� ����, ��ġ�迭
	
	
	public static void main(String[] args)   {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		k = sc.nextInt();
		
		dp = new int[n+1][k+1];
		
		w =new int[n+1];
		v = new int[n+1];
		
		for(int i=1;i<=n;i++) {			
			w[i] = sc.nextInt();
			v[i]= sc.nextInt();
		
		}
		
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=k;j++) {
				dp[i][j] = dp[i-1][j]; // �⺻������ ���� �������� ��ġ�� �����Ѵ�.
				if(j - w[i]>=0) { // ���Կ��� �ڽ��� ���Ը� ���� �� ���� ���԰� �����ϸ�,
					dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-w[i]]+v[i]); // ���� �����ۿ��� ���� ��ġ�� ���� ������ ��ġ + �ڽ��� ��ġ �� ū ���� ���Ѵ�.
				}
			}
		}
		
		System.out.println(dp[n][k]);
		
		
		
	}
	
}