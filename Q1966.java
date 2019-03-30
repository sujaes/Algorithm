package git;

import java.util.LinkedList;
import java.util.Scanner;
class Q1966{
	static int t,cnt;
	static LinkedList<Integer> q;
	static int arr[];
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		q= new LinkedList<Integer>();
		t= sc.nextInt();
		for(int i = 0; i <t ; i++){
			cnt=0;
			int n =sc.nextInt();
			int index = sc.nextInt();
			q=new LinkedList<Integer>();
			for(int j = 0 ; j<n;j++){
				q.offer(sc.nextInt());
			}
			while(!q.isEmpty()){
				int check =1;
				for(int j =1; j<q.size();j++){
					if(q.peek()<q.get(j)){
						check = 0;
						break;
					}
				}
				if(check==1){
					cnt++;
					q.poll();
					if(index==0){
						break;
					}else{
						index = index-1;
					}
				}else{
					int temp = q.poll();
					q.offer(temp);
					if(index==0){
						index=q.size()-1;
					}else{
						--index;
					}
				}
			}
			System.out.println(cnt);

		}
	}
}