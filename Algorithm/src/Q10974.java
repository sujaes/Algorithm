import java.util.ArrayList;
import java.util.Scanner;

public class Q10974 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		boolean visited[] = new boolean[n];
		perm(n,n,list,visited,0);
		
		
		
	}
	private static void perm(int n,int r,ArrayList<Integer> list,boolean visited[],int index) {
		if(index == r) {
			for(int i = 0 ; i < n ; i++) {
				System.out.print(list.get(i) + " ");
			}
			System.out.println();
			return;
		}
		for(int i = 1 ; i <= n ; i++) {
			if(!visited[i-1]) {
				list.add(i);
				visited[i-1] = true;
				perm(n,r,list,visited,index+1);
				visited[i-1] = false;
				list.remove(list.size()-1);
			}
		}
		
		
		
		
	}
}
