package git;

//10950¹ø ¹®Á¦
import java.util.*;
class Q10950{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int num1,num2;
		int res[] = new int[a];
		for(int i = 0 ; i<a;i++){
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			res[i] = num1+num2;
		}
		
		for(int i = 0 ; i <a; i++){
			System.out.println(res[i]);
		}
		
	}
		
}