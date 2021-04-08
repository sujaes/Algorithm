
//11022¹ø ¹®Á¦
import java.util.*;
class Q11022{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int num1[] = new int[a];
		int num2[] = new int[a];
		int res[] = new int[a];
		for(int i=0;i<a;i++){
			num1[i] = sc.nextInt();
			num2[i] = sc.nextInt();
			res[i] = num1[i]+num2[i];
		}		
		for( int i = 1 ; i<=a;i++){	
			System.out.println("Case #"+i+": "+num1[i-1]+" + "+num2[i-1]+" = "+res[i-1]);
		}
	}		
}