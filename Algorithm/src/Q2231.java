import java.util.Scanner;
public class Q2231{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 2; i < n; i++) {
			
			if( (n-i) == mok(i) ) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(0);
	}
	
	public static int mok(int n) {
		int sum = 0;
		while(n!=0) {
			sum += n%10;
			n = n/10;
		}
		return sum;
	}
}