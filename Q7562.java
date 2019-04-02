package git;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class Q7562{
	static int n;
	static int arr[][];
	static Queue<Integer> q1;
	static Queue<Integer> q2;
	static int dx []= {1,2,1,2,-1,-2,-1,-2};
	static int dy []= {2,1,-2,-1,2,1,-2,-1};
	static boolean[][] visited;
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for( int i = 0 ; i <testcase;i++){
			q1 = new LinkedList<Integer>();
			q2 = new LinkedList<Integer>();
			n =sc.nextInt();
			visited = new boolean[n][n];
			arr= new int[n][n];
			int sx = sc.nextInt();
			int sy = sc.nextInt();
			int ex = sc.nextInt();
			int ey = sc.nextInt();
			arr[sx][sy] = 0;
			if(sx==ex && sy==ey){

			}else{
				bfs(sx,sy,ex,ey);
			}
			System.out.println(arr[ex][ey]);
		}
		
	}
	public static void bfs(int sx,int sy,int ex,int ey){
		q1.offer(sx);
		q2.offer(sy);
		visited[sx][sy] =true;
		while(!q1.isEmpty()){
			int x = q1.poll();
			int y = q2.poll();
			for(int i = 0 ; i < 8; i ++){
				int nextx = x+dx[i];
				int nexty = y+dy[i];
				if(nextx>=0&&nexty>=0 && nextx<n &&nexty<n){
					if(nextx==ex&&nexty==ey){
						arr[nextx][nexty]=arr[x][y]+1;
						return;
					}
					else if(!visited[nextx][nexty]){
						arr[nextx][nexty]=arr[x][y]+1;
						q1.offer(nextx);
						q2.offer(nexty);
						visited[nextx][nexty]=true;
					}
				}
			}
		}
	}
}