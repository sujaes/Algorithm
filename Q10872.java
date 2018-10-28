package git;

//10872¹ø ¹®Á¦
import java.util.*;
class Q10872{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
		long res= 1;
		if( a==0){

		}else{
			for( int i = 1;i<=a;i++){
				res= res*i;
			}
		}
		System.out.println(res);
	}
}
