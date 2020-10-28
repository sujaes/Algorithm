import java.util.Scanner;

public class Q11050 {
	static int n;
	static int r;
	static int count;
	static int arr[];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		r = sc.nextInt();
		arr = new int[n];
	    boolean visited[] = new boolean[n];
		count = 0;
//		if( r==0) {
//			System.out.println(1);
//			return;
//		}
		comb(0,visited,r);
		System.out.println(count);
		
	}
	public static void comb(int start,boolean visited[],int r) {
		if(r==0) {
			count++;
		}
		for(int i = start ; i < n ;i++) {	
			visited[i] = true;
			comb(i+1,visited,r-1);
			visited[i] = false;
			
		}
	}

}