import java.util.*;
public class Q17413 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Character> stack = new Stack<Character>();
		String s = sc.nextLine();
		String answer = "";
		int i = 0;
		while(i < s.length()) {
			if(s.charAt(i)=='<') {	//�±� ����
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
			}else {	//�޹� �ܾ��϶� 
//				System.out.println("�Ϲ� ���� " + s.charAt(i));								
				if(s.charAt(i)!=' ') {//������ �ƴϰų� �����ڰ� �ƴϰų�
					 stack.add(s.charAt(i));
//					 System.out.println("���ÿ� �߰� " + i);
					 i++;
				}
				if(i==s.length()) {	//�������϶�
					while(!stack.isEmpty()) {
						answer+= stack.pop();
					}
					break;
				}
				if(s.charAt(i)==' '){//�����϶�
//					System.out.println("������ ������" + i);
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
