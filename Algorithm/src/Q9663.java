
import java.util.Scanner;
public class Q9663 {

	public static int n;
	public static int count;
	public static int[] map;

	public static boolean check(int[] map, int col) {
		for (int i = 1; i < col; i++) {
			if (map[i] == map[col]) 
				//같은 열이면 퀸을 배치할 수 없으므로 false
				return false;
			if (Math.abs(i - col) == Math.abs(map[i] - map[col])) 
				return false;
				//서로 대각선에 위치하고 있으면 퀸을 배치할 수 없으므로 false
		}
		return true;

	}

	public static void dfs(int[] map, int col) {
		// col(행) 이 n(마지막 행) 까지 도달한다면, 퀸의 배치가 끝난 상태로 count를 ++ 해준다.
		if (col == n) {
			count++;
		}

		else {
			for (int i = 1; i <= n; i++) {
				map[col + 1] = i; // 다음 행의 i열에 퀸을 배치 할 수 있는지 ?
				if (check(map, col + 1)) { // 이 위치에 퀸을 놓을 수 있다면
					dfs(map, col + 1); // 다시 dfs로 다음 퀸을 놓으러 간다.

				}

			}
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt(); // n x n 의 체스판과 n개의 퀸을 입력받는다.

		for (int i = 1; i <= n; i++) {
			map = new int[n + 1]; // 1행부터 고려하기 때문에 , map[0]은 사용하지 않음.

			map[1] = i; // 1행 i열에 퀸을 놓는다.

			dfs(map, 1);

		}
		System.out.println(count);

	}
}
