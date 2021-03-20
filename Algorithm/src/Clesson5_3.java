//// import java.util.*;
//class Solution {
//    public int solution(int[] A) {
//        double minAvg = (A[0] + A[1]) / 2.0;
//        int minStartIndex = 0;
//    
//        for (int i = 2; i < A.length; i++) {
//            double avg = (A[i - 2] + A[i - 1] + A[i]) / 3.0;
//    
//            if (avg < minAvg) {
//                minAvg = avg;
//                minStartIndex = i - 2;
//            }
//    
//            avg = (A[i - 1] + A[i]) / 2.0;
//    
//            if (avg < minAvg) {
//                minAvg = avg;
//                minStartIndex = i - 1;
//            }
//        }
//    
//        return minStartIndex;
//    }
//}
