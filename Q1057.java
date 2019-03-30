package git;

import java.util.Scanner;
class Q1057{
	static int n,a1,a2,cnt;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		n= sc.nextInt();
		a1 = sc.nextInt();
		a2 = sc.nextInt();
		cnt = 0;
		toner(a1,a2);		
	}
	public static void toner(int a,int b){
		while(a!=b){
			a = (a+1)/2;
			b = (b+1)/2;
			cnt++;
		}
		if(a==b){
			System.out.println(cnt);
		}
	}
}