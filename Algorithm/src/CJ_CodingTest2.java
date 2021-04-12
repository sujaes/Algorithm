import java.util.*;
public class CJ_CodingTest2 {
	public static void main(String[] args) {
		String str = "2(3(ab)2(bc)oc)2(rb)";
		String answer = "";
		Stack<Integer> numStack = new Stack<Integer>();
		Stack<Character> pstack = new Stack<Character>();
		Stack<String> stack = new Stack<String>();
		String num = "";
		String temp = "";
		for(int i = 0 ; i < str.length(); i++) {
			char c = str.charAt(i);

			if( c >= '0' && c<='9') {		//숫자면
				num+= c;
			}else if(c == '(') {			//열린괄호
				numStack.add(Integer.parseInt(num));
				num = "";
				pstack.add('(');
			}else if(c <='z' && c>='a') {	//문자면
				temp +=c;
			}else {							//닫는괄호
				stack.add(temp);
				temp = "";
				pstack.pop();
				if(!pstack.isEmpty()) {		//괄호스택이 남아있는경우
					String t = stack.pop();
					int n = numStack.pop();
					String tt = "";
					for(int j = 0 ; j < n ;j++) {
						tt += t;
					}
					stack.add(tt);
				}else {						//괄호스택이 빈경우
					String t = "";
					while(!stack.isEmpty()) {//문자열을 다빼서 붙여주기
						t =  stack.pop()+ t;
					}
					int n = numStack.pop();
					String tt= "";
					for(int j = 0 ; j < n ;j++) {
						tt += t;
					}
					answer += tt;
				}
			}
		}
		System.out.println(answer);
	}
}
