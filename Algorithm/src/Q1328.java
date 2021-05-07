import java.util.*;
public class Q1328 {
	static int n,l,r;
	static long answer;
	static boolean visited[];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		l = sc.nextInt();
		r = sc.nextInt();
		answer = 0;
		
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		visited = new boolean[n];
		perm(list,visited);
		
		System.out.println(answer%1000000007);
	}
	public static void perm(LinkedList list, boolean visited[]) {
		if(list.size()==n) {
//			for(int i =0 ; i < n; i++) {
//				System.out.print(list.get(i) + " " );
//			}
//			System.out.println();
			if(check(list)) {
				answer++;
			}
			return;
		}
		for(int i = 0 ; i < n; i++) {
			if(!visited[i]) {
				visited[i] = true;
				list.add(i);
				perm(list,visited);
				visited[i] = false;
				list.removeLast();
			}
		}
	}
	
	public static boolean check(LinkedList<Integer> list) {
		int leng = list.size();
		long ans = 0;
		long max = 0;
		for(int i = 0 ; i < leng;i++) {
			if(list.get(i) >= max) {
				max = list.get(i);
				ans++;
			}
		}
		if( ans != l) {
			return false;
		}
		
		ans = 0;
		max = 0;
		for(int i =leng-1 ; i >= 0;i--) {
			if(list.get(i) >= max) {
				max = list.get(i);
				ans++;
			}
		}
		if( ans != r) {
			return false;
		}
		
		
		return true;
	}
	
	
	
	
	
}
