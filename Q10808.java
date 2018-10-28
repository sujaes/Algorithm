package git;

//10808¹ø ¹®Á¦
import java.util.*;
class Q10808{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s = sc.next();
		int a[]=new int[26];
		for(int j = 0 ;j<26;j++){
			for(int i =0;i<s.length();i++){
				if(Integer.parseInt(""+(s.charAt(i)-'a'))==j){
					a[j]++;
				}
			}
		}
		for(int i = 0 ; i <a.length;i++){
			System.out.print(a[i]+" ");
		}
	}		
}
