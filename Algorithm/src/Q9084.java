import java.util.*;

public class Q9084 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0){
			int n = sc.nextInt();
			int a[] = new int[n+1];
			for(int i=1;i<=n;i++) {
				a[i] = sc.nextInt();
			}
			int m = sc.nextInt();
			
			int d[] = new int[m+1];
			
            d[0] = 1;
			for (int i = 1; i <= n; i++) { //동전 순서
				for (int j = a[i]; j <= m; j++) {
					System.out.println("j = " + j + "d[j] = " + d[j] + " d[j - a[i]]=  " + d[j - a[i]] + " a[i] = " + a[i]);
					d[j] += d[j - a[i]];
				}
			}
			for(int i = 0 ; i < m ; i++ ) {
				System.out.println(" d[ " + i+ "]  = " + d[i]);
			}
			System.out.println(d[m]);
		}
	}
}