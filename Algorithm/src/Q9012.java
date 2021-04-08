
//9012¹ø ¹®Á¦
import java.util.*;
class Q9012{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a = sc.nextInt();
		String pa;
		for(int i=0;i<a;i++){
			Stack<Character> stack = new Stack<Character>(); 

			pa=sc.next();
			for(int j = 0 ; j<pa.length();j++){
				if(!stack.isEmpty()){
					if(pa.charAt(j)=='('){
						stack.push(pa.charAt(j));
					}else if(pa.charAt(j)==')'){
						stack.pop();
					}
				}else{
					if(pa.charAt(j)=='('){
						stack.push(pa.charAt(j));
					}else if(pa.charAt(j)==')'){
						stack.push(pa.charAt(j));
						break;
					}
				}
			}
		
			if(stack.isEmpty()){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}		
}