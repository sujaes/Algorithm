
//1699¹ø ¹®Á¦

import java.util.Scanner;
public class Q1699{
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int[] d = new int[num+1];
      for(int i=1; i<=num; i++) {
          d[i] = i;
          for(int j=1; j*j<=i; j++) {
              d[i] = Math.min(d[i], d[i-j*j]+1);
          }
      }
       
      System.out.println(d[num]);
  }
}
