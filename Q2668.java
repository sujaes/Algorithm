package git;

import java.util.*;	
class Q2668{
	static int n,last;
	static int arr[];
	static boolean visited[];
	static ArrayList<Integer> res;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		arr = new int[n+1];
		res= new ArrayList<Integer>();
		visited = new boolean[n+1];
		
		for(int i = 1 ; i <= n;i++){
			arr[i]= sc.nextInt();
		}
		
		for(int i =1; i <=n; i++){
			visited = new boolean[n+1];
			visited[i]=true;
			last = i;
			dfs(i);
//			visited[i]= false;
		}
		
		Collections.sort(res);
		System.out.println(res.size());
		for(int i = 0 ; i <res.size();i++){
			System.out.println(res.get(i));
		}
	}
	
	public static void dfs(int a){
		if(!visited[arr[a]]){
			visited[arr[a]]=true;
			dfs(arr[a]);
//			visited[arr[a]]= false;
		}
		if(arr[a]==last){
			res.add(last);
		}
	}
}