//public class Solution {
//    public int solution(int A, int B, int K) {
//        int init = 0;
//        for (int i=A; i<=B; i++) {
//            if (i % K == 0) {
//                init = i;
//                break;
//            }
//        }
//
//        if (A==B){
//            if(A%K ==0){
//                return 1;
//            }else{
//                return 0;
//            }
//        }
//        
//        int result = B/K - init/K + 1;
//        
//        return result;
//    }
// } 