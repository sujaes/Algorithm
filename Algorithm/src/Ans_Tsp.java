import java.util.Arrays;
import java.util.Scanner;

public class Ans_Tsp {
	static int n;
	static int min = Integer.MAX_VALUE;
	static int arr[][];
	static boolean visited[];
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		n = sc.nextInt();
		arr = new int[n][n];
		visited = new boolean[n];
		
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < n ; j++) {
				arr[i][j] = sc.nextInt();		//갈수 있는 길의 거리
			}
		}
		
		for(int i=0; i<n; i++) {
			dfs(i,i,0,0);
		}
		System.out.println(min);
	}
	public static void dfs(int start, int end, int cnt, int sum) {
		if(cnt == n && start==end) {		//모든 정점 방문하고 돌아온 경우
			min = Math.min(min, sum);
			return;
		}
		
		for(int idx=0; idx<n; idx++) {		//모든 노드 순회
			if(arr[end][idx]==0) {			//길이 없는경우
				continue;
			}
			if(!visited[end] && arr[end][idx]>0) {	//방문한적없고 다음방문위치에서 길이 있는 경우
				visited[end] = true;				//방문하기
				sum += arr[end][idx];				//길더해주기
				dfs(start, idx, cnt+1, sum);		//다음경로에 갈수 있는 경로가 있을경우 다음 경로로
				visited[end] = false;				//방문안하기
				sum -= arr[end][idx];				//길빼주기
			}
		}	
	}
}
