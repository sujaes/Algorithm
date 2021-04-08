//package git;
//
//import java.util.*;
//public class Q1003{
//	public static void main(String[] args){
//		Scanner sc = new Scanner(System.in);
//		int TestCase = sc.nextInt();
//		for (int t = 0; t < TestCase; t++) {
//          int n = sc.nextInt();
//          int[][] arr = new int[n+1][2];
//          // 0일때
//          if(n==0) {
//              System.out.println("1 0");
//              continue;
//          }
//          // 1일때
//          if(n==1){
//              System.out.println("0 1");
//              continue;
//          }
//          arr[0][0] = 1;
//          arr[1][1] = 1;
//          
//          for(int i=2; i<=n; i++){
//              arr[i][0] = arr[i-1][0]+arr[i-2][0];
//              arr[i][1] = arr[i-1][1]+arr[i-2][1];
//              
//          }
//
//          System.out.println(arr[n][0]+" "+arr[n][1]);
//
//      }
//	}
//}