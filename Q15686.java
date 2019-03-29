package git;
//치킨거리 못품( 조합문제 해결후 다시 수정)
import java.util.*;
class Q15686{
	static int n,m,min,res;
	static int arr[][];
	static boolean visited[][];
	static Queue<Integer> qx;
	static Queue<Integer> qy;
	static ArrayList<Integer> chi;
	static int dx[]={-1,0,1,0};
	static int dy[]={0,1,0,-1};
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		min=1;
		res=0;
		arr = new int[n+1][n+1];
		visited = new boolean[n+1][n+1];
		chi = new ArrayList<Integer>();
		qx= new LinkedList<Integer>();
		qy= new LinkedList<Integer>();
		//초기화
		for(int i = 1; i <=n;i++){
			for(int j =1; j<=n;j++){
				arr[i][j]=sc.nextInt();
				if(arr[i][j]==2){
					chi.add(i);
					chi.add(j);
				}
			}
		}
		//치킨집 조합
		pick();
		
		
		//main함수
		for(int i = 1; i <=n;i++){
			for(int j =1; j<=n;j++){
				if(arr[i][j]==1 && !visited[i][j]){
					dfs(i,j);
					res+= min;
					min=1;
				}
			}
		}
		System.out.println(res);
	}	
	public static void dfs(int s, int e){
		qx.offer(s);
		qy.offer(e);
		visited[s][e]=true;
		while(!qx.isEmpty()){
			int x = qx.poll();
			int y = qy.poll();
			for(int i=0;i<4; i++){
				int nx = x+dx[i];
				int ny = y+dy[i];
				if(nx>0 && ny>0 && nx<=n && ny<=n &&!visited[nx][ny]){
					if(arr[nx][ny]==2){
						System.out.println("min = "+ min);
						return;
					}else if(arr[nx][ny]!=2){
						dfs(nx,ny);
						min++;
					}
				}
			}
		}
	}
	public static void pick(){
	}
}