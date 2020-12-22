import java.util.Scanner;

public class Q1783 {
    static int n ,m;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        System.out.println(solve());
        
    }
    static int solve(){
        if(n==1) return 1;
        if(n==2) return Math.min(4, (m+1)/2);
        if(m<7) return Math.min(4, m);
        return m-2;
    }
}