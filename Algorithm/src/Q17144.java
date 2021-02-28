import java.util.*;
public class Q17144{
	static int r,c,t;
	static int arr[][]; //먼지 
	static int vacuum[][]; //청소기 좌표
	static int temp[][]; //먼지 퍼진거 저장
	static boolean visited[][]; //방문확인
	
	static int[] dx = {1,-1,0,0};
	static int[] dy = {0,0,1,-1};
	
	public static void upper(){
		for(int i = vacuum[0][0]-1 ; i > 0;i--){
			arr[i][0] = arr[i-1][0];
		}
		for(int j = 1 ; j < c;j++){
			arr[0][j-1]=arr[0][j];
		}
		for(int i= 0; i<vacuum[0][0];i++){
			arr[i][c-1]=arr[i+1][c-1]; 
		}
		for(int j = c-1; j > 0; j--){
			arr[vacuum[0][0]][j] = arr[vacuum[0][0]][j-1];
		}
		arr[vacuum[0][0]][1] = 0;
	}
	
	public static void lower(){
		for(int i = vacuum[1][0]+1 ; i < r-1;i++){
			arr[i][0] = arr[i+1][0];
		}
		for(int j = 0 ; j < c-1;j++){
			arr[r-1][j]=arr[r-1][j+1];
		}
		for(int i= r-1; i>vacuum[1][0];i--){
			arr[i][c-1]=arr[i-1][c-1]; 
		}
		for(int j = c-1; j > 0; j--){
			arr[vacuum[1][0]][j] = arr[vacuum[1][0]][j-1];
		}
		arr[vacuum[1][0]][1] = 0;
	}
	
	public static boolean check(int y, int x){
		if(y<0 || x<0 || y>r-1 || x>c-1 || (y==vacuum[0][0] && x ==vacuum[0][1]) || (y==vacuum[1][0] && x ==vacuum[1][1]) ){
			return false;
		}else{
			return true;
		}
	}
	
	public static void update(){
		for(int j=0; j < r; j++){
			for(int k = 0 ; k < c ;k++){
				arr[j][k] += temp[j][k];	
			}
		}
		temp  = new int[r][c];
	}
	
	public static void printArr(){
		for(int i = 0 ; i < r; i++){
			for(int j = 0 ; j < c; j++){
				System.out.printf("%3d" ,arr[i][j]);
			}System.out.println();
		}
		System.out.println("---------------");
	}
	
	public static void spread(int y,int x){
	for(int i = 0 ; i <4; i++){
		int ny = y+dy[i];
		int nx = x+ dx[i];
		if(check(ny,nx) && !visited[ny][nx]){
			temp[ny][nx]+= arr[y][x]/5;
			temp[y][x] -= arr[y][x]/5;
		}
	}		
}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		r=sc.nextInt();
		c= sc.nextInt();
		t= sc.nextInt();
		vacuum = new int[2][2];
		arr = new int[r][c];
		int sum = 0 ;
		
		for(int i = 0 ; i < r; i++){
			for(int j = 0 ; j < c; j++){
				arr[i][j] = sc.nextInt();
			}
		}
		
		a: for(int i = 0 ; i <r;i++){
			for(int j = 0; j <c; j++){
				if(arr[i][j]==-1){
					vacuum[0][0]=i;
					vacuum[0][1]=j;
					vacuum[1][0]=i+1;
					vacuum[1][1]=j;
					arr[i][j]=0;
					arr[i+1][j]=0;
					break a;

				}
			}
		}
		
		for(int i = 0 ; i<t; i++){
			visited =new boolean[r][c];
			temp = new int[r][c];
			for(int j=0; j < r; j++){
				for(int k = 0 ; k < c ;k++){
					if(arr[j][k]!=0){
						spread(j,k);
					}
				}
			}
			update();
			upper();
			lower();
//			printArr();			
		}
		
		for(int i = 0 ; i < r; i++){
			for(int j = 0 ; j < c; j++){
//				System.out.printf("%3d" ,arr[i][j]);
				sum+= arr[i][j];
//			}System.out.println();
			}
		}
		
		System.out.println(sum);
		
	}
}
