//package git;
//
//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.Scanner;
//public class Q10026{
//	static char[][] arr;
//	static boolean visited[][];
//	static Queue<Integer> q1;
//	static Queue<Integer> q2;
//	static int res1,a,res;
//	static int dx[] = {1,0,0,-1};
//	static int dy[] = {0,1,-1,0};
//	public static void main(String[] args){
//		Scanner sc= new Scanner(System.in);
//		a = sc.nextInt();
//		sc.nextLine();
//		arr= new char[a+1][a+1];
//		res=0;res1=0;
//		q1 = new LinkedList<Integer>();
//		q2 = new LinkedList<Integer>();
//		//arr 초기화
//		for(int i =1; i<=a;i++){
//			String s= sc.nextLine();
//			for(int j = 1; j<=a;j++){
//				arr[i][j] = s.charAt(j-1);
//			}
//		}
//		//색맹아닌사람
//		visited = new boolean[a+1][a+1];
//		for(int i = 1 ; i <=a;i++){
//			for(int j =1 ; j<=a;j++){
//				if(!visited[i][j]){	
//					bfs(i,j,false);
//					res++;
//				}
//			}
//		}
//		//색맹인사람
//		visited = new boolean[a+1][a+1];
//		for(int i = 1 ; i <=a;i++){
//			for(int j =1 ; j<=a;j++){
//				if(!visited[i][j]){
//					bfs(i,j,true);
//					res1++;
//				}
//			}
//		}
//		
//		System.out.println(res+ " "+ res1);
//	}
//	public static void bfs(int s ,int e,boolean b){
//		if(!visited[s][e]){
//			visited[s][e] =true;
//			q1.offer(s);
//			q2.offer(e);
//			while(!q1.isEmpty()){
//				int x = q1.poll();
//				int y = q2.poll();
//				for(int i=0;i<4;i++){
//					if(x+dx[i]>0 && y+dy[i]>0 && x+dx[i]<=a && y+dy[i]<=a){
//						if(!visited[x+dx[i]][y+dy[i]]){
//							if(!b){
//								if(arr[x][y]==arr[x+dx[i]][y+dy[i]]){
//									q1.offer(x+dx[i]);
//									q2.offer(y+dy[i]);
//									visited[x+dx[i]][y+dy[i]]=true;
//								}
//							}else{
//								if(arr[x][y]==arr[x+dx[i]][y+dy[i]] || (arr[x][y]=='R' && arr[x+dx[i]][y+dy[i]]=='G')||(arr[x][y]=='G' && arr[x+dx[i]][y+dy[i]]=='R')){
//									q1.offer(x+dx[i]);
//									q2.offer(y+dy[i]);
//									visited[x+dx[i]][y+dy[i]]=true;
//								}
//							}
//						}
//					}
//				}
//			}
//		}
//
//	}
//}
