import java.util.*;

public class Q18222 {
    static long[] arr = new long[64];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long k = sc.nextLong();
        long m = sc.nextLong();
        findArr();
//        for(int i = 0 ; i < 64;i++) {
//        	System.out.println(arr[i]);
//        }
        String answer = "";
        for(long i = k ; i <= m; i++) {
        	answer+= find(i)+"";
        }
//        int answer = find(k);
        System.out.println(answer);
    }

    public static int find(long k) {
        if (k == 1) {
            return 0;
        }
        long N = 0;
        for (int i = 0; i < arr.length; i++) {
            if (k > arr[i]) {
//            	System.out.println("k = " + k + " N = "+ N + " arr[i] = " + arr[i]);
                N = arr[i];
            } else {
                break;
            }
        }
        return 1 - find(k - N);
    }
    public static void findArr() {
        int n = 0;
        while (n < 64) {
            arr[n] = (long) Math.pow(2, n);
            n++;
        }
    }
}
