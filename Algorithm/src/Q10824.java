
//10824�� ���� int���� �ȵǼ� long���
import java.util.*;
class Q10824{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String a= sc.next();
		String b=sc.next();
		String c=sc.next();
		String d=sc.next();
		String res1= a+b;
		String res2 = c+d;
		
		System.out.println(Long.parseLong(res1)+Long.parseLong(res2));
	}		
}
