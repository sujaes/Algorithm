import java.util.*;
public class Q11694 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int input[] = new int[N];
		boolean flag = false; // ���� 1���� ���̸� �����ϴ°�?
		int num = 0; // ���� 1���� ������ ����

		for (int i = 0; i < N; i++) {
			input[i] = sc.nextInt();

			if (input[i] != 1) {
				flag = true;
			} else {
				num++;	//����1���� �����Ǽ� ����
			}
		}

		// ���� 1���� ���̸� �����ϴ� ���
		// �� ���̰� ¦���� ������ �¸��ϰ�, Ȧ���� �İ��� �¸��Ѵ�.
		if (!flag) {
			if(num % 2 == 1) {
				System.out.println("cubelover");
			}else {
				System.out.println("koosaga");
			}
			return;
		}
		
		long result = 0; // �� ��
		for (int i = 0; i < N; i++) {
			result ^= input[i];	
		}
		if (num != 0) { // ���� 1���� ���̰� �����ϴ� ���  
			if (num % 2 == 1 && result != 0) {      //���� ���� 0�̸� �İ��� �̱� ( ���� �Ѱ��ۿ����� ���̸� Ȧ������ ������ش�. �̿ܿ��� ���� ���� 0���� ������ָ� �ȴ�.)
				System.out.println("koosaga");
			} else if (num % 2 == 1 && result == 0) {
				System.out.println("cubelover");
			} else if (num % 2 == 0) {
				// ���� 1���� ���̰� ¦���� ���
				// ���� 1���� �ƴ� ������ ���̸� ���� 1���� ���̷�
				// ������־�� �Ѵ�.

				for (int i = 0; i < N; i++) {
					if (input[i] != 1) {
						input[i] = 1;
						break;
					}
				}
				result = 0; // �� ��
				for (int i = 0; i < N; i++) {
					result ^= input[i];
				}

				if(result != 0) {						
					System.out.println("koosaga");
					
				}else {
					System.out.println("cubelover");
				}
			}
		} else { // ���� 1���� ���̰� ���� ���
			if(result != 0) {
				System.out.println("koosaga");
				
			}else {
				System.out.println("cubelover");
			}
		}
	}

}