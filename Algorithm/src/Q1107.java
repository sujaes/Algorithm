import java.util.Scanner;

public class Q1107 {

	static boolean[] broken = new boolean[10]; // 0~10

	static int possible(int c) {
		if (c == 0) { //0일때 예외처리
			if (broken[0]) {
				return 0;
			} else {
				return 1;
			}
		}
		int len = 0;
		while (c > 0) {
			if (broken[c % 10]) {
				return 0;
			}
			len += 1;
			c /= 10;
		}
		return len;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		int m = sc.nextInt();  
		for (int i = 0; i < m; i++) {
			int x = sc.nextInt();
			broken[x] = true; //고장
		}

		int ans = Math.abs(n - 100); //처음 시작이 100번이기때문에

		for (int i = 0; i < 1000000; i++) {
			int c = i;
			int len = possible(c);
			//숫자로이동할때 횟수
			if (len > 0) {
				int press = Math.abs(c - n);
				// press: 숫자버튼으로 n에 최대한 인접하게 이동한후 +또는 -를 몇 번 눌러야 하는지 구하는 변수
				if (ans > len + press) {
					ans = len + press;
				}
			}
		}
		System.out.println(ans);
	}
}