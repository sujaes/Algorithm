//import java.util.*;
//
//class P1835 {
//	static char[] arr = { 'A', 'C', 'F', 'J', 'M', 'N', 'R', 'T' };
//	static char[] position;
//	static boolean[] check;
//	static int ans;
//	
//	public static void main(String[] args) {
//		String[] a = {"N~F=0", "R~T>2"};
//		solution(2,a);
//	}
//
//	public static int solution(int n, String[] data) {
//		position = new char[8];
//		check = new boolean[8];
//		ans = 0;
//		permutation(0, n, data);
//		return ans;
//	}
//
//	public static void permutation(int idx, int n, String[] data) {
//		if (idx == 8) {
////			for (int i = 0; i < position.length; i++) {
////				System.out.print(position[i] + " ");
////			}
////			System.out.println();
//			if (checkOk(n, data)) {
//				ans++;
//			}
//			return;
//		}
//
//		for (int i = 0; i < 8; ++i) {
//			if (!check[i]) {
//				check[i] = true;
//				position[idx] = arr[i];
//				permutation(idx + 1, n, data);
//				check[i] = false;
//			}
//		}
//	}
//
//	public static boolean checkOk(int n, String[] data) {
//		for (int i = 0; i < n; i++) {
//			char[] c = data[i].toCharArray();
//			int from = 0;
//			int to = 0;
//			int dist = 0;
//			int num = c[4] - '0';
//
//			for (int j = 0; j < 8; ++j) {
//				if (position[j] == c[0]) {
//					from = j;
//				}
//				if (position[j] == c[2]) {
//					to = j;
//				}
//			}
//
//			dist = Math.abs(from - to) - 1;
//			if(c[3] == '=') {
//				if (dist != num) {
//					return false;
//				}
//			}else if(c[3]=='<') {
//				if (dist >= num) {
//					return false;
//				}
//			}else {
//				if (dist <= num) {
//					return false;
//				}
//			}
//		}
//		return true;
//	}
//}
