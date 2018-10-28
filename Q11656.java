package git;

//11656¹ø ¹®Á¦
import java.util.*;
class Q11656{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s = sc.next();
		int len=s.length();
		String res[] = new String[s.length()];
		for(int i = 0 ; i <res.length;i++){
			res[i]=s;
			s=s.substring(1,len);
			len--;
		}
		Arrays.sort(res);
		for(int i = 0 ; i<res.length;i++){
			System.out.println(res[i]);
		}

	}		
}