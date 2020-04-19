import java.util.*;
public class Q11650 {
 
    public static void main(String[] args) throws Exception {
 
        Scanner sc = new Scanner(System.in);
 
        int N = sc.nextInt();
        int[][] arr = new int[N][2];
        for (int i = 0; i < N; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
 
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] x, int[] y) {
                if(x[1]==y[1]){
                    return Integer.compare(x[0], y[0]);
                }
                return Integer.compare(x[1], y[1]);
            }
        });
 
        for (int i = 0; i < N; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
 
}