package git;

//11054번 문제 바이토닉수열
import java.util.Scanner;

public class Q11054{
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int[] arr1 = new int[num];
      int[] arr2 = new int[num];
      int k = num-1;
      for(int i=0; i<num; i++) {
          arr1[i] = sc.nextInt();
          arr2[k] = arr1[i];
          k--;
      }      
      int[] d1 = new int[num];
      int[] d2 = new int[num];
      for(int i=0; i<num; i++) {
          d1[i] = 1;
          d2[i] = 1;
          for(int j=0; j<i; j++) {
              if(arr1[i] > arr1[j] && d1[i] < d1[j]+1) {
                  d1[i] = d1[j]+1;
              }
              if(arr2[i] > arr2[j] && d2[i] < d2[j]+1) {
                  d2[i] = d2[j]+1;
              }
          }
      }
      k = num-1;
      int sum = d1[0] + d2[k] - 1;
      for (int i=0; i<num; i++) {
          sum = Math.max(sum, d1[i] + d2[k] - 1);
          k--;
      }
      System.out.println(sum);
  }
}
