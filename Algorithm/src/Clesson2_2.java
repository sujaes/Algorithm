//import java.util.*;
//class Solution {
//    public int solution(int[] A) {
//        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
//        int res =0;
//        for(int i = 0 ; i < A.length;i++){
//            if(!map.containsKey(A[i])){
//                map.put(A[i],1);
//            }else{
//                int temp = map.get(A[i]);
//                map.remove(A[i]);
//            }
//        }
//        for(Integer i : map.keySet()){
//            res = i;
//        }
//        return res;
//    }
//}