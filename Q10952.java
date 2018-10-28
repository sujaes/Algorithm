package git;

//10952¹ø ¹®Á¦
import java.util.*;
class Q10952{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num1,num2,res=0;
		while(sc.hasNextInt()){
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			if((num1!=0)||(num2!=0)){
				res = num1+num2;
				System.out.println(res);
			}else{
				return ;
			}
		}		
	}		
}