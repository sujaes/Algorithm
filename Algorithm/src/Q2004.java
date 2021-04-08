
//2004번 문제 시간초과
import java.util.*;
public class Q2004{
  public static void main(String[] args){
  	Scanner sc  =new Scanner(System.in);
  	long n = sc.nextLong();
  	long m = sc.nextLong();
  	long size = m;
  	long temp;
  	int five = 0 ;
  	for( int i = 0 ;i<size;i++){
 			temp=n;
 			while(temp%5==0){
     			five++;
     			temp/=5;
 			}
 			temp=m;
 			while(temp%5==0){
     			five--;
     			temp/=5;
  		}
  		m--;
  		n--;        	
  	}    	
		System.out.println(five);    	
	}	
}
