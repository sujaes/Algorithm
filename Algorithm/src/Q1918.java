import java.util.*;
public class Q1918 {
    static int precedence(char ch) {
        if (ch == '(') {
        	return 0;
        }
        if (ch == '+' || ch == '-') {
        	return 1;
        }else {
        	return 2;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String ans = "";
        Stack<Character> ops = new Stack<>();
        for (char ch : s.toCharArray()) {
        	//문자면 스트링에 추가
            if ('A' <= ch && ch <= 'Z') {
                ans += ch;
            } else if (ch == '(') { //여는괄호면 스택에 추가
                ops.push(ch);
            } else if (ch == ')') { // 닫는괄호면 스택이 비지않고 여는괄호를 만날때까지 pop하기
                while (!ops.isEmpty()) {
                    char op = ops.pop();
                    if (op == '(') {
                    	break;
                    }
                    ans += op;
                }
            } else {	//연산자일경우
                while (!ops.isEmpty() && precedence(ops.peek()) >= precedence(ch)) { //해당연산자가 스택맨위에 연산자보다 우선순위가 낮으면 스택에서 빼기
                    ans += ops.pop();
                }
                ops.push(ch); //해당연산자 스택에 추가
            }
        }
        while (!ops.isEmpty()) { //스택에 모든 연산자 빼기
            ans += ops.pop();
        }
        System.out.println(ans);
    }
}


// A+B-(C*D)일경우
// A출력
// +스택에 추가
// B출력
// -는 스택에있는 +와 우선순위가 같으므로 스택에 있는 +를 빼서 출력후 -스택에 추가
// (스택에 추가
// C출력
// *스택에 추가
// D출력
// )이므로 열림괄호 나올떄까지 스택에서 pop해서 출력해야하므로 +출력
// 다돌았으므로 스택에 남은 연산자 pop해서 출력 -출력