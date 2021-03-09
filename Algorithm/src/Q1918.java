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
        	//���ڸ� ��Ʈ���� �߰�
            if ('A' <= ch && ch <= 'Z') {
                ans += ch;
            } else if (ch == '(') { //���°�ȣ�� ���ÿ� �߰�
                ops.push(ch);
            } else if (ch == ')') { // �ݴ°�ȣ�� ������ �����ʰ� ���°�ȣ�� ���������� pop�ϱ�
                while (!ops.isEmpty()) {
                    char op = ops.pop();
                    if (op == '(') {
                    	break;
                    }
                    ans += op;
                }
            } else {	//�������ϰ��
                while (!ops.isEmpty() && precedence(ops.peek()) >= precedence(ch)) { //�ش翬���ڰ� ���ø����� �����ں��� �켱������ ������ ���ÿ��� ����
                    ans += ops.pop();
                }
                ops.push(ch); //�ش翬���� ���ÿ� �߰�
            }
        }
        while (!ops.isEmpty()) { //���ÿ� ��� ������ ����
            ans += ops.pop();
        }
        System.out.println(ans);
    }
}


// A+B-(C*D)�ϰ��
// A���
// +���ÿ� �߰�
// B���
// -�� ���ÿ��ִ� +�� �켱������ �����Ƿ� ���ÿ� �ִ� +�� ���� ����� -���ÿ� �߰�
// (���ÿ� �߰�
// C���
// *���ÿ� �߰�
// D���
// )�̹Ƿ� ������ȣ ���Ë����� ���ÿ��� pop�ؼ� ����ؾ��ϹǷ� +���
// �ٵ������Ƿ� ���ÿ� ���� ������ pop�ؼ� ��� -���