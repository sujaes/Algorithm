import java.util.Scanner;

public class Q3053 {
	static int n;	
	public static void main(String[] args)   {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String r1 = String.format("%.6f",Math.PI*n*n);
		String r2 = String.format("%.6f",(double)2*n*n);		

		System.out.println(r1);
		System.out.println(r2);
		
	}
	
	
}