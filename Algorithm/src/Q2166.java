import java.util.Scanner;
 
public class Q2166 {
    static int N;
 
    static class Pair {
        long y;
        long x;
 
        public Pair(long x, long y) {
            super();
            this.y = y;
            this.x = x;
        }
    }
 
    static long ccw(Pair a, Pair b, Pair c) {
        long op = a.x * b.y + b.x * c.y + c.x * a.y;
        op -= (a.y * b.x + b.y * c.x + c.y * a.x);
 
        // 반시계 방향
        if (op > 0)
            return op;
        // 평행
        else if (op == 0)
            return 0;
        // 시계 방향
        else
            return op;
 
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        N = sc.nextInt();
 
        long ans = 0L;
 
        Pair[] polygon = new Pair[N];
 
        for (int i = 0; i < N; i++) {
            polygon[i] = new Pair(sc.nextLong(), sc.nextLong());
        }
 
        for (int i = 1; i < N - 1; i++) {
            ans += ccw(polygon[0], polygon[i], polygon[i + 1]);
        }
        ans = Math.abs(ans);
        
        if(ans%2==0) {
            System.out.println((ans/2)+".0");
        }else {
            System.out.println((ans/2)+".5");
        }
    }
}