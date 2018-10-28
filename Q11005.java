package git;

//11005¹ø ¹®Á¦
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Q11005{
  public static void main(String args[]){
      Scanner sc = new Scanner(System.in);        
      int num = sc.nextInt();
      int trans = sc.nextInt();
      char c='A';
      List<Character> a = new ArrayList<Character>();
      while(num/trans!=0){
      	if(num%trans>=10){
      		a.add((char)(c-10+num%trans));
      	}else{
          	a.add(Integer.toString(num%trans).charAt(0)) ;
      	}
      	num = num/trans;
      }
      if(num%trans>=10){
  		a.add((char)(c-10+num%trans));
  	}else{
      	a.add(Integer.toString(num%trans).charAt(0)) ;
  	}        
      Collections.reverse(a);
      for( int i = 0 ; i <a.size();i++){
      	System.out.print(a.get(i));
      }
  }    
}
