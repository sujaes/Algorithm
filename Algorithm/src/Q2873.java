import java.util.Scanner;

public class Q2873 {
	public static void append(StringBuilder sb, char way, int C) {
		for(int i=0; i<C; i++) {
			sb.append(way);
		}
	}
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int C = sc.nextInt();
		int[][] A = new int[R][C];
		for(int i=0; i<R; i++) {
			for(int j=0; j<C; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		StringBuilder sb = new StringBuilder();
		if(R%2!=0) {
			for(int i=0; i<R; i++) {
				if(i%2==0) {
					append(sb, 'R', C-1); // width�� 3�� �� ���� �� 2�� : C-1��
					if(i != R-1) {
						append(sb, 'D', 1);
					}
				} else {
					append(sb, 'L', C-1);
					append(sb, 'D', 1);
				}
			}
		} else if(C%2!=0) {
			for(int i=0; i<C; i++) {
				if(i%2==0) {
					append(sb, 'D', R-1);
					if(i != C-1) {
						append(sb, 'R', 1);
					}
				} else {
					append(sb, 'U', R-1);
					append(sb, 'R', 1);
				}
			}
		} else { // ¦��
			int x = 0;
			int y = 1;
			for(int i=0; i<R; i++) {
				for(int j=0; j<C; j++) {
					if((i+j)%2 == 1) {
						if(A[x][y] > A[i][j]) {
							x = i;
							y = j;
						}
					}
				}
			}
			int x1 = 0;
			int y1 = 0;
			int x2 = R-1;
			int y2 = C-1;
			StringBuilder sb2 = new StringBuilder();
			while(x2 - x1 > 1) { // ���� 2ĭ ���� �� ���� �ε��� ���� Ž��
				if(x1/2 < x/2) {
					append(sb, 'R', C-1);
					append(sb, 'D', 1);
					append(sb, 'L', C-1);
					append(sb, 'D', 1);
					x1 += 2;
				}
				if(x/2 < x2/2) {
					append(sb2, 'R', C-1);
					append(sb2, 'D', 1);
					append(sb2, 'L', C-1);
					append(sb2, 'D', 1);
					x2 -= 2;
				}
			}
			while(y2 - y1 > 1) { // ���� 2ĭ ���� �� ���� �ε��� ���� Ž��
				if(y1/2 < y/2) {
					append(sb, 'D', 1);
					append(sb, 'R', 1);
					append(sb, 'U', 1);
					append(sb, 'R', 1);
					y1 += 2;
				}
				if(y/2 < y2/2) {
					append(sb2, 'D', 1);
					append(sb2, 'R', 1);
					append(sb2, 'U', 1);
					append(sb2, 'R', 1);
					y2 -= 2;
				}
			}
			if(y == y1) {
				append(sb, 'R', 1);
				append(sb, 'D', 1);
			} else {
				append(sb, 'D', 1);
				append(sb, 'R', 1);
			}
			sb2.reverse();
			sb.append(sb2);
		}
		System.out.println(sb);
	}
	
}
