import java.util.Scanner;

public class Q16926 {
    static int N, M, R, S;
    static int[][] matrix, copy;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt(); // 배열의 크기 N*M
        M = sc.nextInt();
        R = sc.nextInt(); // 회전 수 R

        // min(N, M) mod 2 = 0
        S = Math.min(N, M) / 2; // 1회전에서 돌려야하는 사각형의 개수

        matrix = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < R; i++) {
            spin();
        }

        print();
    }

    private static void print() {
        for (int[] is : matrix) {
            for (int i : is) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    static void spin() {
        for (int s = 0; s < S; s++) {
            int T = s;
            int B = N - 1 - s;
            int R = M - 1 - s;
            int L = s;

            int tmp = matrix[s][s];
            for (int i = L; i < R; i++)    matrix[T][i] = matrix[T][i + 1];
            for (int i = T; i < B; i++)    matrix[i][R] = matrix[i + 1][R];
            for (int i = R; i > L; i--)    matrix[B][i] = matrix[B][i - 1];
            for (int i = B; i > T; i--)    matrix[i][L] = matrix[i - 1][L];
            matrix[T + 1][L] = tmp;

        }
    }
}