//import java.util.*;
//class Solution {
//    public int solution(String[][] clothes) {
//        Map<String,Integer> map = new HashMap<String,Integer>();
//        
//        for(int i = 0 ; i < clothes.length;i++){
//            if(map.containsKey(clothes[i][1])){
//                int value = map.get(clothes[i][1])+1;
//                map.put(clothes[i][1],value);
//            }else{
//                map.put(clothes[i][1],1);
//            }
//        }
//        int answer = 1;
//        
//        for(int value : map.values()){
//            answer = answer * (value+1);
//        }
//        answer  = answer - 1;
//
//        
//        return answer;
//    }
//}