
import java.util.Scanner;
public class Q9663 {

	public static int n;
	public static int count;
	public static int[] map;

	public static boolean check(int[] map, int col) {
		for (int i = 1; i < col; i++) {
			if (map[i] == map[col]) 
				//���� ���̸� ���� ��ġ�� �� �����Ƿ� false
				return false;
			if (Math.abs(i - col) == Math.abs(map[i] - map[col])) 
				return false;
				//���� �밢���� ��ġ�ϰ� ������ ���� ��ġ�� �� �����Ƿ� false
		}
		return true;

	}

	public static void dfs(int[] map, int col) {
		// col(��) �� n(������ ��) ���� �����Ѵٸ�, ���� ��ġ�� ���� ���·� count�� ++ ���ش�.
		if (col == n) {
			count++;
		}

		else {
			for (int i = 1; i <= n; i++) {
				map[col + 1] = i; // ���� ���� i���� ���� ��ġ �� �� �ִ��� ?
				if (check(map, col + 1)) { // �� ��ġ�� ���� ���� �� �ִٸ�
					dfs(map, col + 1); // �ٽ� dfs�� ���� ���� ������ ����.

				}

			}
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt(); // n x n �� ü���ǰ� n���� ���� �Է¹޴´�.

		for (int i = 1; i <= n; i++) {
			map = new int[n + 1]; // 1����� ����ϱ� ������ , map[0]�� ������� ����.

			map[1] = i; // 1�� i���� ���� ���´�.

			dfs(map, 1);

		}
		System.out.println(count);

	}
}
