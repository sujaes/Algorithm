import java.math.BigInteger;
import java.util.*;
public class Q2407 {
	public static void main(String[]args) {
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
		
		BigInteger a = BigInteger.ONE;
        BigInteger b = BigInteger.ONE;
        for(int i = 0; i < r; i++){
            a = a.multiply(new BigInteger(String.valueOf(n - i)));
            b = b.multiply(new BigInteger(String.valueOf(i + 1)));
        }
        BigInteger ans = a.divide(b);
        System.out.println(ans);
	}
	
}

