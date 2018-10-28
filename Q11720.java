package git;

//11720¹ø ¹®Á¦
import java.util.*;
class Q11720{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		int sum = 0;
		String b;
		b= sc.next();
		for(int i = 0;i <a; i++){
		
			sum+=Integer.parseInt(""+(b.charAt(i)));
		}
		System.out.println(sum);
	}		
}
