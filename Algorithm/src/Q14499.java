
import java.util.Scanner;
class Q14499{
	static int[][] arr;
	static int n,m,k;
	static int dx[]= {0,1,-1,0,0}; //동서북남
	static int dy[] = {0,0,0,1,-1}; //동서북남
	static int dice[];
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		n= sc.nextInt();
		m=sc.nextInt();
		int x=sc.nextInt();
		int y=sc.nextInt();
		k=sc.nextInt();
		dice= new int[7];
		int[] nextd =new int[7];
		arr = new int[n+1][m+1];
		//초기화
		for(int i=1;i<=n;i++){
			for(int j =1; j<=m;j++){
				arr[i][j]=sc.nextInt();
			}
		}
		//main
		for(int i =0; i < k; i++){
			int dir = sc.nextInt();
			int nextx=x+dx[dir];
			int nexty=y+dy[dir];
			if(nextx>0 && nextx<=n &&nexty>0 && nexty<=m){
				if(dir==1){
					nextd[3] = dice[1];
					nextd[1] = dice[4];
					nextd[4] = dice[6];
					nextd[6] = dice[3];
					nextd[2] = dice[2];
					nextd[5] = dice[5];
				}else if(dir==2){
					nextd[4] = dice[1];
					nextd[1] = dice[3];
					nextd[3] = dice[6];
					nextd[6] = dice[4];
					nextd[2] = dice[2];
					nextd[5] = dice[5];
				}else if(dir==4){
					nextd[1] = dice[2];
					nextd[5] = dice[1];
					nextd[6] = dice[5];
					nextd[2] = dice[6];
					nextd[4] = dice[4];
					nextd[3] = dice[3];
				}else{
					nextd[2] = dice[1];
					nextd[1] = dice[5];
					nextd[5] = dice[6];
					nextd[6] = dice[2];
					nextd[4] = dice[4];
					nextd[3] = dice[3];
				}
				
				if(arr[nextx][nexty]==0){
					arr[nextx][nexty] = nextd[6];
				}else{
					nextd[6]=arr[nextx][nexty];
					arr[nextx][nexty]=0;
				}
				x=nextx;
				y=nexty;
				for(int z=0;z<7;z++){
					dice[z]=nextd[z];
				}
			}
			System.out.println(dice[1]);
		}
	}
}