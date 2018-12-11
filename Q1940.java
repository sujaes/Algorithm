package git;

import java.util.*;

public class Q1940 {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		int[] array = new int[N];
		for (int i = 0; i < N; i++)
			array[i] = sc.nextInt();

		int count = 0;
		for (int i = 0; i < N; i++)
			for (int j = i + 1; j < N; j++)
				if (array[i] + array[j] == M)
					count++;

		System.out.print(count);
	}
}