//import java.util.Scanner;
//
//public class Q1024_1 {
//	static int n,l;
//	static int start,end;
//	static int length =100;
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		n = sc.nextInt();
//		l = sc.nextInt();
//		boolean flag = true;
//		int s = 0;
//		int e = 0;
//		int sum = 0;
//		
//		while(s < n/2) {			
//			if(sum > n) {
//				sum -= s;
//				s++;
//			}else if( sum < n) {
//				e++;
//				sum += e;
//			}else {
//				if(e - s +1 >=l && e-s+1 <length) {
//					flag = false;
//					start = s;
//					end = e;
//					length = e-s +1;
//					sum -= s;
//					s++;
//				}
//			}
//		}
//		if(flag) {
//			System.out.println(-1);
//		}else {
//			for(int i = start; i <=end ;i++) {
//				System.out.print(i + " ");
//			}
//		}
//	}
//
//}

import java.util.Scanner;
public class Q1024 {
	static int n,l;
	static int s,e;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		l=sc.nextInt();
		int min=Integer.MAX_VALUE;//길이
		int sum=0;
		int start=0;
		for (int i = 0; i <=n; i++) {
			sum+=i;
			while(sum>n) {			//합이 n보다 큰경우 s를 뺴줌
				sum-=start;
				start+=1;
			}
			if(sum==n && i-start+1>=l) {	//sum이 n이랑 같고 길이가 l보다 크면
				if(min>i-start+1) {			//기존 길이보다 작으면 
					s=start;
					e=i;
					min=i-start+1;
				}
				if(i-start+1==1) {			//길이가 1이면 break;
					break;
				}
			}
		}
		if(sum-s==n && (e-s+1)>l) {			//마지막값 처리
			s+=1;
		}		
		if(e-s+1>100 || min==Integer.MAX_VALUE) {//길이가 100보다 크거나 그런 수가 없을 때
			System.out.println(-1);
		}else {
			for (int i = s; i <=e; i++) {
				System.out.print(i+" ");
			}
		}	
	}	
}