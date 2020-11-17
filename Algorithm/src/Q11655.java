import java.util.*;
class Q11655{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s = sc.nextLine();
		char c[] = new char[s.length()];
		c = s.toCharArray();
		for (int i = 0 ;i<s.length();i++){
			if('a'<=c[i] && c[i]+13<='z'){
				c[i]+=13;
			}else if('A'<=c[i] && c[i]+13<='Z'){
				c[i]+=13;
			}else if('A'<=c[i] && 'Z'<c[i]+13){
				c[i]-=13;
			}else if('a'<=c[i] && 'a'<c[i]+13){
				c[i]-=13;
			}else{	
			}
		}
		for(int i =0;i<s.length();i++){
			System.out.print(c[i]);
		}
	}		
}