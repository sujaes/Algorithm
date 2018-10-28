package git;

//10809¹ø ¹®Á¦
import java.util.*;
class Q10809{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s = sc.next();
		int a[]=new int[26];
		for(int i =0 ;i<a.length;i++){
			a[i]=-1;
		}
		for(int i =0;i<s.length();i++){
			if(a[s.charAt(i)-'a']==-1){
				a[s.charAt(i)-'a']=i;
			}
		}
		for(int i = 0 ; i <a.length;i++){
			System.out.print(a[i]+" ");
		}
	}		
}
