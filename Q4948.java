package git;

import java.util.Scanner;
class Q4948{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int s= sc.nextInt();
		int count=0; 
		boolean flag = false;
		while(s!=0){
			count = 0;
			b:for(int i = s+1;i<= 2*s ;i++){
				flag = false;
				for(int j=2;j<=Math.sqrt(i);j++){
					if(i%j==0){
						flag = true;
					}
				}
				if(!flag){
					count++;
				}
			}
			System.out.println(count);
			s = sc.nextInt();
		}
	}
}