
import java.util.*;

class Q2847{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a;
		a= sc.nextInt();
		int b[] = new int [a];
		int count = 0 ;

		for( int i = 0 ; i <a; i++){
			b[i] = sc.nextInt();
		}
		for( int j = a-1;j>0;j--){
			if(b[j]<=b[j-1]){
				count += b[j-1]-b[j]+1;
				b[j-1]=b[j]-1;
			}
		}
		System.out.println(count);
	}
}
