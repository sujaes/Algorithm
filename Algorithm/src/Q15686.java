import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
public class Q15686 {

	static int N; // 도시 크기
	static int M; // 치킨집 개수

	static ArrayList<Point> homes; // 집
	static ArrayList<Point> chickens; // 치킨집
	static Stack<Point> selectChickens;

	static int MIN_CHICKEN_DIST = Integer.MAX_VALUE;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();

		homes = new ArrayList<>();
		chickens = new ArrayList<>();
		selectChickens = new Stack<>();

		for (int x = 1; x <= N; x++) {
			for (int y = 1; y <= N; y++) {
				int number = sc.nextInt();

				if (number == 1) {
					homes.add(new Point(x, y));
				} else if (number == 2) {
					chickens.add(new Point(x, y));
				}
			}
		}

		sc.close();

		select(0, 0);
		System.out.println(MIN_CHICKEN_DIST);
	}

	// M개 만큼의 치킨집을 선택함  
	public static void select(int start, int count) {

		if (count == M) {
			calcChckenDist();
			return;
		}

		for (int i = start; i < chickens.size(); i++) {
			selectChickens.push(chickens.get(i));
			select(i + 1, count + 1);
			selectChickens.pop();
		}
	}

	// 도시의 치킨거리 계산 
	public static void calcChckenDist() {

		int sum = 0;
		for (Point home : homes) {

			int min = Integer.MAX_VALUE;
			for (Point chicken : selectChickens) {
				int dist = Math.abs(chicken.x - home.x) + Math.abs(chicken.y - home.y);
				min = Math.min(min, dist);
			}

			sum += min;

			if (sum > MIN_CHICKEN_DIST)
				return;
		}

		MIN_CHICKEN_DIST = Math.min(MIN_CHICKEN_DIST, sum);
	}
}

class Point {
	public int x;
	public int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return String.format("(%d, %d)", x, y);
	}
}