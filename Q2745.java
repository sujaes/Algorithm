package git;

//2745번 문제 런타임오류
import java.util.*;
public class Q2745 {
  public static void main(String args[]){
      Scanner sc = new Scanner(System.in);        
      String st = sc.next();
      int num = sc.nextInt();
      long power = 1;
      int len = st.length();
      long sum=0;
      while(len!=0){
      	if(st.charAt(len-1)>='A'&&st.charAt(len-1)<='Z'){
      		sum+= (st.charAt(len-1)-'A'+10)*power;
      	}else if(st.charAt(len-1)>='0'&&st.charAt(len-1)<='9'){
      		sum+=Integer.valueOf(st,len-1)*power;
      	}
      	power*=num;
      	len--;
      }
      System.out.println(sum); 
  }
}
