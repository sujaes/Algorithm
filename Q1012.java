package git;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class Q1012{
	static int n,m,num;
	static int arr[][];
	static boolean visited[][];
	static Queue<Integer> qx;
	static Queue<Integer> qy;
	static int dx[]={-1,0,1,0};
	static int dy[]={0,1,0,-1};

	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i <t;i++){
			n = sc.nextInt();
			m = sc.nextInt();
			arr = new int[n][m];
			qx= new LinkedList<Integer>();
			qy= new LinkedList<Integer>();
			visited = new boolean[n][m];
			num=0;
			int loop = sc.nextInt();
			for(int j = 0;j<loop;j++){
				int x = sc.nextInt();
				int y = sc.nextInt();
				arr[x][y]=1;
			}
			for(int j = 0;j<n;j++){
				for(int k=0; k<m;k++){
					if(arr[j][k]==1 && !visited[j][k]){
						dfs(j,k);
						num++;	
					}
				}
			}
			System.out.println(num);
		}
	}
	public static void dfs(int s, int e){
		qx.offer(s);
		qy.offer(e);
		visited[s][e]=true;
		while(!qx.isEmpty()){
			int x = qx.poll();
			int y = qy.poll();
			for(int i =0; i <4; i++){
				if(x+dx[i]>=0 && y+dy[i]>=0 && x+dx[i]<n && y+dy[i]<m){
					if(arr[x+dx[i]][y+dy[i]]==1 && !visited[x+dx[i]][y+dy[i]]){
						dfs(x+dx[i],y+dy[i]);
					}
				}
			}
		}
	}
}