package git;

//2609�� ����
import java.util.Scanner;
public class Q2609{
  public static void main(String args[]){
      Scanner sc = new Scanner(System.in);        
      int a =sc.nextInt();
      int b= sc.nextInt();
      int min = a;
      int max = b;
      int temp = 1;
      int temp1= a*b;
      int yak=1;
      if(a>b){
      	max = a;
      	min= b;
      }
      while(yak!=0){ 	
          yak=max%min;
      	max = min;
      	temp=min;
      	min = yak;
      }
      System.out.println(temp);
      System.out.println(temp1/temp);
  }
}
