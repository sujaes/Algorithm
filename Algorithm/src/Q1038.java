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
			// 순서대로 저장이 안되어있기 때문에 sort가 필요함.
			Collections.sort(list);
			System.out.println(list.get(N));
		}

	}
	
	private static void Cal(int num, int depth) {
		if (depth > 10) {
			return;
		}
		list.add(num);
		// 처음에 num이 0이면 pass 
		// num이 1이면 i가 0일때만. => 1뒤에 올수있는 감소하는 수들... 1 , 10
		// num이 2면 2,20, 21, 210 
		// num이 3이면 3, 30, 31,310,32,320,321,322
		// ..이런식으로 9까지
		for (int i = 0; i < 10; i++) {
			if (num % 10 > i) {
				Cal((num * 10) + i, depth + 1);
			}
		}
		return;
	}

}