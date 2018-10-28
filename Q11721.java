package git;

//11721¹ø ¹®Á¦
import java.util.*;
class Q11721{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s =sc.next();
		while(!s.isEmpty()){
	
			if(s.length()>10){
				System.out.println(s.substring(0,10));
				s=s.substring(10,s.length());
			}else{
				System.out.println(s);
				s="";
			}
		}
	}		
}
