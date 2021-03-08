import java.util.Scanner;

public class Q10972 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		if (nextPermutation(a)) {
			for (int i = 0; i < n; i++) {
				System.out.print(a[i] + " ");
			}
		} else {
			System.out.println("-1");
		}
	}

	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public static boolean nextPermutation(int[] a) {
		// 1. a[i-1] < a[i]를 만족하는 첫 번째 수 찾기
		int i = a.length - 1;
		while (i > 0 && a[i - 1] >= a[i]) {
			i = i - 1;
		}

		// 마지막 순열인 경우
		if (i <= 0) {
			return false;
		}
		// 2. a[i-1] < a[j]를 만족하는 첫 번째 수 찾기
		int j = a.length - 1;
		while (a[j] <= a[i - 1]) {
			j -= 1;
		}

		// 3. a[i-1]과 a[j] swap
		swap(a, i - 1, j);

		// 4 i부터 a.length-1까지 순열 뒤집기
		j = a.length - 1;
		while (i < j) {
			swap(a, i, j);
			i = i + 1;
			j = j - 1;
		}
		return true;
	}

}


//다음 순열은 찾는 방법은 
//
//int i = 배열의 크기 -1,
//
//int j = 배열의 크기 -1 일때
//
//1. i > 0 이면서 A[i] > A[i-1]를 만족하는 카장 큰 i를 찾는다.
//
//2. A[j] > A[i-1]을 만족하는 가장 큰 j를 찾는다.
//
//3. A[i-1]과 A[j]를 swap한다.
//
//4. A[i]부터 순열을 뒤집는다.
//
// 
//
//1번과 2번 모두 i와 j가 A.length-1로 초기화 되고
//
//A의 길이 -1 로 초기화 된 값이 클 때 로 기억하자.
//
// 
//
// 
//
//순열 int [] a = { 7 2 3 6 5 4 1}이 있을 때
//
//int i = a.length -1;
//
//int j = a.length -1; ->7
//
//1. a[i-1] < a[i]를 만족하는 첫 번째 i 를 찾는다.
//
//  4 < 1 --> false
//
//  5 < 4 --> false
//
//  6 < 5 --> false
//
//  3 < 6 --> true;
//
//a[i]는 6이고 a[i-1]이 3일때가 만족한다.
//
// 
//
//2. 다시 j부터 j >= i를 만족하고 a[j] > a[i-1]을 만족하는 첫 번째 수를 찾는다.
//
//1 > 3 --> false
//
//4 > 3 --> true
//
//a[j] 가 4일 때 가 만족한다.
//
// 
//
//3. 다음 순서로 a[i-1]과 a[j]를 swap한다.
//
//3(a[i-1])과 4(a[j])를 swap한다.
//
//a = { 7 2 3 6 5 4 1}
//
//           |
//
//           |
//
//           V
//
//a = { 7 2 4 6 5 3 1}
//
// 
//
//4. a[i]부터 끝까지 순열을 뒤집는다
//
//a = { 7 2 4 1 3 5 6}
//
// 
//
//이것이 가능한 이유는 사전순 정렬을 생각해보면 된다.
//
//순열의 첫 번째 배열은 1 2 3 4 5 6 7일 것이고
//
//마지막 배열은 7 6 5 4 3 2 1 일 것이다.
//
// 
//
//7 2 3 6 5 4 1 같은 경우엔
//
//7 2 3 / 6 5 4 1 -> 6 5 4 1이 내림차순이기 때문에
//
//이것은 7 2 3으로 시작하는 순열중 마지막 순열이다.
//
//그러므로 7 2 3 다음으로 올 수 있는 오른쪽 에서 가장 큰 수 
//
//4와 swap하고 뒤집음으로써 오름차순으로 정렬하면
//
//다음 순열이 나오게 된다.
//
//이런 원리로 가장 오른쪽, 마지막에서 부터 A[i]가 A[i-1]보다 큰 가장 첫 번째 수를
//
//찾고 다시 A[j]에서 A[i-1]보다 큰 첫 번째 수를 찾아서 swap하는 것이다.
