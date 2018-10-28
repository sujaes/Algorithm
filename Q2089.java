package git;

//2089¹ø ¹®Á¦
import java.util.Scanner;

public class Q2089 {
  public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      long input = scan.nextInt();
      String ans="";
      if (input==0){
          System.out.println("0");
          return ;
      }

      while(input!=1){
          if (input%(-2)<0){
              long x =input/(-2)+1;
              x*=2;
              ans+= x+input;
              input = input/(-2)+1;
          }
          else {
              ans+=input%(-2);
              input/=-2;
          }
      }

      ans = ans+"1";
      int len = ans.length();
      for (int i = len-1; i>=0;i--)
          System.out.print(ans.charAt(i));
  }
}
