package git;

import java.util.*;
class Q10942{
	static int n,casenum,res;
	static int arr[];
	static int d[];
	static Deque<Integer> dq;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		arr= new int[n+1];
		for(int i = 1; i <=n;i++){
			arr[i] =sc.nextInt();
		}
		casenum = sc.nextInt();
		for(int i = 0; i<casenum;i++){
			int temp;
			dq =new LinkedList<Integer>();
			int s = temp =sc.nextInt();
			int e = sc.nextInt();
			res=1;
			while(temp<=e){
				dq.push(arr[temp]);
				temp++;
			}
			if(s==e){
				res=1;
			}else if((e-s)%2 == 0){
				while(dq.size()>1){
					if(dq.pollFirst()!=dq.pollLast()){
						res=0;
					}
				}
			}else{
				while(!dq.isEmpty()){
					if(dq.pollFirst()!=dq.pollLast()){
						res=0;
					}
				}
			}
			System.out.println(res);
		}
	}
}