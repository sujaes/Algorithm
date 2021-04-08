
//틀린이유모르겟음
import java.util.Scanner;
public class Q6064 {
	static int rest,ori,cnt;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			cnt=x;
			ori=x;
			if(x==y){
				System.out.println(x);
				continue;
			}
			while(lcm(m,n)>cnt){
				ori += m;
				rest = ori%n;
				cnt+=m;
				if(rest == y){
					System.out.println(cnt);
					break;
				}
			}
			if(cnt>lcm(m,n)){
				System.out.println(-1);
			}
		}	
	}
	public static int gcd(int a, int b) {
	    while (b != 0) {
	        int r = a % b;
	        a = b;
	        b = r;
	    }
	    return a;
	}
	public static int lcm(int a, int b) {
	    return a * b / gcd(a, b);
	}
}