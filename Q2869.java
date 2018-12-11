package git;

import java.util.*;

public class Q2869 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c,count=0,day=0;
		
		a= sc.nextInt();
		b=sc.nextInt();
		c= sc.nextInt();
		while(count!=c){
			count = count+a;
			day++;
			if(count>=c){
				break;
			}else{
				count = count-b;
			}
		}
		System.out.println(day);
	}
}