
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
//시간초과안나는 코드
//import java.util.Scanner;
//class Main{
//	static long a,b,v;
//	public static void main(String[] args){
//		Scanner sc = new Scanner(System.in);
//		a = sc.nextLong();
//		b = sc.nextLong();
//		v = sc.nextLong();
//		long sum= 0;
//		long cnt=0;
//		if((v-a) % (a-b)>0){
//			cnt = (v-a) /(a-b)+2;
//		}else{
//			cnt = (v-a)/(a-b)+1;
//		}
//		System.out.println(cnt);
//	}
//}