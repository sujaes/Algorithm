//import java.util.*;
//class Solution {
//    public int[] solution(int N, int[] A) {
//        int[] result = new int[N];
//        int max = 0; // increase ����� �ִ밪�� ������ ����
//        int allMax = 0; // max ����� max�� ���⿡ ���� ����
// 
//        for (int i = 0; i < A.length; i++) {
//            if (A[i] == N + 1) {    // max
//                allMax = max; // �ִ밪�� ������ ����
//            } else {    //increase
//                result[A[i]-1] = Math.max(allMax, result[A[i]-1]) + 1; // 1�� ����
//                max = Math.max(max, result[A[i]-1]);
//            }
//        }
// 
//        for (int i = 0; i < N; i++) {
//            result[i] = Math.max(result[i], allMax);
//        }
//        return result;
//    }
//}
