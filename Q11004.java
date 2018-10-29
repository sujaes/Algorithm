package git;

//11004¹ø ¹®Á¦ 
import java.util.*;
public class Q11004{
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n =sc.nextInt();
      int k =sc.nextInt();
      int a[] = new int[n];
      for(int i = 0  ; i <n;i++){
      	a[i]= sc.nextInt();
      }
      Arrays.sort(a);
      System.out.println(a[k-1]);
  }    
}
