
//1978¹ø ¹®Á¦
import java.util.*;
class Q1978{
	public static void main(String[] args){
		int a,b;

		Scanner sc= new Scanner(System.in);
		a = sc.nextInt();
		
		int sum=0;
		
		for( int i = 0 ;i<a;i++){
			b= sc.nextInt();
			int k=0;
			
			for( int j =2;j<b;j++){
				if(b%j==0){
					k=1;
				}
			}
			if(b==1){
				k=1;
			}
			if(k!= 1){
				sum++;
			}
			
		}
		System.out.println(sum);
	}
}
