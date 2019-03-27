package git;

import java.util.*;
class Q14503{
	static int[][] arr;
	static int n,m,path,cnt;
	static int dx[]= {-1,0,1,0};
	static int dy[] = {0,-1,0,1};
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		n= sc.nextInt();
		m = sc.nextInt();
		arr = new int[n][m];
		path=0;
		cnt=1;
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int look = sc.nextInt();
		//초기화
		for(int i = 0 ; i < n;i++){
			for(int j = 0;j < m;j++){
				arr[i][j] = sc.nextInt();
			}
		}		
		//main
		while(true){
			path=1;
			if(arr[x][y]==0){
				arr[x][y]=9;
			}
			for(int i = 0 ; i < n;i++){
				for(int j = 0;j < m;j++){
					System.out.print(arr[i][j]);;
				}System.out.println();
			}
			System.out.println("----------------");
			for(int i = 0;i<4;i++){
				if( (x+dx[(look+i)%4] >=0) && (x+dx[(look+i)%4] <=n) && (y+dy[(look+i)%4] >=0) && (y+dy[(look+i)%4]<=m)){	
					if(arr[x+dx[(look+i)%4]][y+dy[(look+i)%4]]==0){
						x=x+dx[(look+i)%4];
						y=y+dy[(look+i)%4];										
						if((look+i+1)%4 == 1){
							look = 3;
						}else if((look+i+1)%4 ==3){
							look = 1;						
						}else if((look+i+1)%4 ==0){
							look= 2;
						}else{
							look = 0;
						}
						cnt++;
						System.out.println(" x= "+x + " y= "+y);
						System.out.println(" 방향= "+look);
						System.out.println(" 갯수 = "+ cnt);
						path=0;
						break;
					}
					
				}
			}
			if(path==1){
//				System.out.println(" x= "+x + " y= "+y);
//				System.out.println(" 방향= "+look);
//				System.out.println(" 갯수 = "+ cnt);
				
				if(look==1){
					x= x + dx[0];
					y= y + dy[0];
				}else if(look==3){
					x= x + dx[2];
					y= y + dy[2];
				}else if(look==0){
					x=x+dx[3];
					y=y+dy[3];
				}else{
					x=x+dx[1];
					y=y+dy[1];
				}
			}				
			if(x==n||y==m||x==0||y==0){
				break;
			}
		}
		System.out.println(cnt);
		
	}
}