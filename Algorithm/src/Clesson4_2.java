//import java.util.*;
//class Solution {
//    public int[] solution(int N, int[] A) {
//        int[] result = new int[N];
//        int max = 0; // increase 연산시 최대값을 저장할 변수
//        int allMax = 0; // max 연산시 max를 여기에 넣을 거임
// 
//        for (int i = 0; i < A.length; i++) {
//            if (A[i] == N + 1) {    // max
//                allMax = max; // 최대값을 저장해 놓음
//            } else {    //increase
//                result[A[i]-1] = Math.max(allMax, result[A[i]-1]) + 1; // 1씩 증가
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
