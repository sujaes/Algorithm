import java.util.Scanner;

public class Q16561 {
	static int n;
	static int arr[];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		arr = new int[3];
		int count = 0;
		for(int i = 3; i <= n-6; i= i+3) {
			for(int j = 3; j < n-i ;j = j+3) {
				if((n-i-j) %3 ==0 && (n-i-j)!=0 ) {
					arr[0] = i;
					arr[1] = j;
					arr[2] = n-i-j;
					count++;
				}
			}
		}
		System.out.println(count);
		
		
		
	}
}