import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Q1920 {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();        
        int[] arr = new int[n];
        for(int i=0; i< n; i++){
            arr[i] = sc.nextInt();
        }
        /* 이진탐색을 위한 오름차순으로 정렬 */
        Arrays.sort(arr);
        int m = sc.nextInt();
        int[] comArr = new int[m];
        for(int j=0; j<m; j++){
            comArr[j] = sc.nextInt();// 주어질 수에 대한 배열
        }
        
        for(int i =0; i<m; i++){ // 지금부터 주어진 수가 aArray 배열에 담긴 수와 일치하는지 반복문을 통해 찾을 것이다.
            int flag = 0;
            int max = n; 
            int min = -1; 
            int middle = 0; 
            
            while(max - min > 1){
//            	System.out.print("min = " + min + " max = "+ max + " middle = " + middle);
                middle = (min+max)/2; 
                if(comArr[i] == arr[middle]){
                    flag = 1;
                    break;
                }
                if(comArr[i] > arr[middle]){
                    min = middle;
                }else if(comArr[i] < arr[middle]){
                    max = middle;
                }
//            	System.out.println(">>>> min = " + min + " max = "+ max + " middle = " + middle);

            }
            System.out.println(flag);
            
        }
    }
}
