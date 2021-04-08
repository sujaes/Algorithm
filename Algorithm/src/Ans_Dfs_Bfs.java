import java.util.*;
public class Ans_Dfs_Bfs{
	static int arr[][];
	static int vertex , edge , root;
	static int check[];
	static int check1[];
	public static void main(String[] args){
		Scanner sc  = new Scanner(System.in);
		vertex = sc.nextInt();
		edge = sc.nextInt();
		root = sc.nextInt();
		check = new int[vertex+1];
		check1 = new int[vertex+1];
		
		arr= new int[vertex+1][vertex+1];
		int start,end;
		for(int i = 0 ; i < edge;i++){
			start = sc.nextInt();
			end = sc.nextInt();
			arr[start][end] = arr[end][start] = 1;
		}
		dfs(root);
		System.out.println();
		bfs(root);
	}
	
	public static void dfs(int startpoint){
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(startpoint);
		check[startpoint]=1;
		System.out.print(startpoint+" ");
		for(int i = 1;i<=vertex;i++){
			if(arr[startpoint][i]==1 && check[i]==0){
				dfs(i);
			}
		}
	}
	
	
	public static void bfs(int startpoint){
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(startpoint);
		check1[startpoint]=1;			
		System.out.print(startpoint+" ");
		while(!queue.isEmpty()){
			int temp= queue.poll();
			for(int i = 1 ; i <=vertex;i++){
				if(arr[temp][i]==1 && check1[i]==0){
					queue.add(i);
					check1[i]=1;
					System.out.print(i+" ");

				}
			}
			
		}
		
	}
	
}