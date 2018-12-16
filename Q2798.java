package git;

import java.util.*;

class Q2798{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a,b;
		a= sc.nextInt();
		b= sc.nextInt();
		int sum= 0 ;
		int temp=300000;
		int c[] = new int[a];
		for(int i = 0 ; i<a; i++){
			c[i]=sc.nextInt();
		}
		int res =c[1]+c[2]+c[0] ;
		for(int i=0;i<a-2;i++){
			for(int j = i+1 ; j<a-1;j++){
				for( int k =j+1;k<a;k++){
					sum = c[i]+c[j]+c[k];
					if(sum==b){
						res=sum;
						System.out.println(res);
						return ;
						
					}else if(sum<b){
						if(temp>b-sum){
							temp = b-sum;
							res= sum;
						}
					}
				}
			}
		}
		System.out.println(res);
	}
}