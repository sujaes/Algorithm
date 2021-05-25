import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q1038 {
	static ArrayList<Integer> list;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		list = new ArrayList<>();

		// 9876543210 -> max

		if (N <= 10) {
			System.out.println(N);
		} else if (N > 1022) {
			System.out.println(-1);
		} else {
			for (int i = 0; i < 10; i++) {
				Cal(i, 1);
			}
			// ������� ������ �ȵǾ��ֱ� ������ sort�� �ʿ���.
			Collections.sort(list);
			System.out.println(list.get(N));
		}

	}
	
	private static void Cal(int num, int depth) {
		if (depth > 10) {
			return;
		}
		list.add(num);
		// ó���� num�� 0�̸� pass 
		// num�� 1�̸� i�� 0�϶���. => 1�ڿ� �ü��ִ� �����ϴ� ����... 1 , 10
		// num�� 2�� 2,20, 21, 210 
		// num�� 3�̸� 3, 30, 31,310,32,320,321,322
		// ..�̷������� 9����
		for (int i = 0; i < 10; i++) {
			if (num % 10 > i) {
				Cal((num * 10) + i, depth + 1);
			}
		}
		return;
	}

}