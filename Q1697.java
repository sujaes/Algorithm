package git;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Q1697{
	static int arr[];
	static int n,m,res;
	static Queue<Integer> q1;
	
	public static void main(String[] args){
		//초기화
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		arr = new int[100001];		
		q1 = new LinkedList<Integer>();
		//main함수
		bfs(n);
	}
	public static void bfs(int s){
		arr[s]=1;
		q1.offer(s);
		while(!q1.isEmpty()){			
			int a = q1.poll();
			if(a==m){
				System.out.println(arr[a]-1);
				break;
			}else{
				if(a-1>=0 && arr[a-1]==0){
					arr[a-1]= arr[a]+1;
					q1.offer(a-1);
				}
				if(a+1<=100000 && arr[a+1]==0){
					arr[a+1]=arr[a]+1;
					q1.offer(a+1);
				}
				if(2*a<=100000 && arr[2*a]==0){
					arr[2*a] = arr[a]+1;
					q1.offer(2*a);
				}
			}
		}
	}
}