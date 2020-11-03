import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q1697 {
	static int n,m;
	static int dx[] = {-1,1,2};
	static int visited[];
	static Queue<Integer> q ;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		q = new LinkedList<Integer>();
		visited = new int[100001];
		bfs(n);	
	}
	
	public static void bfs(int nn) {
		visited[nn] = 1;
		q.add(nn);
		while(!q.isEmpty()) {
			int s = q.poll();
			if(s == m) {
				System.out.println(visited[m] -1);
				break;
			}
			
			for(int i = 0 ; i < 3; i++) {
				int nx =0;
				if(dx[i]==2) {
					nx = s * dx[i];
				}else {
					nx = s + dx[i];
				}
				
				if(nx <0 || nx > 100000) {
					continue;
				}
				
				if(visited[nx]==0) {
					visited[nx] = visited[s] +1;
					q.add(nx);
				}
			}
		}		
	}
}