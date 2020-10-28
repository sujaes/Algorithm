import java.util.Scanner;

public class Q8320 {
	static int n;
	static int arr[];
	static int count;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		boolean visited[] = new boolean[n];
		int answer[] = new int[3];
		arr = new int[n];
		count = 0;
		for(int i = 0 ; i <n ; i++) {
			arr[i] = i+1;
		}
		comb(0,visited,answer,2);
		
		System.out.println(count);
		
		
	}
	public static void comb(int start, boolean visited[],int answer[] , int r) {
		if(r ==0 ) {
			if(check(answer)) {
				count++;
				return;
			}
			return;
		}
		
		for(int i  =start ; i < n; i++) {
			visited[i]= true;
			answer[2-r] = arr[i];
			comb(i , visited,answer, r-1);
			visited[i] = false;
		}
		
	}
	public static boolean check(int answer[]) {
		int a = answer[0];
		int b = answer[1];
		if(a*b <= n && a*b !=0) {
			System.out.println(a + " " + b);
			return true;
		}else {
			return false;
		}
		
	}

}