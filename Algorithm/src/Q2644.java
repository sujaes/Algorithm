import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Q2644 {
	static int node, start, end, casenum, count[];
	static int arr[][];
	static Queue<Integer> queue;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		node = sc.nextInt();
		start = sc.nextInt();
		end = sc.nextInt();
		casenum = sc.nextInt();
		arr = new int[node + 1][node + 1];
		count = new int[node + 1];

		for (int i = 0; i < casenum; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr[a][b] = arr[b][a] = 1;
		}

		solution(start);
	}

	public static void solution(int s) {
		queue = new LinkedList<Integer>();
		queue.add(s);
		while (!queue.isEmpty()) {
			int point = queue.poll();
			System.out.println(" point = " + point + " count = " + count[point]);

			for (int i = 1; i < node + 1; i++) {
				if (arr[point][i] == 1 && count[i]==0) {
					count[i] = count[point] + 1;
					queue.add(i);
				}
			}

		}

		if (count[end] == 0) {
			System.out.println(-1);
		} else {
			System.out.println(count[end]);
		}
	}
}