

//10953¹ø ¹®Á¦
import java.util.*;
class Q10953{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.nextLine();
		int sum = 0;
		for(int i = 0 ; i <a;i++){
			String[] res= sc.nextLine().split(",");
			sum = Integer.valueOf(res[0])+Integer.valueOf(res[1]);
			System.out.println(sum);
		}
	}		
}