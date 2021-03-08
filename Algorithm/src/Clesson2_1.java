//import java.util.*;
//class Solution {
//    public int[] solution(int[] A, int K) {
//    	//예외처리
//        if (A.length == 0) return A;
// 
//        Deque<Integer> que = new ArrayDeque<Integer>();
// 
//        for (Integer i : A) que.add(i);
// 
//        for(int j=0; j<K; j++) {
//            Integer temp = que.pollLast();
//            que.addFirst(temp);
//        }
//            
//        Object[] obj = que.toArray();
// 
//        int[] result = new int[obj.length];
// 
//        for (int j = 0; j < obj.length; j++) {
//            result[j] = (int) obj[j];
//        }
// 
//        return result;
//    }
//}