
//1934¹ø ¹®Á¦
import java.util.Scanner;
public class Q1934{
  public static void main(String args[]){
      Scanner sc = new Scanner(System.in);        
      int num = sc.nextInt();
      for(int i = 0 ; i <num;i++){
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
          System.out.println(temp1/temp);
      } 
  }
}
