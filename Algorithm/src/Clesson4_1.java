//import java.util.*;
//class Solution {
//    public int solution(int X, int[] A) {
//        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
//        int leng = A.length;
//        int count = 0;
//        boolean flag = true;
//        for(int i = 1; i <=X; i++){
//            map.put(i,1);
//        }
//
//        for(int i = 0 ; i < leng;i++){
//            if(map.containsKey(A[i])){
//                map.remove(A[i]);
//            }
//            if(map.size() == 0){
//                flag = false;
//                break;
//            }
//            count++;
//        }
//        if(flag){
//            return -1;
//        }else{
//            return count;
//        }
//    }
//}
