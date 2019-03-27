package git;

import java.util.Scanner;

public class Q1149{
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int r,g,b;
      int arr[][] = new int[n+1][4];
      int d[][] = new int [n+1][n+1];
      r= sc.nextInt();
      g= sc.nextInt();
      b= sc.nextInt();
      d[1][1] = arr[1][1]= r;
      d[1][2] = arr[1][2]= g;
      d[1][3] = arr[1][3]= b;
      
      
      for(int i = 2 ; i <=n; i++) {
         for(int j=1;j<4;j++) {
            arr[i][j]= sc.nextInt();
         }
      }
      
      for(int i=2 ; i <=n;i++) {
         d[i][1] = arr[i][1]+ Math.min(d[i-1][2],d[i-1][3]);
         d[i][2] = arr[i][2]+ Math.min(d[i-1][1],d[i-1][3]);
         d[i][3] = arr[i][3]+ Math.min(d[i-1][1],d[i-1][2]);
      }
      
      int max = Math.min(d[n][1], Math.min(d[n][2],d[n][3]));
      System.out.println(max);
   }
}