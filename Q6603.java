package git;

import java.util.Scanner;
class Q6603{
	static int arr[];
	static boolean visited[];
	static int n;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			n = sc.nextInt();
			if(n==0){
				break;
			}
			arr = new int[n];
			visited = new boolean[n];
			for(int i = 0 ; i <n;i++){
				arr[i]= sc.nextInt();
			}
			for(int i = 0 ; i <=n-6;i++){
				visited[i] = true;
				dfs(1,i);
				visited[i] =false;
			}
			System.out.println();
		}
	}
	public static void dfs(int len, int b){
		if(len==6){
			for(int i = 0; i<n;i++){
				if(visited[i]){
					System.out.print(arr[i] +" ");
				}
			}
			System.out.println();
			return ;
		}
		
		for( int i = b;i<n ;i++){
			if(visited[i]){
				continue;
			}
			visited[i]=true;
			dfs(len+1,i);
			visited[i] = false;
		}
	}
}