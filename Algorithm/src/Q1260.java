
//1260번 문제 인접행렬로 dfs,bfs구현 dfs도 스택으로 구현한것(재귀도 있음)
import java.util.*;
class Q1260{
	static int n;
	static int m;
	static int[][] edge;
	static boolean[] check;
	static int[][] edge1;
	static boolean[] check1;
	static int start;
	
	public static void main(String args[]){
		Scanner sc = new Scanner (System.in);
		n =sc.nextInt();
		m = sc.nextInt();
		start = sc.nextInt();
		edge=new int[n+1][n+1];
		check  =new boolean[n+1];
		check1  =new boolean[n+1];
		for(int i = 0 ; i <m;i++){
			int a= sc.nextInt();
			int b=sc.nextInt();
			edge[a][b]=1;
			edge[b][a]=1;
		}	
		dfs(start);
		System.out.println();
		bfs(start);
	}
	public static void dfs(int s){
		Stack<Integer> stack = new Stack<Integer>();
		int temp;
		check[s] =true;
		stack.push(s);

		System.out.print(s+" ");

		while(!stack.isEmpty()){
			temp = stack.peek();
			boolean flag = false;
			for(int i = 1; i<=n;i++){
				if(check[i]==false && edge[temp][i]==1){
					check[i]=true;
					System.out.print(i+" ");
					stack.push(i);
					flag = true;
					break;
				}
			}
			if(!flag){
				stack.pop();
			}

		}
//		check[s]=true;
//		System.out.print(s+" ");
//		for( int i = 1; i<=n;i++){
//			if(check[i]==false&& edge[s][i]==1){
//				dfs(i);
//			}
//		}
	}
	public static void bfs(int s){
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(s);
		check1[s] = true;
		System.out.print(s+" ");
		while(!queue.isEmpty()){
			int temp = queue.poll();
			for(int i =1;i<=n;i++){
				if(check1[i]==false && edge[temp][i]==1){
					queue.offer(i);
					check1[i] = true;
					System.out.print(i+" ");
				}
			}
		}	
	}
}
