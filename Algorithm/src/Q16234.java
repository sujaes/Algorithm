import java.util.*;
public class Q16234 {
														//1. 큐에 삽입
	static int n,l,r;
	static int dx[] = {1,-1,0,0};
	static int dy[] = {0,0,1,-1};
	static int arr[][];
	static int answer =0;
	static boolean visited[][];
	static Queue<Nation> q= new LinkedList<Nation>();
	static List<Nation> list = new ArrayList<Nation>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		l = sc.nextInt();
		r = sc.nextInt();
		arr = new int[n][n];
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		while(true) {
//			System.out.println("-------------");
			visited = new boolean[n][n];
			boolean flag = false;
			for(int i = 0 ; i < n ; i++) {
				for(int j = 0 ; j < n ; j++) {
					if(!visited[i][j]) {			//시작점
//						System.out.println("시작점 = " + i + "," + j );
						visited[i][j] = true;

						list.add(new Nation(i,j));	//리스트 삽입
						q.add(new Nation(i,j));		//큐에 삽입
						int sum = arr[i][j];		//합
						while(!q.isEmpty()){	
							Nation na = q.poll();	
							int x = na.x;
							int y = na.y;			
							for(int k = 0 ; k < 4;k++) {
								int nx = x + dx[k];
								int ny = y + dy[k];
								if(nx < 0 || ny< 0 || nx>=n || ny >=n || visited[nx][ny]) {	//좌표를 벗어나거나 or 이미 방문
									continue;
								}
								int checkval = Math.abs(arr[x][y] - arr[nx][ny]);			//차이
								if(checkval>=l && checkval <= r) {							//범위
//									System.out.println("연합국 " + nx + " " + ny);
									flag = true;
									sum += arr[nx][ny];
									list.add(new Nation(nx,ny));
									q.add(new Nation(nx,ny));
									visited[nx][ny] = true;
								}
								
							}
						}
//						System.out.println("연합 끝");
						int size = list.size();
						int devidesum = sum / size;
//						System.out.println("size = " + size );

						for(int k = 0 ; k <size;k++ ) {
							Nation nation = list.get(k);
							arr[nation.x][nation.y] = devidesum;
						}
						sum =0;
						list.clear();
						
					}
				}
			}
			if(flag) {
				answer++;
			}else {
				break;
			}
		}
		System.out.println(answer);
	}
	public static class Nation{
		int x;
		int y;
		public Nation(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

}
