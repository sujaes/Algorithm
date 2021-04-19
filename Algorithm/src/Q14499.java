//
//import java.util.Scanner;
//class Q14499{
//	static int[][] arr;
//	static int n,m,k;
//	static int dx[]= {0,1,-1,0,0}; //동서북남
//	static int dy[] = {0,0,0,1,-1}; //동서북남
//	static int dice[];
//	public static void main(String[] args){
//		Scanner sc = new Scanner(System.in);
//		n= sc.nextInt();
//		m=sc.nextInt();
//		int x=sc.nextInt();
//		int y=sc.nextInt();
//		k=sc.nextInt();
//		dice= new int[7];
//		int[] nextd =new int[7];
//		arr = new int[n+1][m+1];
//		//초기화
//		for(int i=1;i<=n;i++){
//			for(int j =1; j<=m;j++){
//				arr[i][j]=sc.nextInt();
//			}
//		}
//		//main
//		for(int i =0; i < k; i++){
//			int dir = sc.nextInt();
//			int nextx=x+dx[dir];
//			int nexty=y+dy[dir];
//			if(nextx>0 && nextx<=n &&nexty>0 && nexty<=m){
//				if(dir==1){
//					nextd[3] = dice[1];
//					nextd[1] = dice[4];
//					nextd[4] = dice[6];
//					nextd[6] = dice[3];
//					nextd[2] = dice[2];
//					nextd[5] = dice[5];
//				}else if(dir==2){
//					nextd[4] = dice[1];
//					nextd[1] = dice[3];
//					nextd[3] = dice[6];
//					nextd[6] = dice[4];
//					nextd[2] = dice[2];
//					nextd[5] = dice[5];
//				}else if(dir==4){
//					nextd[1] = dice[2];
//					nextd[5] = dice[1];
//					nextd[6] = dice[5];
//					nextd[2] = dice[6];
//					nextd[4] = dice[4];
//					nextd[3] = dice[3];
//				}else{
//					nextd[2] = dice[1];
//					nextd[1] = dice[5];
//					nextd[5] = dice[6];
//					nextd[6] = dice[2];
//					nextd[4] = dice[4];
//					nextd[3] = dice[3];
//				}
//				
//				if(arr[nextx][nexty]==0){
//					arr[nextx][nexty] = nextd[6];
//				}else{
//					nextd[6]=arr[nextx][nexty];
//					arr[nextx][nexty]=0;
//				}
//				x=nextx;
//				y=nexty;
//				for(int z=0;z<7;z++){
//					dice[z]=nextd[z];
//				}
//			}
//			System.out.println(dice[1]);
//		}
//	}
//}


import java.util.*;
class Q14499 {
    static int n, m, x, y, k;
    static int[][] map;
    static int[] dir;
    static int[] dx = {0, 0, -1, 1};    // 동서북남
    static int[] dy = {1, -1, 0, 0};

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        x = sc.nextInt();
        y = sc.nextInt();
        k = sc.nextInt();
        map = new int[n][m];
        dir = new int[k];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                map[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < k; i++) {
            dir[i] = sc.nextInt();
        }
        Dice dice = new Dice();

        for (int i = 0; i < k; i++) {
            int direction = dir[i] - 1;
            int nx = x + dx[direction];
            int ny = y + dy[direction];
            if (0 <= nx && nx < n && 0 <= ny && ny < m) {                // 동0, 서1, 북2, 남3
                if (direction == 0) {
                	dice.moveEast();
                }else if (direction == 1) {
                	dice.moveWest();
                }else if (direction == 2) {
                	dice.moveNorth();
                }else if (direction == 3) {
                	dice.moveSouth();
                }

                // 숫자 복사
                if (map[nx][ny] == 0)
                    map[nx][ny] = dice.bottom;
                else {
                    dice.bottom = map[nx][ny];
                    map[nx][ny] = 0;
                }

                // 맨 윗면 출력
                dice.printTopNumber();

                x = nx;
                y = ny;
            }
        }
    }
    
    static class Dice {
        int top, bottom, west, east, south, north;

        public Dice() {
            this.top = 0;
            this.bottom = 0;
            this.west = 0;
            this.east = 0;
            this.south = 0;
            this.north = 0;
        }

        public void moveEast() {
            int temp = top;
            top = west;
            west = bottom;
            bottom = east;
            east = temp;
        }

        public void moveWest() {
            int temp = top;
            top = east;
            east = bottom;
            bottom = west;
            west = temp;
        }

        public void moveSouth() {
            int temp = top;
            top = north;
            north = bottom;
            bottom = south;
            south = temp;
        }

        public void moveNorth() {
            int temp = top;
            top = south;
            south = bottom;
            bottom = north;
            north = temp;
        }

        public void printTopNumber() {
            System.out.println(top);
        }
    }
}