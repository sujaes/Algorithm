/*
 * Date 2021.03.11
 * author �����
 * �������� �ڵ�����
 */
import java.util.*;

public class TwoPointer{
	static int n,m;
	static int answer ;
	static int arr[];
	static int sum;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = 0;
		int e = 0;
		sum = 0;
		n = sc.nextInt();
		m = sc.nextInt();
		//���߿� ���� ���ߴ��� Ȯ���ϴ� �뵵�� n+1
		answer = n+1;
		//n���� �ϸ� ������ �ε��� ������ �ʰ��Ǿ n+1
		arr = new int[n+1];
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		while( e <= n && s <= n) {	//��� �糡���� ������
			if(sum >= m && answer > e-s) { //sum�� m���� ũ�ų� ���� ���̰� ���� ���̺��� ������ (��� �ݺ��ϸ鼭 answer�� �ٿ���)
				answer = e-s;
			}	//���� �� ������ �������� �÷�����
			if(sum < m ) {
				sum += arr[e];
				e++;
			}else { //���� �� ũ�� ���ʼ��� ����
				sum -= arr[s];
				s++;
			}
		}
//		System.out.println( "s = " + s + " e = "+ e + " sum = " + sum);

		if(answer == n+1) {	//������ ���� ������ ���̸� �����Ѱ� ���⶧���� �Ұ���
			System.out.println(0);
		}else {
			System.out.println(answer);
		}
	}
}