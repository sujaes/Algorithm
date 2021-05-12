
import java.util.*; 
public class Ans_Knapsack {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();	//������ ����
        int k = sc.nextInt();	//�ִ빫��
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