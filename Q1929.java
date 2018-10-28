package git;

//1929¹ø ¹®Á¦
import java.util.*;
class Q1929{
	public static void main(String[] args){
		int a,b,c;
		Scanner sc= new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		int sum=0;
		
		for( int i = a ;i<=b;i++){
			int k=0;
			if(i==1){
				k=1;
			}
			int mmax = (int)Math.sqrt(i)+1;
			for( int j =2;j<mmax;j++){
				if(i%j==0){
					k=1;
					break;
				}
			}
			
			if(k==0){
				System.out.println(i);
			}
			k=0;
		}
	}
}
