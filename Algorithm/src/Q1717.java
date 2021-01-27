import java.util.*;
public class Q1717 {
	static int arr[];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		arr = new int[n+1];		
		for(int i = 0 ; i <= n ; i++) {
			arr[i] = i;
		}
		
		for(int i = 0 ; i < m ; i++) {
			int casenum = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if( casenum == 0 ) {
				unionParents(arr, a, b);
			}else {
				findParents(arr, a, b);
			}
		}
	}
	
	public static int getParents(int arr[], int x) {
		if(arr[x] == x) {
			return x;
		}else {
			arr[x] = getParents(arr, arr[x]);
			return arr[x];
		}
		
	}
	
	public static void unionParents(int arr[], int a, int b) {
		a = getParents(arr, a);
		b = getParents(arr, b);
		
		if(a < b) {
			arr[b] = a;
		}else {
			arr[a] = b;
		}
	}
	
	public static void findParents(int arr[], int a,int b) {
		a = getParents(arr, a);
		b = getParents(arr, b);
		if(a==b) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
	
}
