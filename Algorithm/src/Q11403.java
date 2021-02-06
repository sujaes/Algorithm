import java.util.*;
public class Q11403{
	static int arr[][];
	static boolean visited[];
	static int n;
	static Queue<Integer> queue;
	public static void main(String[] args){
		//초기화
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		arr = new int[n+1][n+1];
		visited = new boolean[n+1];
		queue = new LinkedList<Integer>();
		for(int i = 1 ; i <=n;i++ ){
			for(int j=1;j<=n;j++){
				arr[i][j] = sc.nextInt();
			}
		}
		//main함수
		for(int i = 1; i <=n ;i++){
			visited = new boolean[n+1];
			bfs(i);
		}
		//결과출력
		for(int i = 1 ; i <=n;i++ ){
			for(int j=1;j<=n;j++){
				System.out.print(arr[i][j]+" ");
			}System.out.println();
		}
	}
	public static void bfs(int s){
		queue.offer(s);
		while(!queue.isEmpty()){
			int num = queue.poll();
			for(int i = 1;i<=n;i++){
				if(arr[num][i]==1 && !visited[i]){
					queue.offer(i);
					arr[s][i]=1;
					visited[i] =true;
				}
			}
		}
	}
}