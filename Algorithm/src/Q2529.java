import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q2529 {

	static boolean[] check = new boolean[10]; // 0~9���� check
	static int n;
	static char[] a = new char[10]; // �ε�ȣ�� �ִ� 9����
	static ArrayList ans = new ArrayList<>();

	static boolean ck(char a, char b, char c) {
		if (c == '<') {
			if (a > b) {
				return false;
			}
		}
		if (c == '>') {
			if (a < b) {
				return false;
			}
		}
		return true;
	}

	static void go(int index, String num) {
		if (index == n + 1) {
			ans.add(num);
			return;
		}

		for (int i = 0; i <= 9; i++) {
			if (check[i])
				continue;
			if (index == 0 || ck(num.charAt(index - 1), (char) (i + '0'), a[index - 1])) {
				check[i] = true;
				go(index + 1, num + Integer.toString(i));
				check[i] = false;
			}
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			a[i] = sc.next().toCharArray()[0];
		}

		go(0, "");
		Collections.sort(ans);

		System.out.println(ans.get(ans.size() - 1));
		System.out.println(ans.get(0));

	}

}