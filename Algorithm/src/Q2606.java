import java.util.ArrayList;
import java.util.Scanner;

public class Q2606 {
	static int node;
	static int edge;
	static ArrayList<Integer>[] list;
	static boolean visited[];
	static int count;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		node = sc.nextInt();
		edge = sc.nextInt();
		visited = new boolean[node]; 
		list = new ArrayList[node];
		count = 0;
		for(int i = 0 ; i < node ;i++) {
			list[i] = new ArrayList<Integer>();
		}
		
		
		for(int i = 0 ; i < edge ; i++) {
			int s = sc.nextInt();
			int e = sc.nextInt();
			list[s-1].add(e-1);
			list[e-1].add(s-1);
		}
		dfs(0);
		
		System.out.println(count-1);
		
	}	
	public static void dfs(int n) {
		count++;
		visited[n] = true;
		for(int i = 0 ; i < list[n].size(); i++) {
			int next = list[n].get(i);
			if(!visited[next]) {
				dfs(next);
			}
		}
	}
}