import java.util.Scanner;
import java.util.Stack;
 
public class Q17298 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		int N = sc.nextInt();
		int[] seq = new int[N];
		
		for(int i = 0; i < N; i++) {
			seq[i] = sc.nextInt();
		}
 
		for(int i = 0; i < N; i++) {
			/*
			 * ������ ������� �����鼭 
			 * ���� ���Ұ� ������ �� �� ���Ұ� ����Ű�� ���Һ��� ū ���
			 * �ش� ������ ������ �� ���� stack�� ���Ҹ� pop�ϸ鼭
			 * �ش� �ε����� ���� ���� ���ҷ� �ٲ��ش�. 
			 */
			while(!stack.isEmpty() && seq[stack.peek()] < seq[i]) {
				seq[stack.pop()] = seq[i];
			}
			stack.push(i);
		}
		/*
		 * ������ ��� ���Ҹ� pop�ϸ鼭 �ش� �ε����� value��
		 * -1�� �ʱ�ȭ�Ѵ�.
		 */
		while(!stack.isEmpty()) {
			seq[stack.pop()] = -1;
		}		
		for(int i = 0; i < N; i++) {
			System.out.print(seq[i]+" ");			
		}
	}
}