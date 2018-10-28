package git;

//11727¹ø ¹®Á¦
import java.util.*; 
public class Q11727{

  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] D = new int[1001];
      D[1] = 1;
      D[2] = 3;
      for (int i = 3; i <= n; i++) {
          D[i] = (D[i - 1] + D[i - 2]*2) % 10007;
      }
      System.out.println(D[n]);
  }
}
