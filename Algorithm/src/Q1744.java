import java.util.Arrays;
import java.util.Scanner;

public class Q1744 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        long ans =0;

        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int left = 0;
        int right = n-1;
        ans = 0;
        // 0, À½¼ö
        for (; left < right ; left+=2) {
            if(arr[left] <1 && arr[left+1] < 1){
               ans += arr[left] * arr[left+1];
               System.out.println(arr[left] + " " + arr[left+1]);
            }else{
                break;
            }
        }

        // ¾ç¼ö
        for (; right >0; right-=2) {
            // 1Àº °ö¼ÀX
            if(arr[right] >1 && arr[right-1] > 1){
                ans += arr[right] * arr[right-1];
                System.out.println(arr[right] + " " + arr[right-1]);
            }else{
                break;
            }
        }
        for (; right >= left; right--) {
            ans += arr[right];
        }
        System.out.println(ans);
    }
}