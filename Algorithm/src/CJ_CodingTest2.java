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

			if( c >= '0' && c<='9') {		//���ڸ�
				num+= c;
			}else if(c == '(') {			//������ȣ
				numStack.add(Integer.parseInt(num));
				num = "";
				pstack.add('(');
			}else if(c <='z' && c>='a') {	//���ڸ�
				temp +=c;
			}else {							//�ݴ°�ȣ
				stack.add(temp);
				temp = "";
				pstack.pop();
				if(!pstack.isEmpty()) {		//��ȣ������ �����ִ°��
					String t = stack.pop();
					int n = numStack.pop();
					String tt = "";
					for(int j = 0 ; j < n ;j++) {
						tt += t;
					}
					stack.add(tt);
				}else {						//��ȣ������ ����
					String t = "";
					while(!stack.isEmpty()) {//���ڿ��� �ٻ��� �ٿ��ֱ�
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
