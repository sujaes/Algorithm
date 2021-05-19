import java.util.Arrays;
import java.util.Scanner;

public class Q2110 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();

        int[] arr = new int [n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int left = 1;
        int right = arr[n-1]-arr[0];
        int d = 0;
        int ans = 0;

        while(left <= right){
            int mid= (left + right) /2;
            int start = arr[0];
            int count =1;
            for (int i = 0; i <n ; i++) { //�������� �˻���.
                d= arr[i]-start;
                if(d >= mid){ //���� ù��° ������ �Ÿ��� �� ũ�ٸ� ã�Ҵٰ� count �÷��ְ�, ���� ã������ �̹� ���� �־��ش�.
                    count++;
                    start = arr[i];
                }
            }

            if(count>=c){
                ans = mid;
                left = mid + 1;
            }else{
                right = mid-1;
            }
         }
        System.out.println(ans);
    }
}