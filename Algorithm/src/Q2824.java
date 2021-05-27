import java.awt.*;
import java.math.BigInteger;
import java.util.*;
import java.util.List;

//This program prints Welcome to JAVA!
public class Q2824 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n,m;
        n = sc.nextInt();

        BigInteger a = BigInteger.valueOf(1);
        for(int i=0; i<n; i++) {
            a = a.multiply(new BigInteger(sc.next()));
        }
        m = sc.nextInt();
        BigInteger b = BigInteger.valueOf(1);
        for(int i=0; i<m; i++) {
            b = b.multiply(new BigInteger(sc.next()));
        }

        String ans = a.gcd(b).toString();
        if(ans.length() > 9) {
            System.out.println(ans.substring(ans.length()-9, ans.length()));
        } else System.out.println(ans);
    }
}