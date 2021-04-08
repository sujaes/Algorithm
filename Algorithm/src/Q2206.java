//import java.util.Scanner;
//import java.util.Queue;
//import java.util.LinkedList;
//
//// 2206 벽 부수고 이동하기 답
//public class Q2206 {
//	static int N, M, cnt;
//	static int[][] map;
//	static boolean visited[][][];
//	static Queue<Pair> queue;
//	static int[][] temp = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };
//	static boolean flag;
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		N = sc.nextInt();
//		M = sc.nextInt();
//		map = new int[N][M];
//		visited = new boolean[N][M][2];
//
//		for (int i = 0; i < N; i++) {
//			String st = sc.next();
//			for (int j = 0; j < M; j++) {
//				map[i][j] = st.charAt(j) - 48;
//			}
//		}
//		visited[0][0][1] = true;
//		BFS(0, 0, 1);
//		if(flag == true) System.out.println(cnt);
//		else System.out.println("-1");	
//	}
//	public static void BFS(int x, int y, int drill) {
//		queue = new LinkedList<Pair>();
//		queue.offer(new Pair(x, y, drill));
//		visited[x][y][drill] = true;
//		Outter : while (!queue.isEmpty()) {
//			int size = queue.size();
//			for (int j = 0; j < size; j++) {
//				Pair current = queue.poll();
//				
//				if(current.x == N-1 && current.y == M-1) {
//					cnt++;
//					flag = true;
//					break Outter;
//				}
//				
//				for (int i = 0; i < 4; i++) {
//					int nextX = current.x + temp[i][0];
//					int nextY = current.y + temp[i][1];
//
//					if (!isInside(nextX, nextY))
//						continue;
//
//					// 변면을 만나면
//					if (map[nextX][nextY] == 1) {
//						// 드릴을 가지고 있고, 드릴을 사용하지 않고 방문하지 않았은것이 확인되었으면
//						if (current.drill == 1 && visited[nextX][nextY][0] == false) {
//							visited[nextX][nextY][0] = true;
//							queue.add(new Pair(nextX, nextY, 0));
//						}
//					} else {
//						// 이동할 수 있는 곳을 만나면
//						if (visited[nextX][nextY][current.drill] == false) {
//							visited[nextX][nextY][current.drill] = true;
//							queue.add(new Pair(nextX, nextY, current.drill));
//						}
//					}
//				}
//			}
//			cnt++;
//		}
//	}
//	public static boolean isInside(int x, int y) {
//		if (x >= 0 && x < N && y >= 0 && y < M)
//			return true;
//		else
//			return false;
//	}
//}
//
//private staitc class Pair {
//	int x;
//	int y;
//	int drill;
//
//	Pair(int x, int y, int drill) {
//		this.x = x;
//		this.y = y;
//		this.drill = drill;
//	}
//}
//
////2206 벽부수고 이동하기 틀림
//
////import java.util.*;
////class Main{
////	static int n,m;
////	static int arr[][];
////	static boolean visited[][];
////	static boolean wall,check;
////	static Queue<Integer> q1;
////	static Queue<Integer> q2;
////	static int dx[] = {1,-1,0,0};
////	static int dy[] = {0,0,1,-1};
////	public static void main(String[] args){
////		Scanner sc = new Scanner(System.in);
////		n = sc.nextInt();
////		m = sc.nextInt();
////		sc.nextLine();
////		arr =new int[n+1][m+1];
////		visited = new boolean[n+1][m+1];
////		q1 = new LinkedList<Integer>();
////		q2 = new LinkedList<Integer>();
////		wall=true;
////		check = false;
////		//초기화
////		for(int i = 1; i <= n;i++ ){
////			String s = sc.nextLine();
////			for(int j=1; j <=m;j++){
////				if(s.charAt(j-1)=='1'){
////					arr[i][j] = -1;
////				}else{
////					arr[i][j] = Integer.parseInt(s.charAt(j-1)+"");
////				}
////			}
////		}
////		arr[1][1] = 100;
////		//main함수
////		bfs(1,1);
////		
////		if(arr[n][m]==0){
////			System.out.println(-1);
////		}else{
////			System.out.println(arr[n][m]+1-100);
////		}
////	}public static void bfs(int s ,int e ){
////		q1.offer(s);
////		q2.offer(e);
////		visited[s][e]=true;
////		while(!q1.isEmpty()){
////			int x = q1.poll();
////			int y = q2.poll();
////			for(int i = 0 ; i <4; i++){
////				int nextx = x+ dx[i];
////				int nexty = y+ dy[i];
////				if(nextx>0 && nexty>0 && nextx<=n && nexty<=m){
////					if(!visited[nextx][nexty] && arr[nextx][nexty]==0){	
////						visited[nextx][nexty]=true;
////						q1.offer(nextx);
////						q2.offer(nexty);
////						arr[nextx][nexty] = arr[x][y]+1;
////						break;
////					}else if(!visited[nextx][nexty]&&arr[nextx][nexty]==-1 && wall){
////						//다음다음꺼가 길인 경우에
//////						System.out.println("길인데");
////						for(int j = 0 ; j <4; j++){
////							if(nextx+dx[j]>0 && nexty+dy[j]>0 && nextx+dx[j]<=n && nexty+dy[j]<=m){
////								if(arr[nextx+dx[j]][nexty+dy[j]]==0){
//////									System.out.println((nextx+dx[j])+  "  " +(nexty+dy[j]));
////									wall = false;
//////									System.out.println("벽깻어요");
////									q1.offer(nextx);
////									q2.offer(nexty);
////									arr[nextx][nexty] = arr[x][y]+1;
////								}
////							}	
////						}
////					}
////				}
////			}
////			for(int b = 1; b<= n;b++ ){
////				for(int j=1; j <=m;j++){
////					System.out.printf("%3d",arr[b][j]);
////					System.out.print(" ");
////				}System.out.println();
////			}
////			System.out.println("----------");
////					
////		}
////	}
////}