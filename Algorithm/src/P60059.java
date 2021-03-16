//class Solution {
//	static int[][] keyA;
//	static int[][] lockA;
//
//	public static boolean solution(int[][] key, int[][] lock) {
//		boolean answer = true;
//		keyA = key;
//		lockA = lock;
//
//		for (int i = 0; i < lock.length + key.length - 1; i++) {
//			for (int j = 0; j < lock.length + key.length - 1; j++) {
//				// 4�������� ȸ���ϱ�
//				for (int k = 0; k < 4; k++) {
//					int[][] rotateedArr = rotate(key);
//					int[][] bigArr = makeBigArr();
//					if (isFinish(bigArr)) {
//						return true;
//					}
//					int[][] sumArr = sumArr(rotateedArr, bigArr, i, j);
//					if (isFinish(sumArr)) {
//						return true;
//					}
//
//				}
//			}
//		}
//		return false;
//	}
//
//	public static int[][] sumArr(int[][] rotatedArr, int[][] bigArr, int s, int e) { // �ڒO��� ���踦 ���ϱ�
//		for (int i = 0; i < keyA.length; i++) {
//			for (int j = 0; j < keyA.length; j++) {
//				bigArr[s + i][e + j] += rotatedArr[i][j];
//			}
//		}
//		return bigArr;
//	}
//
//	public static int[][] rotate(int[][] arr) { // �ð�������� 90�� ������
//		int[][] newArr = new int[arr.length][arr.length];
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr.length; j++) {
//				newArr[j][arr.length - 1 - i] = arr[i][j];
//			}
//		}
//		return newArr;
//	}
//
//	public static boolean isFinish(int[][] sumArr) { // ��� �� ���ִ��� Ȯ���ϱ�
//		for (int i = 0; i < lockA.length; i++) {
//			for (int j = 0; j < lockA.length; j++) {
//				if (sumArr[keyA.length - 1 + i][keyA.length - 1 + j] != 1) {
//					return false;
//				}
//			}
//		}
//		return true;
//	}
//
//	public static int[][] makeBigArr() { // ����� �ڹ��踦 ������
//		int leng = lockA.length + 2 * (keyA.length - 1);
//		int[][] bigArr = new int[leng][leng];
//		for (int i = 0; i < lockA.length; i++) {
//			for (int j = 0; j < lockA.length; j++) {
//				bigArr[keyA.length - 1 + i][keyA.length - 1 + j] = lockA[i][j];
//			}
//		}
//		return bigArr;
//	}
//}