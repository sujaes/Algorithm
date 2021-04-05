//class Solution {
//    public int solution(int[] stones, int k) {
//        int min = 200000001;
//        int max = 0;
//        for(int i = 0 ; i < stones.length - k +1; i++){
//            max = stones[i];
//            for(int j = 1; j < k; j++){
//                max = Math.max(max,stones[i+j]);
//            }
//            min = Math.min(min,max);
//        }
//
//        return min;
//    }
//}
//
////k개가 연달아 0 -> k수 중 가장 큰거

//import java.util.*;
//
//class Solution {        
//    static int min = 0;
//    static int max = 200000001;
//    public int solution(int[] stones, int k) {
//        int left = min;
//        int right = max;
//        int answer = 0;
//        while (left <= right) {
//            int mid = (left + right) / 2;
//            if (available(mid, stones, k)) {
//                answer = mid;
//                left = mid + 1;
//            } else {
//                right = mid - 1;
//            }
//        }
//        return answer;
//    }
//
//    private boolean available(int count, int[] stones, int k) {
//        int jumpCount = 0;
//        for (int i = 0; i < stones.length && jumpCount < k; i++)
//            if (stones[i] - count < 0){
//                jumpCount++;  
//            } 
//            else{
//                jumpCount = 0;    
//            } 
//        return jumpCount < k;
//    }
//}
