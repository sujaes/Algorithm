import java.util.*;
public class Q17413 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Character> stack = new Stack<Character>();
		String s = sc.nextLine();
		String answer = "";
		int i = 0;
		while(i < s.length()) {
			if(s.charAt(i)=='<') {	//태그 시작
				while(!stack.isEmpty()) {
					answer+= stack.pop();
				}
				while(true) {
					answer += s.charAt(i);
					if(s.charAt(i)=='>') {
						i++;
						break;
					}
					i++;
				}
			}else {	//읻반 단어일때 
//				System.out.println("일반 문자 " + s.charAt(i));								
				if(s.charAt(i)!=' ') {//공백이 아니거나 끝문자가 아니거나
					 stack.add(s.charAt(i));
//					 System.out.println("스택에 추가 " + i);
					 i++;
				}
				if(i==s.length()) {	//끝문자일때
					while(!stack.isEmpty()) {
						answer+= stack.pop();
					}
					break;
				}
				if(s.charAt(i)==' '){//공백일때
//					System.out.println("공백을 만났다" + i);
					while(!stack.isEmpty()) {
						answer+= stack.pop();
					}
					answer+= s.charAt(i);
					i++;
				}
			}
		}
		System.out.println(answer);
		
		
		
	}
}
